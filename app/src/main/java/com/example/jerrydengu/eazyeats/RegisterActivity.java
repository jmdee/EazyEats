package com.example.jerrydengu.eazyeats;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText Namereg = (EditText) findViewById(R.id.Namereg);
        final EditText Surnamereg = (EditText) findViewById(R.id.Surnamereg );
        final EditText Emailreg = (EditText) findViewById(R.id.Emailreg);
        final EditText phonereg = (EditText) findViewById(R.id.phonereg );
        final EditText Cityreg = (EditText) findViewById(R.id.Cityreg);
        final EditText streetReg = (EditText) findViewById(R.id.streetReg);
        //final TextView Agereg = (TextView) findViewById(R.id. );
        final Button  Buttonreg = (Button) findViewById(R.id.Buttonreg);
        final EditText Passwordreg = (EditText) findViewById(R.id.Passwordreg);
        final TextView douaccountreg = (TextView) findViewById(R.id.Qnaccount);
        final TextView Signinreg = (TextView) findViewById(R.id.Signinreg);
        Signinreg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent loginIntent = new Intent(RegisterActivity.this,LoginActivity.class);
                RegisterActivity.this.startActivity(loginIntent);
            }
        });
        Buttonreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = Namereg.getText().toString();
                final String surname = Surnamereg.getText().toString();
                final String address = streetReg.getText().toString();
                final String username = Emailreg.getText().toString();
                final String password = Passwordreg.getText().toString();
                final String city = Cityreg.getText().toString();
                final  int number = Integer.parseInt(phonereg.getText().toString());
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                RegisterActivity.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Registration Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                    }
                };
                RegisterRequest registerRequest = new RegisterRequest(name,surname,address,username,password,city,number,responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });
    }
}
