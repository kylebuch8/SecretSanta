package com.kristyandkyle.secretsanta.activities;

import com.kristyandkyle.secretsanta.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
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
		startActivity(intent);
	}

}
