package com.example.jerrydengu.eazyeats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
    }
}
