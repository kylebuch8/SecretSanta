package com.kristyandkyle.secretsanta.utils;

import android.support.v4.app.FragmentTransaction;

public interface CompatTabListener {

	public void onTabSelected(CompatTab tab, FragmentTransaction ft);
	
	public void onTabUnselected(CompatTab tab, FragmentTransaction ft);
	
	public void onTabReselected(CompatTab tab, FragmentTransaction ft);
	
}
