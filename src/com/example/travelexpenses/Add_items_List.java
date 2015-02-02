package com.example.travelexpenses;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class Add_items_List extends Activity {
	private Button Savei;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_items__list);
		Savei = (Button)findViewById(R.id.saveButton1);
		Savei.setOnClickListener(listener);
	}
	private View.OnClickListener listener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Add_PageIntent = new Intent();
			Add_PageIntent.setClass(Add_items_List.this, Expense_items.class);
			Add_items_List.this.startActivity(Add_PageIntent);
		}
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_items__list, menu);
		return true;
	}

}
