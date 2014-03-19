package com.example.perception2k14;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Robotics extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.robotics);
		Button bb1=(Button)findViewById(R.id.res);
		Button bb2=(Button)findViewById(R.id.str);
		Button bb3=(Button)findViewById(R.id.movi);
		Button bb4=(Button)findViewById(R.id.acce);
		Button bb5=(Button)findViewById(R.id.cet);
		
		bb1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent starr1=new Intent("com.example.perception2k14.RES");
				startActivity(starr1);
			}
		});
bb2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent starr2=new Intent("com.example.perception2k14.STR");
				startActivity(starr2);
			}
		});
bb3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent starr3=new Intent("com.example.perception2k14.MOVI");
		startActivity(starr3);
	}
});
bb4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent starr4=new Intent("com.example.perception2k14.ACCE");
		startActivity(starr4);
	}
});
bb5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent starr5=new Intent("com.example.perception2k14.CET");
		startActivity(starr5);
	}
});

	}

}
