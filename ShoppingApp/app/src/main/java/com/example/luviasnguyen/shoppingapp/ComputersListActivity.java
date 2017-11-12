package com.example.luviasnguyen.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ComputersListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computers_list);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ComputersListActivity","now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ComputersListActivity","now running onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ComputersListActivity","now running onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ComputersListActivity","now running onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ComputersListActivity","now running onDestroy");
    }
    public void btnComputerItem1Details(View view){
        Intent i = new Intent(this,Computer1DetailsActivity.class);
        startActivity(i);
    }

}
