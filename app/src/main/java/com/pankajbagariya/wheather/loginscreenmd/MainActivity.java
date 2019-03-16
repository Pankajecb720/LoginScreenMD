package com.pankajbagariya.wheather.loginscreenmd;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private TextInputLayout inputLayoutName,inputLayoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        inputLayoutName = (TextInputLayout) findViewById(R.id.inputLayoutUsername);
        inputLayoutPassword= (TextInputLayout) findViewById(R.id.inputLayoutPassword);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
    }

    //Login button Click event
    public void validateAndLogin(View view) {

        if(validateName() && validatePassword()){

            Toast.makeText(this, R.string.login_success, Toast.LENGTH_SHORT).show();
        }
        // else do something
    }

    private boolean validateName(){
        if (etUsername.getText().toString().isEmpty()){
            inputLayoutName.setError(getString(R.string.username_validation_msg));
            return false;
        }else {
            inputLayoutName.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validatePassword(){
        String pwd = etPassword.getText().toString().trim();
        if (pwd.length()<8){
            inputLayoutPassword.setError(getString(R.string.pwd_validation_msg));
            return false;
        }else{
            inputLayoutPassword.setErrorEnabled(false);
            return true;
        }
    }
}
















