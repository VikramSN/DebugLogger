package com.vsn.debuglogger;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;

public class Utility {

    public static void shortToast(Context c, String message) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }

    public static void longToast(Context c, String message) {
        Toast.makeText(c, message, Toast.LENGTH_LONG).show();
    }

    public static void customToast(Context c, String message, int drawableIcon) {
        View layout = LayoutInflater.from(c).inflate(R.layout.custom_toast,null);
        TextView text = layout.findViewById(R.id.toastText);
        ImageView img = layout.findViewById(R.id.toastImage);
        text.setText(message);
        img.setImageResource(drawableIcon);
        Toast toast = new Toast(c);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static void customToast(Context c, String message, int drawableIcon, int backgroundColor) {
        @SuppressLint("InflateParams") View layout = LayoutInflater.from(c).inflate(R.layout.custom_toast,null);
        layout.setBackgroundTintList(c.getResources().getColorStateList(backgroundColor));
        TextView text = layout.findViewById(R.id.toastText);
        ImageView img = layout.findViewById(R.id.toastImage);
        text.setText(message);
        img.setImageResource(drawableIcon);
        Toast toast = new Toast(c);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static void customToast(Context c, String message, int drawableIcon, int backgroundColor,int gravity) {
        @SuppressLint("InflateParams") View layout = LayoutInflater.from(c).inflate(R.layout.custom_toast,null);
        layout.setBackgroundTintList(c.getResources().getColorStateList(backgroundColor));
        TextView text = layout.findViewById(R.id.toastText);
        ImageView img = layout.findViewById(R.id.toastImage);
        text.setText(message);
        img.setImageResource(drawableIcon);
        Toast toast = new Toast(c);
        toast.setGravity(gravity, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    public static void LogD(String tag, String debugMSG) {
        Log.d(tag, debugMSG);
    }

    public static void LogI(String tag, String infoMSG) {
        Log.i(tag, infoMSG);
    }

    public static void LogE(String tag, String errorMSG) {
        Log.e(tag, errorMSG);
    }

    public static void LogV(String tag, String verboseMSG) {
        Log.v(tag, verboseMSG);
    }

    public static void LogW(String tag, String warningMSG) {
        Log.w(tag, warningMSG);
    }
}
