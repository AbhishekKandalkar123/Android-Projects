package com.akan.coffee;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add, sub, order;
    int value = 0;

    public void increment(View v){
        if(value<=50)
            value++;
        if(value >0 && value <= 50)
            display(value);
        else{
            Toast.makeText(this, "You can order only 50 coffees at a time!", Toast.LENGTH_SHORT).show();
        }
    }
    public void decrement(View v) {
        if (value > 0) {
            value--;
            display(value);
        }
    }
    private void display(int number){
        TextView quantity = findViewById(R.id.idquantity);
        quantity.setText("" + number);
    }

    public void submitOrder(View v){
        int whipped=0;
        CheckBox WhippedCreambox = findViewById(R.id.WhippedCreambox);
        boolean addWhippedCream = WhippedCreambox.isChecked();
        if(addWhippedCream)
            whipped = 1;

        int choco=0;
        CheckBox Choco_box = findViewById(R.id.Choco_box);
        boolean addChocolate = Choco_box.isChecked();
        if(addChocolate)
            choco = 2;

        int price = value*(5+choco+whipped);

        EditText EdtName = findViewById(R.id.EdtName);
        String name = EdtName.getText().toString();
        String priceMsg = createOrderSummary(price, addWhippedCream, addChocolate, name);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Coffee Order for " + name);
        intent.putExtra(Intent.EXTRA_TEXT, priceMsg);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private String createOrderSummary(int price, boolean addWhippedCream, boolean addChocolate, String name) {
        String priceMessage = "Name: " + name;
        priceMessage += "\nAdd whipped cream? " + addWhippedCream;
        priceMessage += "\nAdd chocolate? " + addChocolate;
        priceMessage += "\nQuantity: " + value;
        priceMessage += "\nTotal: $" + price;
        priceMessage += "\nThank you!";
        return priceMessage;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox WhippedCreambox = findViewById(R.id.WhippedCreambox);
        WhippedCreambox.setChecked(false);

        CheckBox Choco_box = findViewById(R.id.Choco_box);
        Choco_box.setChecked(false);

        add = findViewById(R.id.idadd);
        sub = findViewById(R.id.idsub);
        order = findViewById(R.id.idorder);
    }
}