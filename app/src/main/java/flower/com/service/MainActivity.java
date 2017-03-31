package flower.com.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.code.cai.view.PasswordView;

public class MainActivity extends AppCompatActivity {

    private PasswordView mPasswordView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPasswordView = (PasswordView) findViewById(R.id.mpv);

        mPasswordView.setOnCompleteListener(new PasswordView.OnCompleteListener() {
            @Override
            public void complete(String password) {
                Log.i("xxx", "complete: " + password);
            }
        });
    }

    public void start(View view){
        Intent intent = new Intent(this  , MyService.class);
        startService(intent);
    }
    public void stop(View view){
        Intent intent = new Intent(this  , MyService.class);
        stopService(intent);
    }
    public void bind(View view){
        Intent intent = new Intent(this  , MyService.class);
        bindService(intent , connection , BIND_AUTO_CREATE);
    }
    public void unbind(View view){
        unbindService(connection);
    }

    public void print(View view){
        if(mService != null){
            mService.print();
        }
    }

    private MyService.MyBind mBinder ;

    private MyService mService ;

    ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mBinder = (MyService.MyBind) service;
            mService = mBinder.getService();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            mBinder = null ;
            mService = null ;
        }
    };
}
