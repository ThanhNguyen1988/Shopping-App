package com.example.luviasnguyen.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Clothing1DetailsActivity extends AppCompatActivity {
    private int itemQuantity = 0;
    private double price = 100.80;
    private double totalAmount = 0.0;
    String colorItem = "";
    String warningSize = "";
    String warningCountry = "";
    String warningColor = "";
    String warningQuantity = "";
    boolean invalidPurchasing = false;
    CheckBox blueCheckBox, blackCheckBox, yellowCheckBox, itemSize, itemCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing1_details);
        Log.i("Clothing1Activity", "now running onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Clothing1Activity", "now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Clothing1Activity", "now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Clothing1Activity", "now running onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Clothing1Activity", "now running onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Clothing1Activity", "now running onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Clothing1Activity", "now running onDestroy");
    }

    //This function is used for decreasing the number of item's quantity
    public void onClickMinusQuantity(View view) {
        if (itemQuantity > 0) {
            itemQuantity -= 1;
        }
        displayQuantity(itemQuantity);
        displayTotalAmountOfMoney(itemQuantity);
    }

    //This function is used for increasing the number of item's quantity
    public void onClickAddQuantity(View view) {
        itemQuantity += 1;
        displayQuantity(itemQuantity);
        displayTotalAmountOfMoney(itemQuantity);
    }

    //This function is used for showing the message to let user knowing whether the purchasing items is successful or not
    public void onClickBuyNow(View view) {

        // Check the status of the checkboxes
        blueCheckBox = (CheckBox) findViewById(R.id.checkbox_blue_color);
        blackCheckBox = (CheckBox) findViewById(R.id.checkbox_black_color);
        yellowCheckBox = (CheckBox) findViewById(R.id.checkbox_Yellow_color);
        itemCountry = (CheckBox) findViewById(R.id.checkBox_item_country);
        itemSize = (CheckBox) findViewById(R.id.checkBox_item_size);
        // if the checkbox is checked, the other checkboxes will be unchecked and the color value will be assigned to the formal color value.
        //if the customer does not check any boxes, the warning message will be showed as the buy now button is pressed.
        // this method is also applied for size and country.
        if (blueCheckBox.isChecked()) {
            colorItem = "Blue Color";
            warningColor = "";
            blackCheckBox.setChecked(false);
            yellowCheckBox.setChecked(false);
        } else if (blackCheckBox.isChecked()) {
            colorItem = "Black Color";
            warningColor = "";
            blueCheckBox.setChecked(false);
            yellowCheckBox.setChecked(false);
        } else if (yellowCheckBox.isChecked()) {
            colorItem = "Yellow Color";
            warningColor = "";
            blackCheckBox.setChecked(false);
            blueCheckBox.setChecked(false);
        } else {
            invalidPurchasing = true;
            warningColor = "Please choose the item color \n";
        }

        if (!itemCountry.isChecked()) {
            invalidPurchasing = true;
            warningCountry = "Please choose shipping country\n";
        } else {
            warningCountry = "";
        }

        if (!itemSize.isChecked()) {
            invalidPurchasing = true;
            warningSize = "Please choose the size of item\n";
        } else {
            warningSize = "";
        }

        if (itemQuantity == 0) {
            invalidPurchasing = true;
            warningQuantity = "Please choose the quantity of the item\n";
        } else {
            warningQuantity = "";
        }
        // if the process is not completed successfully, the warning message will be display
        if (invalidPurchasing == true) {

            Toast.makeText(this, warningColor + warningSize + warningCountry + warningQuantity, Toast.LENGTH_LONG).show();
            invalidPurchasing = false;

        } else {

            Toast.makeText(this, "Ordering Successfully.\n Thank you so much!", Toast.LENGTH_LONG).show();

            // show the purchasing information on the textView
            TextView displaySummaryPayment = (TextView) findViewById(R.id.textView_Display_SummaryPayment);
            displaySummaryPayment.setText("You have ordered " + itemQuantity + " item(s) with " + colorItem);
        }
    }

    // This function is used to calculate and display the total amount of money
    public void displayTotalAmountOfMoney(int itemQuantity) {
        totalAmount = itemQuantity * price;
        TextView textView = (TextView) findViewById(R.id.textView_total_payment);
        textView.setText("$ " + totalAmount);
    }

    //This function is used for displaying the item's quantity on textView
    private void displayQuantity(int number) {
        //Find a reference to the TextView in the layout
        TextView textView = (TextView) findViewById(R.id.textView_show_quanity);
        textView.setText("" + number);
    }

    public void onClickFeedBacks(View view){
        EditText etName1 = (EditText) findViewById(R.id.editText_Feedbacks);
        Intent intent = new Intent(Clothing1DetailsActivity.this, FeedBacksActivity.class);
        intent.putExtra("name", etName1.getText().toString());
        startActivity(intent);
    }

}
