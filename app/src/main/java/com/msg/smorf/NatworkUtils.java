package com.msg.smorf;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NatworkUtils {

    NatworkUtils(Activity context) {
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(android.content.Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();
        if (info != null) {
            boolean isConnected = info.isConnected();
        }
    }
}
