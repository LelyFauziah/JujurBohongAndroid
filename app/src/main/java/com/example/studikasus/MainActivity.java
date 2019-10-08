package com.example.studikasus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager(); // wajib ada untuk menempelkan fragmentnya
        FragmentTransaction ft = fm.beginTransaction(); //

        ft.add(R.id.fragment1, new Fragmensatu()); //  nempel fragment di fragmensatu, dimana letaknya terdapat di activityfragment1
        ft.add(R.id.fragment2, new Fragmendua()); // nempel fragment di fragmensatu, dimana letaknya terdapat di activityfragment2
        ft.commit(); // run

    }
}
