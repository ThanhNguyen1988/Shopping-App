package com.example.luviasnguyen.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ShoesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes_list);
        Log.i("ShoesListActivity","now running onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ShoesListActivity","now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ShoesListActivity","now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ShoesListActivity","now running onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ShoesListActivity","now running onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ShoesListActivity","now running onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ShoesListActivity","now running onDestroy");
    }

    public void btnShoesItem1Details(View view){
        Intent i = new Intent(this,Shoes1DetailsActivity.class);
        startActivity(i);
    }
}
