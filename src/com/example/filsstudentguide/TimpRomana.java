package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class TimpRomana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timp_romana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.timp_romana, menu);
		return true;
	}
	
	public void TimpRegieRomana(View view) {
	    Intent intent = new Intent(TimpRomana.this, RegieRomana.class);
	    startActivity(intent);
	}
	
	public void TimpCentruRomana(View view) {
	    Intent intent = new Intent(TimpRomana.this, CentruRomana.class);
	    startActivity(intent);
	}
	
	public void TimpMuzeeRomana(View view) {
	    Intent intent = new Intent(TimpRomana.this, MuzeeRomana.class);
	    startActivity(intent);
	}

}
