package com.example.travelexpenses;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button expenseitem;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		expenseitem = (Button)findViewById(R.id.Button1);
		expenseitem.setOnClickListener(listener);
		expenseitem = (Button)findViewById(R.id.button2);
		expenseitem.setOnClickListener(listener);
	}
	
	private View.OnClickListener listener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Button button = (Button)v;
			switch (button.getId()){
			//###when user click Expense items it will jump to an new interface for people 
			//to add,edit and delete items
			case R.id.Button1:
				Intent Add_PageIntent = new Intent();
				Add_PageIntent.setClass(MainActivity.this, Expense_items.class);
				MainActivity.this.startActivity(Add_PageIntent);
				break;
			//when user click Claim, it shows a new page for people to choose options
			case R.id.button2:
				Intent Add_PageIntent2 = new Intent();
				Add_PageIntent2.setClass(MainActivity.this, ClaimsActivity.class);
				MainActivity.this.startActivity(Add_PageIntent2);
				break;
				
			}
				
		}
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

