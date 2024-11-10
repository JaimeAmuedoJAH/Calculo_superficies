package com.jah.calculo_superficies;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton imgbtnRectangle, imgbtnSquare, imgbtnOval, imgbtnCircle, imgbtnTriangle, imgbtnRhombus, imgbtnPentagon, imgbtnHexagon;
    Intent newAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        initComponents();

        //Call methods to create new activity. The activities calculate surface figure.
        imgbtnRectangle.setOnClickListener(view -> rectangle());
        imgbtnSquare.setOnClickListener(view -> square());
        imgbtnOval.setOnClickListener(view -> oval());
        imgbtnCircle.setOnClickListener(view -> circle());
        imgbtnTriangle.setOnClickListener(view -> triangle());
        imgbtnRhombus.setOnClickListener(view -> rhombus());
        imgbtnPentagon.setOnClickListener(view -> pentagon());
        imgbtnHexagon.setOnClickListener(view -> hexagon());
    }

    private void hexagon() {
        newAct = new Intent(getApplicationContext(), hexagonArea.class);
        startActivity(newAct);
    }

    private void pentagon() {
        newAct = new Intent(getApplicationContext(), pentagonArea.class);
        startActivity(newAct);
    }

    private void rhombus() {
        newAct = new Intent(getApplicationContext(), rhombusArea.class);
        startActivity(newAct);
    }

    private void triangle() {
        newAct = new Intent(getApplicationContext(), triangleArea.class);
        startActivity(newAct);
    }

    private void circle() {
        newAct = new Intent(getApplicationContext(), circleArea.class);
        startActivity(newAct);
    }

    private void oval() {
        newAct = new Intent(getApplicationContext(), ovalArea.class);
        startActivity(newAct);
    }

    private void square() {
        newAct = new Intent(getApplicationContext(), squareArea.class);
        startActivity(newAct);
    }

    private void rectangle() {
        newAct = new Intent(getApplicationContext(), rectangleArea.class);
        startActivity(newAct);
    }

    private void initComponents() {
        imgbtnRectangle = findViewById(R.id.imgbtnRectangle);
        imgbtnSquare = findViewById(R.id.imgbtnSquare);
        imgbtnOval = findViewById(R.id.imgbtnOval);
        imgbtnCircle = findViewById(R.id.imgbtnCircle);
        imgbtnTriangle = findViewById(R.id.imgbtnTriangle);
        imgbtnRhombus = findViewById(R.id.imgbtnRhombus);
        imgbtnPentagon = findViewById(R.id.imgbtnPentagon);
        imgbtnHexagon = findViewById(R.id.imgbtnHexagon);
    }
}