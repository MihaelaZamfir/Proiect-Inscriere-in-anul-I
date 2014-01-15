package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AlteleFranceza extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_altele_franceza);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.altele_franceza, menu);
		return true;
	}
	
	public void AlteleBurseFranceza(View view) {
	    Intent intent = new Intent(AlteleFranceza.this, BurseFranceza.class);
	    startActivity(intent);
	}
	
	public void AlteleRestanteFranceza(View view) {
	    Intent intent = new Intent(AlteleFranceza.this, RestanteFranceza.class);
	    startActivity(intent);
	}
	
	public void AlteleRegulamentFranceza(View view) {
	    Intent intent = new Intent(AlteleFranceza.this, RegulamentUPB.class);
	    startActivity(intent);
	}
	
	public void AlteleContactFranceza(View view) {
	    Intent intent = new Intent(AlteleFranceza.this, ContactFranceza.class);
	    startActivity(intent);
	}
}
