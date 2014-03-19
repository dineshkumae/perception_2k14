package com.example.perception2k14;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class You extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yout);
		WebView myWebView2 = (WebView) findViewById(R.id.you12);
		myWebView2.loadUrl("http://www.youtube.com/watch?v=1PWvdL48G8c");
		myWebView2.setWebViewClient(new WebViewClient());
	}



}
