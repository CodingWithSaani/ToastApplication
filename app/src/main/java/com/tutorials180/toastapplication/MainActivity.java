package com.tutorials180.toastapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v)
    {
        View convertedXML;
        LayoutInflater objectLayoutInflater=getLayoutInflater();

        convertedXML=objectLayoutInflater.inflate(
                R.layout.cutsom_toast,null
        );
        Toast objectToast=new Toast(this);
        objectToast.setGravity(Gravity.CENTER,0,0);

        objectToast.setDuration(Toast.LENGTH_LONG);
        objectToast.setView(convertedXML);

        objectToast.show();
    }













}
