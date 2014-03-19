package com.example.perception2k14;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Rob extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rob);
		Thread timer1 =new Thread(){
			
			public void run(){
			try{
				sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}finally{
				Intent start2=new Intent ("com.example.perception2k14.SOB");
				startActivity(start2);
			}
			}
		};timer1.start();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
