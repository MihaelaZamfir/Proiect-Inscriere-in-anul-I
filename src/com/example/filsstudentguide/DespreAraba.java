package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class DespreAraba extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_despre_araba);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.despre_araba, menu);
		return true;
	}
	

	public void DespreEngAraba(View view) {
	    Intent intent = new Intent(DespreAraba.this, FilEngAraba.class);
	    startActivity(intent);
	}
	

	public void DespreFrancAraba(View view) {
	    Intent intent = new Intent(DespreAraba.this, FilFrancAraba.class);
	    startActivity(intent);
	}
	

	public void DespreGermAraba(View view) {
	    Intent intent = new Intent(DespreAraba.this, FilGermAraba.class);
	    startActivity(intent);
	}
	
	public void DespreAsociatiiAraba(View view) {
	    Intent intent = new Intent(DespreAraba.this, AsociatiiAraba.class);
	    startActivity(intent);
	}

}
