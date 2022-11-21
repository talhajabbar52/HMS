package com.example.hms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

EditText edt_txt_user,edt_txt_user_pass  ;

Button btn_user,btn_admin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_txt_user=findViewById(R.id.edt_txt_user);
        edt_txt_user_pass=findViewById(R.id.edt_txt_user_pass);

       btn_admin=findViewById(R.id.admin_btn);
       btn_user=findViewById(R.id.user_btn);



        btn_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (edt_txt_user.getText().toString().equals("Talha") && edt_txt_user_pass.getText().toString().equals("abc"))
            {
                Intent intent=new Intent(MainActivity.this,UserPanel.class);
                startActivity(intent);

            }
        }









});}}