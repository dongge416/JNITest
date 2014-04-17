package com.don.jnitest;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.i("", "相加------->"+add(1, 2));
		
	}

    static {
        System.loadLibrary("AddUtil");
    }

    public native int add(int x , int y);
    
}
