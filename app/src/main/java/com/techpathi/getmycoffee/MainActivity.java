package com.techpathi.getmycoffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final Integer price = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void decreaseCoffee(View view) {
        TextView orders = (TextView) findViewById(R.id.orders);
        TextView total = (TextView) findViewById(R.id.total);

        String orderStr = orders.getText().toString();
        String totalStr = total.getText().toString();

        Integer orderNum = Integer.parseInt(orderStr);
        Integer totalNum = Integer.parseInt(totalStr);

        if(orderNum > 0) {
            orderNum = orderNum - 1;
            totalNum = totalNum - 10;
            orders.setText(orderNum.toString());
            total.setText(totalNum.toString());
        } else {
            Toast toast = Toast.makeText(this, "No coffee left!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void increaseCoffee(View view) {
        TextView orders = (TextView) findViewById(R.id.orders);
        TextView total = (TextView) findViewById(R.id.total);

        String orderStr = orders.getText().toString();
        String totalStr = total.getText().toString();

        Integer orderNum = Integer.parseInt(orderStr);
        Integer totalNum = Integer.parseInt(totalStr);

        orderNum = orderNum + 1;
        totalNum = totalNum + 10;

        orders.setText(orderNum.toString());
        total.setText(totalNum.toString());



    }

    public void resetCoffee(View view) {
        TextView orders = (TextView) findViewById(R.id.orders);
        TextView total = (TextView) findViewById(R.id.total);

        orders.setText("0");
        total.setText("0");
    }
}
