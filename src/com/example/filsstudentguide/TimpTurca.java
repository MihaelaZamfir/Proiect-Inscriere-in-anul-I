package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class TimpTurca extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timp_turca);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.timp_turca, menu);
		return true;
	}
	public void TimpRegieTurca(View view) {
	    Intent intent = new Intent(TimpTurca.this, RegieTurca.class);
	    startActivity(intent);
	}
	
	public void TimpCentruTurca(View view) {
	    Intent intent = new Intent(TimpTurca.this, CentruTurca.class);
	    startActivity(intent);
	}
	
	public void TimpMuzeeTurca(View view) {
	    Intent intent = new Intent(TimpTurca.this, MuzeeTurca.class);
	    startActivity(intent);
	}
}
