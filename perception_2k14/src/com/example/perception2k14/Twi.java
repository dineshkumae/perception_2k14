package com.example.perception2k14;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Twi extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.twit);
		WebView myWebView3 = (WebView) findViewById(R.id.twit12);
		myWebView3.loadUrl("https://twitter.com/Xtasy2k14");
		myWebView3.setWebViewClient(new WebViewClient());
	}



}
