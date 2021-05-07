package com.geekchtech.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    EditText editText;
    Button btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initViews();
        initListeners();

    }

    private void initViews(){
        editText = findViewById(R.id.number_et);
        btnChange = findViewById(R.id.change_btn);
    }

    private void initListeners(){
        btnChange.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.putExtra("number", editText.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}