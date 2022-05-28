package com.academialab.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView mtv_first,mtv_second,result;
    EditText met_first,met_second;
    Button mbt_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtv_first = findViewById(R.id.et_text_one);
        mtv_second = findViewById(R.id.et_text_two);
        met_first = findViewById(R.id.et_enter_one);
        met_second = findViewById(R.id.et_enter_two);
        result = findViewById(R.id.et_text_res);
        mbt_calculate = findViewById(R.id.btn_calculate);

        mbt_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first_num = Integer.parseInt(met_first.getText().toString());
                int second_num = Integer.parseInt(met_first.getText().toString());
                result.setText("The sum is "+ (first_num + second_num));
            }
        });

    }


}