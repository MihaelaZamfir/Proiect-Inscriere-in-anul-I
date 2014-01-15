package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AlteleRomana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_altele_romana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.altele_romana, menu);
		return true;
	}

	public void AlteleBurseRomana(View view) {
	    Intent intent = new Intent(AlteleRomana.this, BurseRomana.class);
	    startActivity(intent);
	}
	
	public void AlteleRestanteRomana(View view) {
	    Intent intent = new Intent(AlteleRomana.this, RestanteRomana.class);
	    startActivity(intent);
	}
	
	public void AlteleRegulamentRomana(View view) {
	    Intent intent = new Intent(AlteleRomana.this, RegulamentUPB.class);
	    startActivity(intent);
	}
	
	public void AlteleContactRomana(View view) {
	    Intent intent = new Intent(AlteleRomana.this, ContactRomana.class);
	    startActivity(intent);
	}
}
