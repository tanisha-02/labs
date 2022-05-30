package com.example.a201b299_shared_preferencs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    SharedPreferences sharedPreferences;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.ENG:
                textView.setText("English");
                sharedPreferences.edit().putString("title","English").apply();
                return true;

            case R.id.HIN:
                textView.setText("Hindi");
                sharedPreferences.edit().putString("title","Hindi").apply();
                return true;

            default:
                return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        sharedPreferences=this.getSharedPreferences("com.example.a201b299_shared_preferencs",0);
        String pref=sharedPreferences.getString("title", "default");
        textView.setText(pref);
    }

    //What should we not store in Shared Preferences?
    

}