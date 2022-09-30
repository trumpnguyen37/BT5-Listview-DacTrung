package com.example.listview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button btnback;
    TextView monhoctxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnback = (Button) findViewById(R.id.btnback);
        monhoctxt = (TextView) findViewById(R.id.monhoctxt);
        Intent intent1 = getIntent();
        monhoctxt.setText(intent1.getStringExtra("key_1"));

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }

}