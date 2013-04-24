package com.flipkart;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Content extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_content, menu);
        return true;
    }
}
