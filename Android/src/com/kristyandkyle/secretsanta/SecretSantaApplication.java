package com.kristyandkyle.secretsanta;

import android.app.Application;
import android.content.SharedPreferences;

public class SecretSantaApplication extends Application {
	
	public static final String PREFS_NAME = "SecretSantaPrefs";
	
	public boolean isAuthenticated() {
		SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
		String code = prefs.getString("code", "");
		
		if (code.equals("")) {
			return false;
		}
		
		return true;
	}
	
	public void setCode(String code) {
		SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString("code", code);
		editor.commit();
	}
	
}
