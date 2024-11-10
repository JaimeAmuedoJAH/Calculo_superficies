package com.jah.calculo_superficies;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class circleArea extends AppCompatActivity {

    EditText txtRadius;
    Button btnCalculate, btnDelete;
    TextView lblResult, lblTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.area_circle);
        initComponets();

        btnDelete.setOnClickListener(view -> dialogConfirm());
        btnCalculate.setOnClickListener(view -> calculateSurface());
    }
    private void dialogConfirm() {
        new AlertDialog.Builder(this)
                .setCancelable(false)
                .setIcon(R.drawable.baseline_circle_24)
                .setTitle(R.string.delete)
                .setMessage(R.string.dialog_message)
                .setNegativeButton(R.string.dialog_negative, null)
                .setPositiveButton(R.string.dialog_positive, (dialogInterface, i) -> deleteAll())
                .create()
                .show();

    }

    //Calculate surface rectangle.
    private void calculateSurface() {
        String str = txtRadius.getText().toString();
        int radius = Integer.parseInt(str);
        double pi = Math.PI;
        double res = 0.0;

        res = pi * radius * radius;
        lblResult.setText(res + "");
    }
    //Reset for calculate a new rectangle surface.
    private void deleteAll() {
        txtRadius.setText("");
        lblResult.setText("0.0");
    }

    private void initComponets() {
        txtRadius = findViewById(R.id.txtMajorRadius);
        btnCalculate = findViewById(R.id.btnCalculate);
        btnDelete = findViewById(R.id.btnDelete);
        lblResult = findViewById(R.id.lblResult);
        lblTitle = findViewById(R.id.lblTitle);
        lblTitle.setText(getString(R.string.lblarea) + " " + getString(R.string.Circle));
        lblResult.setText("0.0");
    }
}
