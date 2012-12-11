package com.kristyandkyle.secretsanta.activities;

import com.kristyandkyle.secretsanta.R;
import com.kristyandkyle.secretsanta.SecretSantaApplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {
	
	private String authURL = "https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.profile&state=profile&redirect_uri=http://localhost&response_type=code&client_id=1073185842577.apps.googleusercontent.com";
	private SecretSantaApplication app;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		app = (SecretSantaApplication) getApplicationContext();
		
		Button btnLoginGoogle = (Button) findViewById(R.id.btnLoginGoogle);
		btnLoginGoogle.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				launchWebViewActivity();
			}
		});
	}

	protected void launchWebViewActivity() {
		Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
		intent.setData(Uri.parse(authURL));
		startActivityForResult(intent, 0);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
			case 0:
				if (resultCode != RESULT_OK || data == null) {
					return;
				}
				
				String code = data.getStringExtra("code");
				if (code != null) {
					app.setCode(code);
					Intent intent = new Intent(getApplicationContext(), MainActivity.class);
					startActivity(intent);
					finish();
				}
			
			return;
		}
		
		super.onActivityResult(requestCode, resultCode, data);
	}

}
