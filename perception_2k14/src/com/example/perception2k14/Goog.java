package com.example.perception2k14;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Goog extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.goo);
		WebView myWebView4 = (WebView) findViewById(R.id.goo12);
		myWebView4.loadUrl("https://plus.google.com/116239774475354874353/posts");
		myWebView4.setWebViewClient(new WebViewClient());	
	}

}


