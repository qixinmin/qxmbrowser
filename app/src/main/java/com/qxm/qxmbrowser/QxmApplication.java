package com.qxm.qxmbrowser;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by xinmin on 14/03/2017.
 */

//TODO 1. 完善application类
public class QxmApplication extends Application {

    public QxmApplication() {

    }

    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
