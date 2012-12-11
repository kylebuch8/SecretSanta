package com.kristyandkyle.secretsanta.utils;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public abstract class TabHelper {
	
	protected FragmentActivity mActivity;
	
	protected TabHelper(FragmentActivity activity) {
		mActivity = activity;
	}
	
	public static TabHelper createInstance(FragmentActivity activity) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			return new TabHelperHoneycomb(activity);
		} else {
			return new TabHelperEclair(activity);
		}
	}
	
	
	public CompatTab newTab(String tag) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			return new CompatTabHoneycomb(mActivity, tag);
		} else {
			return new CompatTabEclair(mActivity, tag);
		}
	}
	
	public abstract void addTab(CompatTab tab);
	
	protected abstract void onSaveInstanceState(Bundle outState);
	
	protected abstract void onRestoreInstanceState(Bundle savedInstanceState);
	
	protected abstract void setUp();
}
