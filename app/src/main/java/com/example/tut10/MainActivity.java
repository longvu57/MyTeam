package com.example.tut10;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = new Image();
        Bundle data = new Bundle();
        fragment.setArguments(data);
        manager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }

}