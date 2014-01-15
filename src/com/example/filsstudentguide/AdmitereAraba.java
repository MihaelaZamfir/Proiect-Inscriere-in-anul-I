package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AdmitereAraba extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admitere_araba);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.admitere_araba, menu);
		return true;
	}
	public void AdmitereSecretariatAraba(View view) {
	    Intent intent = new Intent(AdmitereAraba.this, SecretariatAraba.class);
	    startActivity(intent);
	}
	
	public void AdmitereSubiecte(View view) {
	    Intent intent = new Intent(AdmitereAraba.this, SubiecteAnterioare.class);
	    startActivity(intent);
	}
	
	public void AdmitereActeTaxeAraba(View view) {
	    Intent intent = new Intent(AdmitereAraba.this, ActeTaxeAraba.class);
	    startActivity(intent);
	}
}
