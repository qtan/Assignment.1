package com.example.travelexpenses;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ClaimsActivity extends Activity {
	private Button addButton;
	private Button editButton;
	private Button deleteButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.claims);
		addButton = (Button)findViewById(R.id.addButton1);
		addButton.setOnClickListener(listener);
		editButton = (Button)findViewById(R.id.editButton1);
		editButton.setOnClickListener(listener);
		deleteButton = (Button)findViewById(R.id.deleteButton1);
		deleteButton.setOnClickListener(listener);
	}
	private View.OnClickListener listener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Button button= (Button)v;
			switch (button.getId()){
			//add new one jump to a new page
			case R.id.addButton1:
			Intent Claimsact =new Intent();
			Claimsact.setClass(ClaimsActivity.this,Add_claims.class);
			ClaimsActivity.this.startActivity(Claimsact);
			break;
			//delete the exist items
			case R.id.deleteButton1:
				break;
			//Edit the exist items
			case R.id.editButton1:
				break;
				
			}
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cliams, menu);
		return true;
	}

}
