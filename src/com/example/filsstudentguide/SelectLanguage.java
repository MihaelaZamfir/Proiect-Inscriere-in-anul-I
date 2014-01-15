package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class SelectLanguage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_language);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_language, menu);
		return true;
	}

	
	public void selectWelcomeRomana(View view) {
	    Intent intent = new Intent(SelectLanguage.this, WelcomeRomana.class);
	    startActivity(intent);
	}
	public void selectWelcomeEngleza(View view) {
	    Intent intent = new Intent(SelectLanguage.this, WelcomeEngleza.class);
	    startActivity(intent);
	}
	public void selectWelcomeFranceza(View view) {
	    Intent intent = new Intent(SelectLanguage.this, WelcomeFranceza.class);
	    startActivity(intent);
	}
	public void selectWelcomeGermana(View view) {
	    Intent intent = new Intent(SelectLanguage.this, WelcomeGermana.class);
	    startActivity(intent);
	}
	public void selectWelcomeTurca(View view) {
	    Intent intent = new Intent(SelectLanguage.this, WelcomeTurca.class);
	    startActivity(intent);
	}
	public void selectWelcomeAraba(View view) {
	    Intent intent = new Intent(SelectLanguage.this, WelcomeAraba.class);
	    startActivity(intent);
	}
}
