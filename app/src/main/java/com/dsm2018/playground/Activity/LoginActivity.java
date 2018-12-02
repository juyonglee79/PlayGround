package com.dsm2018.playground.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.dsm2018.playground.R;

public class LoginActivity extends AppCompatActivity {
    EditText ID;
    EditText password;
    TextView login;
    TextView findPassword;
    TextView signUp;
    OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        onClickListener = new OnClickListener();

        ID = findViewById(R.id.et_id);
        password = findViewById(R.id.et_password);
        login = findViewById(R.id.btn_login);
        login.setOnClickListener(onClickListener);
        findPassword = findViewById(R.id.tv_findPassword);
        signUp = findViewById(R.id.tv_signUp);
        signUp.setOnClickListener(onClickListener);
    }

    class OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_login:
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                case R.id.tv_signUp:
                    Intent intent2 = new Intent(LoginActivity.this, SignUpActivity.class);
                    startActivity(intent2);
            }
        }
    }

}
