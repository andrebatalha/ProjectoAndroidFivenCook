package com.example.atecdroid.fivencook.activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.atecdroid.fivencook.R;


public class AvLogin extends AppCompatActivity {

    EditText edt, edt2;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText edt = (EditText) findViewById(R.id.editText);
        final EditText edt2 = (EditText) findViewById(R.id.editText2);
        Button bt = (Button) findViewById(R.id.button);

        edt.setHint(Html.fromHtml("<small>" +"Nome de utilizador" + "</small>" ));
        edt.setHintTextColor(Color.parseColor("#7a7979"));
        edt2.setHint(Html.fromHtml("<small>" +"Palavra-passe" + "</small>" ));
        edt2.setHintTextColor(Color.parseColor("#7a7979"));
        bt.setHint(Html.fromHtml("<small>" +"Iniciar sessão" + "</small>" ));
        bt.setHintTextColor(Color.parseColor("white"));

        edt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        edt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user = edt.getText().toString();
                pass = edt2.getText().toString();

                if(user.equals("admin") && (pass.equals("admin"))){

                    Intent i = new Intent(AvLogin.this, AvMainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
