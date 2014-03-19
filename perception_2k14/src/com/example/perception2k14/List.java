package com.example.perception2k14;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class List extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		Button b1=(Button) findViewById(R.id.button1);
		Button b2=(Button) findViewById(R.id.button2);
		ImageButton b3=(ImageButton) findViewById(R.id.imageButton1);
		ImageButton b4=(ImageButton) findViewById(R.id.imageButton2);
		ImageButton b5=(ImageButton) findViewById(R.id.imageButton3);
		ImageButton b6=(ImageButton) findViewById(R.id.imageButton4);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent star1=new Intent("com.example.perception2k14.ROBOTICS");
				startActivity(star1);
			}
		});
b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent star2=new Intent("com.example.perception2k14.SOFTWARE");
				startActivity(star2);
			}
		});
b3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent star3=new Intent("com.example.perception2k14.FACE");
		startActivity(star3);
	}
});
b4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent star4=new Intent("com.example.perception2k14.YOU");
		startActivity(star4);
	}
});
b5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent star5=new Intent("com.example.perception2k14.TWI");
		startActivity(star5);
	}
});
b6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent star6=new Intent("com.example.perception2k14.GOOG");
		startActivity(star6);
	}
});
		
		
	}
	}
	
	
	

