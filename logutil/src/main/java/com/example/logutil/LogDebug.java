package com.example.logutil;

import android.content.Context;
import android.widget.Toast;

public class LogDebug {

    public static int plus(int a,int b){
        return a+b;
    }
    public static int minus(int a,int b){
        return a-b;
    } public static float divide(int a,int b){
        if(b==0)
            throw new IllegalArgumentException("Division by zero error");
        else
            return a/b;
    } public static int multiply(int a,int b){
        return a*b;
    }

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
