package flower.com.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by wp on 2017/3/28.
 *
 * @description
 */

public class MyService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("xxxx", "onBind: ");
        return new MyBind();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("xxxx", "onCreate: ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("xxxx", "onStartCommand: ");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("xxxx", "onDestroy: ");
    }

    public class MyBind extends Binder{

        public  MyService getService(){
            return  MyService.this;
        }
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i("xxxx", "onUnbind: ");
        return super.onUnbind(intent);
    }

    public void print(){
        Log.i("xxxx", "print: ");
    }

}
