package com.planister.kemal.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button goBack =(Button) findViewById(R.id.toWeek);
        goBack.setOnClickListener(this);
        Button go2BossView =(Button) findViewById(R.id.goToBossView);
        go2BossView.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        int clickedElement = view.getId();// ID des geklickten wird übergeben
        if (clickedElement == R.id.toWeek){
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        }
        else if (clickedElement == R.id.goToBossView){

            EditText psw = (EditText) findViewById(R.id.pswBox);
            String pswFromEditText = (String) psw.getText().toString();

            EditText edit =  (EditText) findViewById(R.id.pswBox);
            if(pswFromEditText.equals("0201")){
                Intent intent = new Intent(Login.this, ChangeScreenActivity.class);
                startActivity(intent);
            }




        }
    }
}
