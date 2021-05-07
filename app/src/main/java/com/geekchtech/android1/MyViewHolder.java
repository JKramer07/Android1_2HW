package com.geekchtech.android1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView txtName, txtDescription, txtId, txtDate;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        txtName = itemView.findViewById(R.id.name_txt);
        txtDescription = itemView.findViewById(R.id.description_txt);
        txtDate = itemView.findViewById(R.id.date_txt);
        txtId = itemView.findViewById(R.id.first_txt);

    }

    public void onBind(Model s) {
        txtName.setText(s.getTxtName());
        txtDescription.setText(s.getTxtDescription());
        txtDate.setText(s.getTxtDate());
        txtId.setText(s.getTxtId());
    }
}
