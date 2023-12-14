package com.example.myapplication;;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    Random r = new Random();
    int n = r.nextInt(5);
    System.out.println(n);
     switch (n){
        case "0":
            showToast("MONDAY");
            break;
        case "1":
            showToast("MONDAY");
            break;
        case "2":
            showToast("TUESDAY");
            break;
        case "3":
            showToast("WEDNESDAY");
            break;
        case "4":
            showToast("THURSDAY");
            break;
        default:
            showToast("---INVALID---");
            break;
    }

}