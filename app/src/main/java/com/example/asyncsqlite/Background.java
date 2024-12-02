package com.example.asyncsqlite;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

public class Background extends AsyncTask {
    DbHelp insertRef;
    public Background(DbHelp insert){
        this.insertRef=insert;
        execute();
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        insertRef.insertUserData();
        Log.d("bgprocess", "background process started....");
        return null;
    }
}
