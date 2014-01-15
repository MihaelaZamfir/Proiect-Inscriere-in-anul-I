package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class DespreFranceza extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_despre_franceza);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.despre_franceza, menu);
		return true;
	}
	

	public void DespreEngFranceza(View view) {
	    Intent intent = new Intent(DespreFranceza.this, FilEngFranceza.class);
	    startActivity(intent);
	}
	

	public void DespreFrancFranceza(View view) {
	    Intent intent = new Intent(DespreFranceza.this, FilFrancFranceza.class);
	    startActivity(intent);
	}
	

	public void DespreGermFranceza(View view) {
	    Intent intent = new Intent(DespreFranceza.this, FilGermFranceza.class);
	    startActivity(intent);
	}
	
	public void DespreAsociatiiFranceza(View view) {
	    Intent intent = new Intent(DespreFranceza.this, AsociatiiFranceza.class);
	    startActivity(intent);
	}

}
