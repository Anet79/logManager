package com.anet.upload;


import android.util.Log;


public class LogManager {

    private static final String TAG = "MyAppLogger";

    // debug (d)
    public static void d(String message) {
        Log.d(TAG, message);
    }

    // info (i)
    public static void i(String message) {
        Log.i(TAG, message);
    }

    // error (e)
    public static void e(String message) {
        Log.e(TAG, message);
    }

    //verbose (v)
    public static void v(String message) {
        Log.v(TAG, message);
    }

    // warning (w)
    public static void w(String message) {
        Log.w(TAG, message);
    }

    // "what a terrible failure"
    public static void wtf(String message) {
        Log.wtf(TAG, message);

    }

    //functions that can get a TAG in additional
    public static void d(String tag, String message) {
        Log.d(tag, message);
    }

    public static void i(String tag, String message) {
        Log.i(tag, message);
    }

    public static void e(String tag, String message) {
        Log.e(tag, message);
    }

    public static void v(String tag, String message) {
        Log.v(tag, message);
    }

    public static void w(String tag, String message) {
        Log.w(tag, message);
    }

    public static void wtf(String tag, String message) {
        Log.wtf(tag, message);
    }


}
