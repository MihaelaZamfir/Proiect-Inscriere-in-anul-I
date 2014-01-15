package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AdmitereGermana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admitere_germana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.admitere_germana, menu);
		return true;
	}
	public void AdmitereSecretariatGermana(View view) {
	    Intent intent = new Intent(AdmitereGermana.this, SecretariatGermana.class);
	    startActivity(intent);
	}
	
	public void AdmitereSubiecte(View view) {
	    Intent intent = new Intent(AdmitereGermana.this, SubiecteAnterioare.class);
	    startActivity(intent);
	}
	
	public void AdmitereActeTaxeGermana(View view) {
	    Intent intent = new Intent(AdmitereGermana.this, ActeTaxeGermana.class);
	    startActivity(intent);
	}

}
