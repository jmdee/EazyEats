package com.example.jerrydengu.eazyeats;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

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
                Intent registerIntent = new Intent(LoginActivity.this ,MainActivity.class);
                LoginActivity.this.startActivity(registerIntent);

            }
        });
        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username = Emaillogin.getText().toString();
                final String password = Passwordlog.getText().toString();
                Response.Listener<String> resoponseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                        JSONObject jsonResponse = new JSONObject(response);
                        boolean success = jsonResponse.getBoolean("success");
                        if(success){
                            String name = jsonResponse.getString("name");
                            String surname = jsonResponse.getString("surname");
                            Intent intent = new Intent(LoginActivity.this,LoginRequest.class);
                            LoginActivity.this.startActivity(intent);
                        }else{
                            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                            builder.setMessage("Login Failed")
                                    .setNegativeButton("Retry", null)
                                    .create()
                                    .show();
                        }
                    }
                    catch(JSONException e){
                        e.printStackTrace();
                    }
                }
                };
                LoginRequest loginRequest = new LoginRequest(username,password,resoponseListener);
            }

        });


    }
}
