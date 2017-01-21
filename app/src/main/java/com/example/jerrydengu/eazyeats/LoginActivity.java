package com.example.jerrydengu.eazyeats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText Emaillogin =(EditText) findViewById(R.id.Emaillogin);
        final EditText Passwordlog =  (EditText) findViewById(R.id.Passwordlog);
        final Button Signin = (Button) findViewById(R.id.buttonsignin);
        final TextView googlebook = (TextView) findViewById(R.id.googleBook);
        final Button google = (Button) findViewById(R.id.google);
        final Button facebook = (Button) findViewById(R.id.facebook);
        final TextView donthaveaccount = (TextView) findViewById(R.id.donthaveaccount);
        final TextView signuplogin = (TextView) findViewById(R.id.SignUpLogin);
        signuplogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent registerIntent = new Intent(LoginActivity.this , RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);

            }
        });


    }
}
