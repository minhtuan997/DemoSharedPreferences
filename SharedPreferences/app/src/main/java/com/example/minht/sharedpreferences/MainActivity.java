package com.example.minht.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnClick;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences = getSharedPreferences("tuan",MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("STRING",2);
        edit.commit();

        btnClick = findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("tuan",MODE_PRIVATE);
        int code = sharedPreferences.getInt("STRING",0);
        Toast.makeText(MainActivity.this,"" + code,Toast.LENGTH_LONG).show();
        }
        });
        }



        }
