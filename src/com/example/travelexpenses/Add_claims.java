package com.example.travelexpenses;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class Add_claims extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_claims);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_claims, menu);
		return true;
	}
	public void addClaim(View v){
    	Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(Add_claims.this, ClaimsActivity.class);
    	startActivity(intent);
	}

}
