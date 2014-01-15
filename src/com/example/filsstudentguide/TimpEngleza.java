package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class TimpEngleza extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timp_engleza);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.timp_engleza, menu);
		return true;
	}
	
	public void TimpRegieEngleza(View view) {
	    Intent intent = new Intent(TimpEngleza.this, RegieEngleza.class);
	    startActivity(intent);
	}
	
	public void TimpCentruEngleza(View view) {
	    Intent intent = new Intent(TimpEngleza.this, CentruEngleza.class);
	    startActivity(intent);
	}
	
	public void TimpMuzeeEngleza(View view) {
	    Intent intent = new Intent(TimpEngleza.this, MuzeeEngleza.class);
	    startActivity(intent);
	}

}
