package com.kristyandkyle.secretsanta.activities;

import com.example.android.actionbarcompat.ActionBarActivity;
import com.kristyandkyle.secretsanta.SecretSantaApplication;

import android.content.Intent;
import android.os.Bundle;

public class AuthenticatedActivity extends ActionBarActivity {

	private SecretSantaApplication app;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		app = (SecretSantaApplication) getApplicationContext();
	}

	@Override
	protected void onResume() {
		super.onResume();
		
		if (!app.isAuthenticated()) {
			Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
			startActivity(intent);
			finish();
		}
	}	

}
