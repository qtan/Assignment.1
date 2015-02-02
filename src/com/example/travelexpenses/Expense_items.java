package com.example.travelexpenses;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Expense_items extends Activity {
	private Button AddButton;
	private Button EditButton;
	private Button DeleteButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.expense_items);
		AddButton = (Button)findViewById(R.id.AddButton0);
		AddButton.setOnClickListener(listener);
		EditButton = (Button)findViewById(R.id.EditButton0);
		EditButton.setOnClickListener(listener);
		DeleteButton = (Button)findViewById(R.id.DeleteButton0);
		DeleteButton.setOnClickListener(listener);
	}
	private View.OnClickListener listener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Button button= (Button)v;
			switch (button.getId()){
			//add new one jump to a new page
			case R.id.AddButton0:
			Intent Expensesact =new Intent();
			Expensesact.setClass(Expense_items.this,Add_items_List.class);
			Expense_items.this.startActivity(Expensesact);
			break;
			//delete the exist items
			case R.id.DeleteButton0:
			break;
			//Edit the exist items
			case R.id.EditButton0:
			break;
				
			}
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.expense_items, menu);
		return true;
	}


}
