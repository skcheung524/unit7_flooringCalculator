package com.skc.unit7_flooringcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView width;
    TextView length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        width = (TextView) findViewById(R.id.editTextWidthNumber);
        length = (TextView) findViewById(R.id.editTextLengthNumber);

    }
    public void onClickResult(View view) {

        String widthString = width.getText().toString();
        String lengthString = length.getText().toString();

        Intent detailActIntent = new Intent(this, ResultActivity.class);
        detailActIntent.putExtra("width", widthString);
        detailActIntent.putExtra("length", lengthString);
        startActivity(detailActIntent);

    }

}
