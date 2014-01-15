package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class WelcomeAraba extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_araba);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome_araba, menu);
		return true;
	}
	public void WelcomeDespreAraba(View view) {
	    Intent intent = new Intent(WelcomeAraba.this, DespreAraba.class);
	    startActivity(intent);
	}
	public void WelcomeAdmitereAraba(View view) {
	    Intent intent = new Intent(WelcomeAraba.this, AdmitereAraba.class);
	    startActivity(intent);
	}
	public void WelcomeOrientareAraba(View view) {
	    Intent intent = new Intent(WelcomeAraba.this, OrientareAraba.class);
	    startActivity(intent);
	}
	public void WelcomeTimpAraba(View view) {
	    Intent intent = new Intent(WelcomeAraba.this, TimpAraba.class);
	    startActivity(intent);
	}
	public void WelcomeAlteleAraba(View view) {
	    Intent intent = new Intent(WelcomeAraba.this, AlteleAraba.class);
	    startActivity(intent);
	}
	
}
