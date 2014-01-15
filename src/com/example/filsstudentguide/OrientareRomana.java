package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class OrientareRomana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_orientare_romana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.orientare_romana, menu);
		return true;
	}
	
	public void OrientareOrarRomana(View view) {
	    Intent intent = new Intent(OrientareRomana.this, OrarRomana.class);
	    startActivity(intent);
	}
	
	public void OrientareHarta(View view) {
	    Intent intent = new Intent(OrientareRomana.this, Harta.class);
	    startActivity(intent);
	}
	
	public void OrientareAcces(View view) {
	    Intent intent = new Intent(OrientareRomana.this, Acces.class);
	    startActivity(intent);
	}

}
