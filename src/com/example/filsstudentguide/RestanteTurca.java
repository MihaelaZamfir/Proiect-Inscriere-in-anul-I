package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RestanteTurca extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_restante_turca);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.restante_turca, menu);
		return true;
	}

}
