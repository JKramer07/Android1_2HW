package com.geekchtech.android1;

import android.widget.TextView;

public class Model {
    private String txtName, txtDescription, txtDate, txtId;

    public Model(String txtName, String txtDescription, String txtDate, String txtId) {
        this.txtName = txtName;
        this.txtDescription = txtDescription;
        this.txtDate = txtDate;
        this.txtId = txtId;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

    public String getTxtDate() {
        return txtDate;
    }

    public void setTxtDate(String txtDate) {
        this.txtDate = txtDate;
    }

    public String getTxtId() {
        return txtId;
    }

    public void setTxtId(String txtId) {
        this.txtId = txtId;
    }
}
