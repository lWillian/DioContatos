package com.example.contatosdio.application

import android.app.Application
import com.example.contatosdio.helpers.HelperDB

class ContatoApplication : Application(){

    var helperDB: HelperDB? = null
        private set

    override fun onCreate() {
        super.onCreate()
        helperDB = HelperDB(this)
    }
}