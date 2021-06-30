package com.example.gitclient

import android.util.Log

class OperationManager {
    fun getLog() {
        Log.d("Operation Manager", "Get Log")
    }

    fun rebase() {
        Log.d("Operation Manager", "Rebase")
    }

    fun merge() {
        Log.d("Operation Manager", "Merge")
    }
}