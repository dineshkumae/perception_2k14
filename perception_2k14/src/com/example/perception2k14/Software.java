package com.example.perception2k14;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Software extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.software);
		Button ba1=(Button)findViewById(R.id.button1);
		Button ba2=(Button)findViewById(R.id.button2);
		Button ba3=(Button)findViewById(R.id.button3);
		Button ba4=(Button)findViewById(R.id.button4);
		Button ba5=(Button)findViewById(R.id.button5);
		Button ba6=(Button)findViewById(R.id.button6);
		Button ba7=(Button)findViewById(R.id.button7);
		ba1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent strt1=new Intent("com.example.perception2k14.QTECH");
				startActivity(strt1);
			}
		});
ba2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent strt2=new Intent("com.example.perception2k14.CODE");
				startActivity(strt2);
			}
		});
ba3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent strt3=new Intent("com.example.perception2k14.ADI");
		startActivity(strt3);
	}
});
ba4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent strt4=new Intent("com.example.perception2k14.WEB");
		startActivity(strt4);
	}
});
ba5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent strt5=new Intent("com.example.perception2k14.APP");
		startActivity(strt5);
	}
});
ba6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent strt6=new Intent("com.example.perception2k14.PAPER");
		startActivity(strt6);
	}
});
ba7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent strt7=new Intent("com.example.perception2k14.CAMPUS");
		startActivity(strt7);
	}
});
		
		
	}

}
