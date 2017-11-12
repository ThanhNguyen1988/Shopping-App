package com.example.luviasnguyen.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ClothingListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing_list);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ClothingListActivity","now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ClothingListActivity","now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ClothingListActivity","now running onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ClothingListActivity","now running onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ClothingListActivity","now running onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ClothingListActivity","now running onDestroy");
    }

    public void btnClothingItem1Details(View view){
        Intent i = new Intent(this,Clothing1DetailsActivity.class);
        startActivity(i);
    }
}
