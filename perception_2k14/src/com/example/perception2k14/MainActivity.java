package com.example.perception2k14;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	MediaPlayer cet;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		cet=MediaPlayer.create(MainActivity.this, R.raw.music);
		cet.start();
		Thread timer =new Thread(){
			
			public void run(){
			try{
				sleep(3000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}finally{
				Intent start1=new Intent ("com.example.perception2k14.ROB");
				startActivity(start1);
			}
			}
		};timer.start();
	}

	

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		cet.release();
	}


}
