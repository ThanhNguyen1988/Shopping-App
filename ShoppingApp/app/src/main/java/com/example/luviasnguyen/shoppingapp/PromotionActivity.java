package com.example.luviasnguyen.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class PromotionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion);
        Log.i("PromotionActivity", "now running onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("PromotionActivity", "now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("PromotionActivity", "now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("PromotionActivity", "now running onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("PromotionActivity", "now running onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("PromotionActivity", "now running onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("PromotionActivity", "now running onDestroy");
    }

    public void onClickClothingItem1(View view) {
        Intent i = new Intent(this, Clothing1DetailsActivity.class);
        startActivity(i);
    }

    public void onClickShoesItem1(View view) {
        Intent i = new Intent(this, Shoes1DetailsActivity.class);
        startActivity(i);
    }
}
