package com.example.luviasnguyen.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class PhoneAccessoryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_accessory_list);
        Log.i("PhoneListActivity","now running onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("PhoneListActivity","now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("PhoneListActivity","now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("PhoneListActivity","now running onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("PhoneListActivity","now running onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("PhoneListActivity","now running onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("PhoneListActivity","now running onDestroy");
    }
    public void btnPhoneItem1Details(View view){
        Intent i = new Intent(this,Phone1DetailsActivity.class);
        startActivity(i);
    }

}
