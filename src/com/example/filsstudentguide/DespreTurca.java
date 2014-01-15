package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class DespreTurca extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_despre_turca);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.despre_turca, menu);
		return true;
	}

	public void DespreEngTurca(View view) {
	    Intent intent = new Intent(DespreTurca.this, FilEngTurca.class);
	    startActivity(intent);
	}
	

	public void DespreFrancTurca(View view) {
	    Intent intent = new Intent(DespreTurca.this, FilFrancTurca.class);
	    startActivity(intent);
	}
	

	public void DespreGermTurca(View view) {
	    Intent intent = new Intent(DespreTurca.this, FilGermTurca.class);
	    startActivity(intent);
	}
	
	public void DespreAsociatiiTurca(View view) {
	    Intent intent = new Intent(DespreTurca.this, AsociatiiTurca.class);
	    startActivity(intent);
	}

}
