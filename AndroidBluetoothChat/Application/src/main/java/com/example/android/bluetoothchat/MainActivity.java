
package com.example.android.bluetoothchat;


import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;



import com.example.android.common.activities.SampleActivityBase;


public class MainActivity extends SampleActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            BluetoothChatFragment fragment = new BluetoothChatFragment();
            transaction.replace(R.id.sample_content_fragment, fragment);
            transaction.commit();
        }
    }
}
