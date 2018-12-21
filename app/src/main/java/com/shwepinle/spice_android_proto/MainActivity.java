package com.shwepinle.spice_android_proto;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NetListFragment.OnNetlistFragmentInteractionListener, CalculateFragment.OnCalculateFragmentInteractionListener {
    private Toolbar appBar;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;
    private NetListFragment netlistfragment;
    private CalculateFragment calculateFragment;

    private boolean openCalculate, openAddItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openCalculate = false;
        openAddItem = false;
        appBar = findViewById(R.id.appbar);
        setSupportActionBar(appBar);

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        netlistfragment = new NetListFragment();
        calculateFragment = new CalculateFragment();
        mFragmentTransaction.add(R.id.netlist_container, netlistfragment);
        mFragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.HowToUse:
                Toast.makeText(this, "How to use pressed", Toast.LENGTH_LONG).show();
                return true;

            case R.id.about:
                Toast.makeText(this, "About pressed", Toast.LENGTH_LONG).show();
                return true;

                default:
                    return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCalculateClicked(Boolean b) {
        openCalculate = b;
        
    }

    @Override
    public void onCalculateFragmentInteraction(Uri uri) {
        boolean b = true;
    }
}
