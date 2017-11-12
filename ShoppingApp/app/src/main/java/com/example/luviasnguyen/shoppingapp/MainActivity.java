package com.example.luviasnguyen.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "now running onCreate");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "now running onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "now running onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity", "now running onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "now running onDestroy");
    }

    public void onClickMenu(View view) {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }

    public void btnClothingItem1Details(View view) {
        Intent i = new Intent(this, Clothing1DetailsActivity.class);
        startActivity(i);
    }

    public void btnShoesItem1Details(View view) {
        Intent i = new Intent(this, Shoes1DetailsActivity.class);
        startActivity(i);
    }

    public void btnApplianceItem1Details(View view) {
        Intent i = new Intent(this, Appliance1DetailsActivity.class);
        startActivity(i);
    }

    public void btnPhoneItem1Details(View view) {
        Intent i = new Intent(this, Phone1DetailsActivity.class);
        startActivity(i);
    }

    public void btnComputerItem1Details(View view) {
        Intent i = new Intent(this, Computer1DetailsActivity.class);
        startActivity(i);
    }

    public void btnBeautyItem1Details(View view) {
        Intent i = new Intent(this, Beauty1DetailsActivity.class);
        startActivity(i);
    }

    public void onClickPromotion(View view){
        Intent i = new Intent(this,PromotionActivity.class);
        startActivity(i);
    }
}
