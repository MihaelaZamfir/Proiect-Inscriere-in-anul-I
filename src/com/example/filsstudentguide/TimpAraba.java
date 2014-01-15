package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class TimpAraba extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timp_araba);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.timp_araba, menu);
		return true;
	}
	public void TimpRegieAraba(View view) {
	    Intent intent = new Intent(TimpAraba.this, RegieAraba.class);
	    startActivity(intent);
	}
	
	public void TimpCentruAraba(View view) {
	    Intent intent = new Intent(TimpAraba.this, CentruRomana.class);
	    startActivity(intent);
	}
	
	public void TimpMuzeeAraba(View view) {
	    Intent intent = new Intent(TimpAraba.this, MuzeeAraba.class);
	    startActivity(intent);
	}
}
