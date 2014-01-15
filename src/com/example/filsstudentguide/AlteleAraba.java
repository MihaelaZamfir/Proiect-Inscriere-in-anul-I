package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AlteleAraba extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_altele_araba);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.altele_araba, menu);
		return true;
	}
	public void AlteleBurseAraba(View view) {
	    Intent intent = new Intent(AlteleAraba.this, BurseAraba.class);
	    startActivity(intent);
	}
	
	public void AlteleRestanteAraba(View view) {
	    Intent intent = new Intent(AlteleAraba.this, RestanteAraba.class);
	    startActivity(intent);
	}
	
	public void AlteleRegulamentAraba(View view) {
	    Intent intent = new Intent(AlteleAraba.this, RegulamentUPB.class);
	    startActivity(intent);
	}
	
	public void AlteleContactAraba(View view) {
	    Intent intent = new Intent(AlteleAraba.this, ContactAraba.class);
	    startActivity(intent);
	}
}
