package com.ma_ni_lo.myfirstapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d("MY_APP", "Custom broadcast received")
    }
}