package com.kristyandkyle.secretsanta.activities;

import com.kristyandkyle.secretsanta.R;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AuthenticatedActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        
        return super.onCreateOptionsMenu(menu);
    }
}
