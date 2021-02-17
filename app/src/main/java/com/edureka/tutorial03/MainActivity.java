package com.edureka.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUsername,edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtpassword);

    }

    public void btnLoginClick(View view) {

        String valUsername = edtUsername.getText().toString();
        String valPassword = edtPassword.getText().toString();
        if(valUsername.equals("puru bhai") && valPassword.equals("123456"))
        {
            Toast.makeText(this, "Login Sucssesfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,Welcome.class);
            startActivity(intent);
            finish();

            

        }
        else{
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }


    }
}