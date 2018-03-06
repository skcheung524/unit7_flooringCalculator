package com.skc.unit7_flooringcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView) findViewById(R.id.editTextResult);
        Bundle extras = getIntent().getExtras();
        Double width = Double.parseDouble((String)extras.get("width"));
        Double length = Double.parseDouble((String)extras.get("length"));
        Double areaResult = width*length;

        result.setText("Width is "+width +" and Length is " +length +" and flooring needed is "+ areaResult + ".");
    }
}
