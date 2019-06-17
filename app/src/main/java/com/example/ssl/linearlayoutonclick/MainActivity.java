package com.example.ssl.linearlayoutonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText username,password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.Username);
        password = (EditText)findViewById(R.id.Password);
        login = (Button) findViewById(R.id.Login);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = username.getText().toString();
        String pass = password.getText().toString();
        Toast.makeText(MainActivity.this,"Username:"+name+"\n"+"Password:"+pass,Toast.LENGTH_LONG).show();

    }
}
