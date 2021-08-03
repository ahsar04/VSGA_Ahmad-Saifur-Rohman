package com.asr.vsgalayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionsmenu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.option1){
            startActivity(new Intent(this, menu1Activity.class));
        }else if (item.getItemId()==R.id.option2){
            startActivity(new Intent(this, menu2Activity.class));
        }else if (item.getItemId()==R.id.option3){
            startActivity(new Intent(this, Memu3Activity.class));
        }else if (item.getItemId()==R.id.cobaLayout){
            startActivity(new Intent(this, LoginPage.class));
        }
        return true;
    }
}