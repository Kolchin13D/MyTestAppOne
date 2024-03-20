package com.example.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        TextView Text = findViewById(R.id.text);
        EditText text2 = findViewById(R.id.editText);
        TextView result = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = text2.getText().toString();
                int finalValue = Integer.parseInt(res);
                result.setText("your result: " + finalValue * 1000 + " mm");
            }
        });

        Button go = findViewById(R.id.button2);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotopage2();
            }
        });
    }

    private void gotopage2() {
        Intent goto2 = new Intent(this, page2.class);
        startActivity(goto2);
    }
}