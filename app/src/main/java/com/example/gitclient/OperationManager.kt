package com.example.gitclient

import android.util.Log

class OperationManager {
    fun getLog() {
        Log.d("Operation Manager", "Get Log")
    }

    fun push() {
        Log.d("Operation Manager", "Push")
    }

    fun pull() {
        Log.d("Operation Manager", "Pull")
    }
}