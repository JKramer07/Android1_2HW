package com.geekchtech.android1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView rv;
    Adapter adapter;
    ArrayList<Model> list = new ArrayList<>();
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        btnAdd = findViewById(R.id.add_item_btn);
        btnAdd.setOnClickListener(v -> {
            Intent intent = new Intent(this, AddNewNoteActivity.class);
            startActivityForResult(intent, 100);
        });
        initRecycler();

    }

    private void initRecycler(){
        rv = findViewById(R.id.recycler);
        adapter = new Adapter();
        rv.setAdapter(adapter);
        adapter.setData(list);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == RESULT_OK){
            if (data != null) {
                Model model = new Model(data.getStringExtra("title"), data.getStringExtra("description"), data.getStringExtra("date"), data.getStringExtra("id"));
                adapter.addModel(model);
            }
        }
    }
}