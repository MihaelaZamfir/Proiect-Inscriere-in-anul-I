package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AdmitereFranceza extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admitere_franceza);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.admitere_franceza, menu);
		return true;
	}
	public void AdmitereSecretariatFranceza(View view) {
	    Intent intent = new Intent(AdmitereFranceza.this, SecretariatFranceza.class);
	    startActivity(intent);
	}
	
	public void AdmitereSubiecte(View view) {
	    Intent intent = new Intent(AdmitereFranceza.this, SubiecteAnterioare.class);
	    startActivity(intent);
	}
	
	public void AdmitereActeTaxeFranceza(View view) {
	    Intent intent = new Intent(AdmitereFranceza.this, ActeTaxeFranceza.class);
	    startActivity(intent);
	}


}
