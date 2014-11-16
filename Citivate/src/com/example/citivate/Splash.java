package com.example.citivate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;


public class Splash extends Activity implements Runnable{
	Context c;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		//findViewById(R.id.dummy_button).setOnTouchListener(listener);
		c = this;
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		new Thread(this).start();
	}

	View.OnTouchListener listener = new View.OnTouchListener() {
		@Override
		public boolean onTouch(View view, MotionEvent motionEvent) {
			Intent intent = new Intent(c, Setup.class);
			startActivity(intent);
			finish();
			return false;
		}
	};

	@Override
	public void run() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		Intent intent = new Intent(c, Setup.class);
		startActivity(intent);
		finish();
	}
}
