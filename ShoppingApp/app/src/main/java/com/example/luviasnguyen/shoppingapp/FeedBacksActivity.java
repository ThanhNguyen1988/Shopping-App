package com.example.luviasnguyen.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FeedBacksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_backs);

        TextView txtView = (TextView) findViewById(R.id.textView_FeedBacks);
        Intent intent = this.getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null)
        {
            String getName = (String) bd.getString("name");
            txtView.setText(getName);
        }
    }

}
