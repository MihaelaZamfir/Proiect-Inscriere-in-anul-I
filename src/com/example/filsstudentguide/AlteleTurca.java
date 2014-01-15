package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AlteleTurca extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_altele_turca);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.altele_turca, menu);
		return true;
	}
	public void AlteleBurseTurca(View view) {
	    Intent intent = new Intent(AlteleTurca.this, BurseTurca.class);
	    startActivity(intent);
	}
	
	public void AlteleRestanteTurca(View view) {
	    Intent intent = new Intent(AlteleTurca.this, RestanteTurca.class);
	    startActivity(intent);
	}
	
	public void AlteleRegulamentTurca(View view) {
	    Intent intent = new Intent(AlteleTurca.this, RegulamentUPB.class);
	    startActivity(intent);
	}
	
	public void AlteleContactTurca(View view) {
	    Intent intent = new Intent(AlteleTurca.this, ContactTurca.class);
	    startActivity(intent);
	}
}
