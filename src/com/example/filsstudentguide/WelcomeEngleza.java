package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class WelcomeEngleza extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_engleza);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome_engleza, menu);
		return true;
	}
	
	public void WelcomeDespreEngleza(View view) {
	    Intent intent = new Intent(WelcomeEngleza.this, DespreEngleza.class);
	    startActivity(intent);
	}
	public void WelcomeAdmitereEngleza(View view) {
	    Intent intent = new Intent(WelcomeEngleza.this, AdmitereEngleza.class);
	    startActivity(intent);
	}
	public void WelcomeOrientareEngleza(View view) {
	    Intent intent = new Intent(WelcomeEngleza.this, OrientareEngleza.class);
	    startActivity(intent);
	}
	public void WelcomeTimpEngleza(View view) {
	    Intent intent = new Intent(WelcomeEngleza.this, TimpEngleza.class);
	    startActivity(intent);
	}
	public void WelcomeAlteleEngleza(View view) {
	    Intent intent = new Intent(WelcomeEngleza.this, AlteleEngleza.class);
	    startActivity(intent);
	}

}
