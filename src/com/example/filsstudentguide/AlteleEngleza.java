package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AlteleEngleza extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_altele_engleza);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.altele_engleza, menu);
		return true;
	}
	
	public void AlteleBurseEngleza(View view) {
	    Intent intent = new Intent(AlteleEngleza.this, BurseEngleza.class);
	    startActivity(intent);
	}
	
	public void AlteleRestanteEngleza(View view) {
	    Intent intent = new Intent(AlteleEngleza.this, RestanteEngleza.class);
	    startActivity(intent);
	}
	
	public void AlteleRegulamentEngleza(View view) {
	    Intent intent = new Intent(AlteleEngleza.this, RegulamentUPB.class);
	    startActivity(intent);
	}
	
	public void AlteleContactEngleza(View view) {
	    Intent intent = new Intent(AlteleEngleza.this, ContactEngleza.class);
	    startActivity(intent);
	}

}
