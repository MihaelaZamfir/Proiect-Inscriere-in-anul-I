package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FilFrancGermana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fil_franc_germana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fil_franc_germana, menu);
		return true;
	}

}
