package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AdmitereEngleza extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admitere_engleza);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.admitere_engleza, menu);
		return true;
	}
	
	public void AdmitereSecretariatEngleza(View view) {
	    Intent intent = new Intent(AdmitereEngleza.this, SecretariatEngleza.class);
	    startActivity(intent);
	}
	
	public void AdmitereSubiecte(View view) {
	    Intent intent = new Intent(AdmitereEngleza.this, SubiecteAnterioare.class);
	    startActivity(intent);
	}
	
	public void AdmitereActeTaxeEngleza(View view) {
	    Intent intent = new Intent(AdmitereEngleza.this, ActeTaxeEngleza.class);
	    startActivity(intent);
	}

}
