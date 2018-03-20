package com.example.android.sih_service20;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.widget.Toast;

public class MyService extends Service {

    int n;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

//        Toast.makeText(this, "Service Thread " + Thread.currentThread().getId() + "Started", Toast.LENGTH_SHORT).show();
//
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                n=0;
//
//                while(n++<50) {
//                    Toast.makeText(MyService.this, "Iteration: " + n, Toast.LENGTH_SHORT).show();
//                    try {
//                        Toast.makeText(MyService.this, "Good Night", Toast.LENGTH_SHORT).show();
//                        SystemClock.sleep(7000);
//                    } catch (Exception e) {
//                        Toast.makeText(MyService.this, "Sleep Failed", Toast.LENGTH_SHORT).show();
//                        break;
//                    }
//                }
//
//            }
//        }, 2000);


        Toast.makeText(MyService.this, "Service", Toast.LENGTH_SHORT).show();
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    while(true) {
                        sleep(1000);
                        Toast.makeText(MyService.this, "Sleep ", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(MyService.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        };

        thread.start();

        return super.onStartCommand(intent, flags, startId);

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
