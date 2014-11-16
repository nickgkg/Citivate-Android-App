package com.example.citivate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;


public class Setup extends Activity {
	Context c;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setup);
		findViewById(R.id.login).setOnTouchListener(listener);
		c = this;
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		
	}

	View.OnTouchListener listener = new View.OnTouchListener() {
		@Override
		public boolean onTouch(View view, MotionEvent motionEvent) {
			Intent intent = new Intent(c, Login.class);
			startActivity(intent);
			finish();
			return false;
		}
	};
}
