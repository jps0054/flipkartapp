package com.flipkart;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Flipkart extends Activity implements OnClickListener {

	 public WebView mWebview ;
	 Button b1;
	 TextView v;
	 EditText e;
	 String book;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {

	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_flipkart);
	        mWebview  = new WebView(this);
	       b1 = (Button) findViewById(R.id.button1);
	       v = (TextView) findViewById(R.id.textView1);	        
	       e = (EditText) findViewById(R.id.editText1);
	        
	      mWebview.getSettings().setJavaScriptEnabled(true); 
	       b1.setOnClickListener(this);
	        final Activity activity = this;

	        mWebview.setWebViewClient(new WebViewClient() {
	            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
	                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
	                
	       
	            }
	        });    
	    }

		public void onClick(View v) {
			// TODO Auto-generated method stub

				if(R.id.button1 == v.getId()){
					book= e.getText().toString();
			         book = book.replaceAll(" ", "+");
			         setContentView(R.layout.activity_content);
			       mWebview .loadUrl("http://m.flipkart.com/m/m-search-all/searchAll?q="+book+"&otracker=search&submit=");
			       setContentView(mWebview);
			       
				}
				

		}
    }