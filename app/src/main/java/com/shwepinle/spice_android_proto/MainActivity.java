package com.shwepinle.spice_android_proto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar appBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appBar = findViewById(R.id.appbar);
        setSupportActionBar(appBar);
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
}
