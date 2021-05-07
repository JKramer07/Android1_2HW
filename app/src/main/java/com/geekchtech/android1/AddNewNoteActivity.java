package com.geekchtech.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AddNewNoteActivity extends AppCompatActivity {

    EditText etTitle, etDescription;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_note);
        etTitle = findViewById(R.id.title_et);
        etDescription = findViewById(R.id.description_et);
        btnAdd = findViewById(R.id.add_btn);
        btnAdd.setOnClickListener(v -> {
            String title = etTitle.getText().toString();
            String description = etDescription.getText().toString();
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault());
            String date = sdf.format(new Date());
            if (!title.isEmpty() && !description.isEmpty()) {
                Intent intent = new Intent(this, RecyclerActivity.class);
                intent.putExtra("title", title);
                intent.putExtra("description", description);
                intent.putExtra("date", date);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}