package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class WelcomeTurca extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_turca);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome_turca, menu);
		return true;
	}
	public void WelcomeDespreTurca(View view) {
	    Intent intent = new Intent(WelcomeTurca.this, DespreTurca.class);
	    startActivity(intent);
	}
	public void WelcomeAdmitereTurca(View view) {
	    Intent intent = new Intent(WelcomeTurca.this, AdmitereTurca.class);
	    startActivity(intent);
	}
	public void WelcomeOrientareTurca(View view) {
	    Intent intent = new Intent(WelcomeTurca.this, OrientareTurca.class);
	    startActivity(intent);
	}
	public void WelcomeTimpTurca(View view) {
	    Intent intent = new Intent(WelcomeTurca.this, TimpTurca.class);
	    startActivity(intent);
	}
	public void WelcomeAlteleTurca(View view) {
	    Intent intent = new Intent(WelcomeTurca.this, AlteleTurca.class);
	    startActivity(intent);
	}
	
}
