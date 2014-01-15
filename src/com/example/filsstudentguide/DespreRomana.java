package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class DespreRomana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_despre_romana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.despre_romana, menu);
		return true;
	}
	

	public void DespreEngRomana(View view) {
	    Intent intent = new Intent(DespreRomana.this, FilEngRomana.class);
	    startActivity(intent);
	}
	

	public void DespreFrancRomana(View view) {
	    Intent intent = new Intent(DespreRomana.this, FilFrancRomana.class);
	    startActivity(intent);
	}
	

	public void DespreGermRomana(View view) {
	    Intent intent = new Intent(DespreRomana.this, FilGermRomana.class);
	    startActivity(intent);
	}
	
	public void DespreAsociatiiRomana(View view) {
	    Intent intent = new Intent(DespreRomana.this, AsociatiiRomana.class);
	    startActivity(intent);
	}

}
