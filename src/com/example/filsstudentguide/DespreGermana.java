package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class DespreGermana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_despre_germana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.despre_germana, menu);
		return true;
	}
	

	public void DespreEngGermana(View view) {
	    Intent intent = new Intent(DespreGermana.this, FilEngGermana.class);
	    startActivity(intent);
	}
	

	public void DespreFrancGermana(View view) {
	    Intent intent = new Intent(DespreGermana.this, FilFrancGermana.class);
	    startActivity(intent);
	}
	

	public void DespreGermGermana(View view) {
	    Intent intent = new Intent(DespreGermana.this, FilGermGermana.class);
	    startActivity(intent);
	}
	
	public void DespreAsociatiiGermana(View view) {
	    Intent intent = new Intent(DespreGermana.this, AsociatiiGermana.class);
	    startActivity(intent);
	}

}
