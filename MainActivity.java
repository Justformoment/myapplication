package com.example.jasur.myapplication;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    private void display(int quantity) {

    }

    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }
    public void submitOrder(View view) {
        String priceMessage = "Free";
        displayMessage(priceMessage);
    }
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
     private void displayMessage(String message) {
             TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
             priceTextView.setText(message);
     }


}
