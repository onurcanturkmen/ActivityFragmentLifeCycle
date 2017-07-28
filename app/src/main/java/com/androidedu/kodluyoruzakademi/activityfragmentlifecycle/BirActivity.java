package com.androidedu.kodluyoruzakademi.activityfragmentlifecycle;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BirActivity extends AppCompatActivity {

    private void logYaz(String icerik) {
        String MAIN_TAG = "Onurcan - BirActivity";
        Log.e(MAIN_TAG, icerik);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bir);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment cfrag = new CFragment();
        fragmentTransaction.add(R.id.cFragment, cfrag);
        fragmentTransaction.commit();

        logYaz("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logYaz("onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        logYaz("onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logYaz("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logYaz("onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        logYaz("onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logYaz("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logYaz("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logYaz("onRestart");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        logYaz("onAttachFragment");
    }
}
