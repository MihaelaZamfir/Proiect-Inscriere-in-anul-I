package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class WelcomeFranceza extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_franceza);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome_franceza, menu);
		return true;
	}
	public void WelcomeDespreFranceza(View view) {
	    Intent intent = new Intent(WelcomeFranceza.this, DespreFranceza.class);
	    startActivity(intent);
	}
	public void WelcomeAdmitereFranceza(View view) {
	    Intent intent = new Intent(WelcomeFranceza.this, AdmitereFranceza.class);
	    startActivity(intent);
	}
	public void WelcomeOrientareFranceza(View view) {
	    Intent intent = new Intent(WelcomeFranceza.this, OrientareFranceza.class);
	    startActivity(intent);
	}
	public void WelcomeTimpFranceza(View view) {
	    Intent intent = new Intent(WelcomeFranceza.this, TimpFranceza.class);
	    startActivity(intent);
	}
	public void WelcomeAlteleFranceza(View view) {
	    Intent intent = new Intent(WelcomeFranceza.this, AlteleFranceza.class);
	    startActivity(intent);
	}
	
	
}
