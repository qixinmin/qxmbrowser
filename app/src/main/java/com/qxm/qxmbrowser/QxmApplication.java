package com.qxm.qxmbrowser;

import android.app.Application;

import com.facebook.stetho.Stetho;

import org.litepal.LitePalApplication;

/**
 * Created by xinmin on 14/03/2017.
 */

//TODO 1. 完善application类
public class QxmApplication extends LitePalApplication {

    public QxmApplication() {

    }

    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
