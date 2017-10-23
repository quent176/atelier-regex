package com.example.bastienwcs.atelierregex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                    name.setError(getResources().getString(R.string.error_name));
                }

                boolean isAgeOk = false;
                // TODO: check Age here

                if (!isAgeOk) {
                    age.setError(getResources().getString(R.string.error_age));
                }

                boolean isAddressOk = false;
                // TODO: check Address here

                if (!isAddressOk) {
                    address.setError(getResources().getString(R.string.error_address));
                }

                boolean isEmailOk = false;
                // TODO: check Email here

                if (!isEmailOk) {
                    email.setError(getResources().getString(R.string.error_email));
                }

                if (isNameOk && isAgeOk && isAddressOk && isEmailOk) {
                    Toast.makeText(MainActivity.this,
                            getResources().getString(R.string.success), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
