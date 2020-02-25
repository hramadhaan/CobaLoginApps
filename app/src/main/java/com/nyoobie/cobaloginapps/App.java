package com.nyoobie.cobaloginapps;

import android.app.Application;

import com.nyoobie.cobaloginapps.data.AppState;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppState.getInstance().initSharedPrefs(this);
    }
}
