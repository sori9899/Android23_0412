package com.example.challenge07;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button custom = (Button) findViewById(R.id.customer);
        Button sales = (Button) findViewById(R.id.sales);
        Button product = (Button) findViewById(R.id.product);

        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent();
                intent.putExtra("string", "고객관리");
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

        sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent();
                intent.putExtra("string", "매출 관리");

                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent();
                intent.putExtra("string", "상품 관리");

                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}
