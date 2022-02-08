package com.uttam.mathutillibrary;

import android.content.Context;
import android.widget.Toast;

public class BasicMaths {


    public void showTotal(Context context, int num1, int num2){
        String total = String.valueOf(num1+num2);
        Toast.makeText(context, total, Toast.LENGTH_SHORT).show();
    }

}
