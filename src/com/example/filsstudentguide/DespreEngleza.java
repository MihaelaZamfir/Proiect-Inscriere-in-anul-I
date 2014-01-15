package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class DespreEngleza extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_despre_engleza);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.despre_engleza, menu);
		return true;
	}

	public void DespreEngEngleza(View view) {
	    Intent intent = new Intent(DespreEngleza.this, FilEngEngleza.class);
	    startActivity(intent);
	}
	

	public void DespreFrancEngleza(View view) {
	    Intent intent = new Intent(DespreEngleza.this, FilFrancEngleza.class);
	    startActivity(intent);
	}
	

	public void DespreGermEngleza(View view) {
	    Intent intent = new Intent(DespreEngleza.this, FilGermEngleza.class);
	    startActivity(intent);
	}
	
	public void DespreAsociatiiEngleza(View view) {
	    Intent intent = new Intent(DespreEngleza.this, AsociatiiEngleza.class);
	    startActivity(intent);
	}
}
