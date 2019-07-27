package com.vsn.debuglogger

import android.os.Build
import android.os.Bundle
import android.view.Gravity
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Log Debugger, Parameters = (tag, debug message)
        Utility.LogD("tag","debug message")

        // Log Error, Parameters = (tag, error message)
        Utility.LogE("tag","error message")

        // Log Info, Parameters = (tag, info message)
        Utility.LogI("tag","info message")

        // Log Verbose, Parameters = (tag, verbose message)
        Utility.LogV("tag","verbose message")

        // Log Warning, Parameters = (tag, warning message)
        Utility.LogW("tag","warning message")

        // Toast for short time, Parameters = (context, message)
        Utility.shortToast(this,"toast message for short time")

        // Toast for long time, Parameters = (context, message)
        Utility.longToast(this,"toast message for long time")

        // Custom Toast, Parameters = (context, message, icon)
        // put icon such as R.drawable.toastIcon
        Utility.customToast(this,"toast message",R.drawable.icon_info)

        // Custom Toast, Parameters = (context, message, icon, backgroundColor)
        // put icon such as R.drawable.toastIcon
        // put background color such as R.color.red
        Utility.customToast(this,"toast message",R.drawable.icon_info,R.color.colorPrimary)

        // Custom Toast, Parameters = (context, message, icon, backgroundColor, int gravity)
        // put icon such as R.drawable.toastIcon
        // put background color such as R.color.red
        // put gravity such as Gravity.TOP/Gravity.Bottom/Gravity.LEFT/Gravity.RIGHT/Gravity.CENTER
        Utility.customToast(this,"toast message",R.drawable.icon_info,R.color.colorPrimary,Gravity.CENTER)
    }
}
