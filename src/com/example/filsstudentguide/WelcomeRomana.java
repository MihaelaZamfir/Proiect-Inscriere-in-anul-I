package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class WelcomeRomana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_romana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome_romana, menu);
		return true;
	}
	
	public void WelcomeDespreRomana(View view) {
	    Intent intent = new Intent(WelcomeRomana.this, DespreRomana.class);
	    startActivity(intent);
	}
	public void WelcomeAdmitereRomana(View view) {
	    Intent intent = new Intent(WelcomeRomana.this, AdmitereRomana.class);
	    startActivity(intent);
	}
	public void WelcomeOrientareRomana(View view) {
	    Intent intent = new Intent(WelcomeRomana.this, OrientareRomana.class);
	    startActivity(intent);
	}
	public void WelcomeTimpRomana(View view) {
	    Intent intent = new Intent(WelcomeRomana.this, TimpRomana.class);
	    startActivity(intent);
	}
	public void WelcomeAlteleRomana(View view) {
	    Intent intent = new Intent(WelcomeRomana.this, AlteleRomana.class);
	    startActivity(intent);
	}
	

}
