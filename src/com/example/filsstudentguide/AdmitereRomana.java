package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AdmitereRomana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admitere_romana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.admitere_romana, menu);
		return true;
	}
	
	public void AdmitereSecretariatRomana(View view) {
	    Intent intent = new Intent(AdmitereRomana.this, SecretariatRomana.class);
	    startActivity(intent);
	}
	
	public void AdmitereSubiecte(View view) {
	    Intent intent = new Intent(AdmitereRomana.this, SubiecteAnterioare.class);
	    startActivity(intent);
	}
	
	public void AdmitereActeTaxeRomana(View view) {
	    Intent intent = new Intent(AdmitereRomana.this, ActeTaxeRomana.class);
	    startActivity(intent);
	}

}
