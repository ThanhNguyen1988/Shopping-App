package com.example.luviasnguyen.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ApplianceListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliance_list);
        Log.i("ApplianceListActivity","now running onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ApplianceListActivity","now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ApplianceListActivity","now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ApplianceListActivity","now running onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ApplianceListActivity","now running onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ApplianceListActivity","now running onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ApplianceListActivity","now running onDestroy");
    }

    public void btnApplianceItem1Details(View view){
        Intent i = new Intent(this,Appliance1DetailsActivity.class);
        startActivity(i);
    }
}
