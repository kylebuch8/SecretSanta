package com.kristyandkyle.secretsanta.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_PROGRESS);
		
		WebView webView = new WebView(this);
		setContentView(webView);
		
		// enable javascript
		webView.getSettings().setJavaScriptEnabled(true);
		
		webView.setWebChromeClient(new WebChromeClient() {

			@Override
			public void onProgressChanged(WebView view, int newProgress) {
				// TODO Auto-generated method stub
				super.onProgressChanged(view, newProgress);
			}
			
		});
		
		webView.setWebViewClient(new WebViewClient() {

			@Override
			public void onPageStarted(WebView view, String url, Bitmap favicon) {
				setTitle(url);
				
				String host = Uri.parse(url).getHost();
				if (host.equalsIgnoreCase("localhost")) {
					String code = Uri.parse(url).getQueryParameter("code");
					
					Intent result = new Intent();
					result.putExtra("code", code);
					setResult(RESULT_OK, result);
					finish();
				}
			}
			
		});
		
		// load the web page
		Intent intent = getIntent();
		if (intent.getData() != null) {
			webView.loadUrl(intent.getDataString());
		}
	}
	
}
