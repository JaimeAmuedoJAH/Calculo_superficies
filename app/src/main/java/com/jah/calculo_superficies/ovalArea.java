package com.jah.calculo_superficies;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ovalArea extends AppCompatActivity {

    EditText txtMinorRadius, txtMajorRadius;
    Button btnCalculate, btnDelete;
    TextView lblResult, lblTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.area_oval);
        initComponents();

        btnDelete.setOnClickListener(view -> dialogConfirm());
        btnCalculate.setOnClickListener(view -> calculateSurface());
    }

    private void dialogConfirm() {
        new AlertDialog.Builder(this)
                .setCancelable(false)
                .setIcon(R.drawable.baseline_remove_red_eye_24)
                .setTitle(R.string.delete)
                .setMessage(R.string.dialog_message)
                .setNegativeButton(R.string.dialog_negative, null)
                .setPositiveButton(R.string.dialog_positive, (dialogInterface, i) -> deleteAll())
                .create()
                .show();

    }

    //Calculate surface rectangle.
    private void calculateSurface() {
        String str1 = txtMajorRadius.getText().toString();
        String str2= txtMinorRadius.getText().toString();
        int major = Integer.parseInt(str1);
        int minor = Integer.parseInt(str2);
        double pi = Math.PI;
        double res = 0.0;

        res = pi * major * minor;
        lblResult.setText(res + "");
    }
    //Reset for calculate a new rectangle surface.
    private void deleteAll() {
        txtMajorRadius.setText("");
        txtMinorRadius.setText("");
        lblResult.setText("0.0");
    }

    private void initComponents() {
        txtMinorRadius = findViewById(R.id.txtMajorRadius);
        txtMajorRadius = findViewById(R.id.txtMajorRadius);
        btnCalculate = findViewById(R.id.btnCalculate);
        btnDelete = findViewById(R.id.btnDelete);
        lblResult = findViewById(R.id.lblResult);
        lblTitle = findViewById(R.id.lblTitle);
        lblTitle.setText(getString(R.string.lblarea) + " " + getString(R.string.oval));
        lblResult.setText("0.0");
    }
}
