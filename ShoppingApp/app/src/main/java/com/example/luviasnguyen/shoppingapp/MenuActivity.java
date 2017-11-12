package com.example.luviasnguyen.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Log.i("MenuActivity","now running onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MenuActivity","now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MenuActivity","now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MenuActivity","now running onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MenuActivity","now running onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MenuActivity","now running onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MenuActivity","now running onDestroy");
    }

    public void onClickClothingList(View view){
        Intent i = new Intent(this,ClothingListActivity.class);
        startActivity(i);
    }

    public void onClickComputerList(View view){
        Intent i = new Intent(this,ComputersListActivity.class);
        startActivity(i);
    }

    public void onClickShoesList(View view){
        Intent i = new Intent(this,ShoesListActivity.class);
        startActivity(i);
    }
    public void onClickBeautyList(View view){
        Intent i = new Intent(this,BeautyListActivity.class);
        startActivity(i);
    }

    public void onClickPhoneList(View view){
        Intent i = new Intent(this,PhoneAccessoryListActivity.class);
        startActivity(i);
    }

    public void onClickApplianceList(View view){
        Intent i = new Intent(this,ApplianceListActivity.class);
        startActivity(i);
    }
}
