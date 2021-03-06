package com.koalatea.sedaily

import com.facebook.stetho.Stetho
import com.squareup.leakcanary.LeakCanary
import timber.log.Timber

class DebugSEDApplication : SEDApplication() {

    override fun onCreate() {
        super.onCreate()

//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            // This process is dedicated to LeakCanary for heap analysis.
//            // You should not init your app in this process.
//            return
//        }
//        LeakCanary.install(this)

        Stetho.initializeWithDefaults(this)

        Timber.plant(Timber.DebugTree())
    }

}