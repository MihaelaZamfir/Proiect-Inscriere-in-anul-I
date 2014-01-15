package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AlteleGermana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_altele_germana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.altele_germana, menu);
		return true;
	}

	public void AlteleBurseGermana(View view) {
	    Intent intent = new Intent(AlteleGermana.this, BurseGermana.class);
	    startActivity(intent);
	}
	
	public void AlteleRestanteGermana(View view) {
	    Intent intent = new Intent(AlteleGermana.this, RestanteGermana.class);
	    startActivity(intent);
	}
	
	public void AlteleRegulamentGermana(View view) {
	    Intent intent = new Intent(AlteleGermana.this, RegulamentUPB.class);
	    startActivity(intent);
	}
	
	public void AlteleContactGermana(View view) {
	    Intent intent = new Intent(AlteleGermana.this, ContactGermana.class);
	    startActivity(intent);
	}
	
}
