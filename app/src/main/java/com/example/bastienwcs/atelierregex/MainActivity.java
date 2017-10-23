package com.example.bastienwcs.atelierregex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText) findViewById(R.id.name);
        final EditText age = (EditText) findViewById(R.id.age);
        final EditText address = (EditText) findViewById(R.id.address);
        final EditText email = (EditText) findViewById(R.id.email);
        Button send = (Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isNameOk = false;
                // TODO: check Name here

                if (!isNameOk) {
                    name.setError("Le nom ne doit contenir que des caractères alphabétiques");
                }

                boolean isAgeOk = false;
                // TODO: check Age here

                if (!isAgeOk) {
                    age.setError("L\'âge ne doit contenir que des caractères numériques");
                }

                boolean isAddressOk = false;
                // TODO: check Address here

                if (!isAddressOk) {
                    address.setError("L'adresse doit avoir la forme : n° et rue, code postal ville");
                }

                boolean isEmailOk = false;
                // TODO: check Email here

                if (!isEmailOk) {
                    email.setError("L'adresse email n\'a pas le bon format");
                }
            }
        });
    }
}
