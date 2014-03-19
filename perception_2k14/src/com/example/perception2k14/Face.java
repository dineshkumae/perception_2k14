package com.example.perception2k14;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Face extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.face);
		WebView myWebView1 = (WebView) findViewById(R.id.face12);
		myWebView1.loadUrl("http://www.facebook.com/Xtasy2K14");
		myWebView1.setWebViewClient(new WebViewClient());
	}

}
