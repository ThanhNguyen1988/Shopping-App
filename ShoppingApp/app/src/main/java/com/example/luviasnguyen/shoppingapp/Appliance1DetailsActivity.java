package com.example.luviasnguyen.shoppingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Appliance1DetailsActivity extends AppCompatActivity {

    private int itemQuantity = 0;
    private double price = 118.80;
    private double totalAmount = 0.0;
    String warningQuantity="";
    boolean invalidPurchasing=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliance1_details);
        Log.i("Appliance1Activity","now running onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Appliance1Activity","now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Appliance1Activity","now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Appliance1Activity","now running onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Appliance1Activity","now running onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Appliance1Activity","now running onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Appliance1Activity","now running onDestroy");
    }


    //This function is used for decreasing the number of item's quantity
    public void onClickMinusQuantity(View view){
        if (itemQuantity>0) {
            itemQuantity -= 1;
        }
        displayQuantity(itemQuantity);
        displayTotalAmountOfMoney(itemQuantity);
    }

    //This function is used for increasing the number of item's quantity
    public void onClickAddQuantity(View view){
        itemQuantity += 1;
        displayQuantity(itemQuantity);
        displayTotalAmountOfMoney(itemQuantity);
    }

    //This function is used for showing the message to let user knowing whether the purchasing items is successful or not
    public void onClickBuyNow(View view){

        if (itemQuantity==0){
            invalidPurchasing = true;
            warningQuantity = "Please choose the quantity of the item\n";
        }else{
            warningQuantity= "" ;
        }
        // if the process is not completed successfully, the warning message will be display
        if (invalidPurchasing==true){

            Toast.makeText(this,warningQuantity ,Toast.LENGTH_LONG).show();
            invalidPurchasing=false;

        }else{

            Toast.makeText(this,"Ordering Successfully.\n Thank you so much!" ,Toast.LENGTH_LONG).show();
            // show the purchasing information on the textView
            TextView displaySummaryPayment = (TextView) findViewById(R.id.textView_Display_SummaryPayment);
            displaySummaryPayment.setText("You have ordered " + itemQuantity + " set of items" );
        }
    }

    // This function is used to calculate and display the total amount of money
    public void displayTotalAmountOfMoney(int itemQuantity){
        totalAmount = itemQuantity * price;
        TextView textView = (TextView) findViewById(R.id.textView_total_payment);
        textView.setText("$ " + totalAmount);
    }

    //This function is used for displaying the item's quantity on textView
    private void displayQuantity(int number){
        //Find a reference to the TextView in the layout
        TextView textView = (TextView) findViewById(R.id.textView_show_quanity);
        textView.setText("" + number);
    }

}
