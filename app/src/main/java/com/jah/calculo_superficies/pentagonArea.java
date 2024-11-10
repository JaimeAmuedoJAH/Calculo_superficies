package com.jah.calculo_superficies;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class pentagonArea extends AppCompatActivity {

    TextView lblTitle, lblResult;
    EditText txtSide, txtApothem;
    Button btnDelete, btnCalculate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.area_pentagon);
        initComponents();

        btnDelete.setOnClickListener(view -> dialogConfirm());
        btnCalculate.setOnClickListener(view -> calculateSurface());
    }

    private void dialogConfirm() {
        new AlertDialog.Builder(this)
                .setCancelable(false)
                .setIcon(R.drawable.baseline_pentagon_24)
                .setTitle(R.string.delete)
                .setMessage(R.string.dialog_message)
                .setNegativeButton(R.string.dialog_negative, null)
                .setPositiveButton(R.string.dialog_positive, (dialogInterface, i) -> deleteAll())
                .create()
                .show();

    }

    //Calculate surface rectangle.
    private void calculateSurface() {
        String str1 = txtSide.getText().toString();
        String str2 = txtApothem.getText().toString();
        int side = Integer.parseInt(str1);
        int apothem = Integer.parseInt(str2);
        double res = 0.0;

        res = (double) (5 * side * apothem) / 2;
        lblResult.setText(res + "");
    }
    //Reset for calculate a new rectangle surface.
    private void deleteAll() {
        txtSide.setText("");
        txtApothem.setText("");
        lblResult.setText("0.0");
    }

    private void initComponents() {
        lblTitle = findViewById(R.id.lblTitle);
        lblResult = findViewById(R.id.lblResult);
        txtSide = findViewById(R.id.txtSide);
        txtApothem = findViewById(R.id.txtMajorRadius);
        btnDelete = findViewById(R.id.btnDelete);
        btnCalculate = findViewById(R.id.btnCalculate);

        lblTitle.setText(getString(R.string.lblarea) + " " + getString(R.string.pentagon));
        lblResult.setText("0.0");
    }
}
