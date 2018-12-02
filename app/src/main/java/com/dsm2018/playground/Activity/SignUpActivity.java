package com.dsm2018.playground.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.dsm2018.playground.R;

public class SignUpActivity extends AppCompatActivity {
    EditText ID;
    EditText password;
    EditText passwordConfirm;
    EditText name;
    TextView signUp;
    OnClickListener onClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        onClickListener = new OnClickListener();

        ID = findViewById(R.id.et_id);
        password = findViewById(R.id.et_password);
        passwordConfirm = findViewById(R.id.et_passwordConfirm);
        name = findViewById(R.id.et_name);
        signUp = findViewById(R.id.btn_signUp);
    }

    class OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_login:
                    Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                    startActivity(intent);
            }
        }

    }
}

