package com.msg.smorf;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // String t = stringFromJNI();
         String t = stringFromJNI();
        ((TextView)findViewById(R.id.text)).setText(t);

    }
    public static native String stringFromJNI();




    static {
        System.loadLibrary("Gor");
    }

}
