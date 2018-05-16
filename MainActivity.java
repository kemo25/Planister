package com.planister.kemal.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button go2BossView =(Button) findViewById(R.id.goTopsw);
        go2BossView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int clickedElement = view.getId();// ID des geklickten wird übergeben
        if (clickedElement == R.id.goTopsw){
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
        }
    }
}