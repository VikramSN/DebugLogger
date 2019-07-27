# DebugLogger
<b>Step 1. Add the JitPack repository to your build file</b>
<ul>Add it in your root build.gradle at the end of repositories:</ul>

<pre>
<b>allprojects {
repositories {
...
maven { url 'https://jitpack.io' }
}
}
</b>
</pre>

<b>Step 2. Add the dependency</b>
<pre>
<b>dependencies {
implementation 'com.github.VikramSN:DebugLogger:0.1.0'
}
</b></pre>

<pre><i>

           <b>Utilization of Library </b>
         --------------------------------------

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
</i></pre>

