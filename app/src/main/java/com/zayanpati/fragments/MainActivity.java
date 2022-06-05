package com.zayanpati.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.zayanpati.fragments.Fragments.FirstFragment;
import com.zayanpati.fragments.Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {

    Button btnFirst, btnSecond;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);
        linearLayout = findViewById(R.id.linearLayout);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragment firstFragment = new FirstFragment();

//              FragmentManager fragmentManager = getFragmentManager();
//              FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                                           OR
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

                fragmentTransaction.replace(R.id.linearLayout, firstFragment);
                fragmentTransaction.commit();
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment secondFragment = new SecondFragment();

//              FragmentManager fragmentManager = getFragmentManager();
//              FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                                           OR
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

                fragmentTransaction.replace(R.id.linearLayout, secondFragment);
                fragmentTransaction.commit();
            }
        });
    }
}