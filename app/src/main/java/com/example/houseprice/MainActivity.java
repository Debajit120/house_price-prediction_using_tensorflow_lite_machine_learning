package com.example.houseprice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l=(ConstraintLayout)findViewById(R.id.Constraint);
        l.setBackgroundResource(R.drawable.good_morning_img);

      //  @SuppressLint("ResourceType") ConstraintLayout layout=findViewById(R.layout.activity_main);
      //  layout.setBackground(Drawable.createFromPath("@drawable/good_morning_img"));
    }
    public  void nxtpage(View view)
    {
        Intent intent = new Intent(MainActivity.this, signup.class);
        startActivity(intent);
    }
}