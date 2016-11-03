package com.soho.yvtc.yvn110301a;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"設定");  //action bar menu 替代 options menu
        menu.add(1,1,1,"關於我們");
        menu.add(0,2,2,"HAHAHA");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 1)
        {
            Toast.makeText(MainActivity.this, "這是關於我們", Toast.LENGTH_LONG).show();
        }
        if (item.getItemId() == 2)
        {
            Toast.makeText(MainActivity.this, "這是HAHAHA", Toast.LENGTH_LONG).show();
        }
        if (item.getItemId() == 0)
        {
            Toast.makeText(MainActivity.this, "這是設定", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
