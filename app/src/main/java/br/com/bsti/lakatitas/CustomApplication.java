package br.com.bsti.lakatitas;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Luis.SILVA.ext on 12/10/2016.
 */

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        // other setup code
    }

}
