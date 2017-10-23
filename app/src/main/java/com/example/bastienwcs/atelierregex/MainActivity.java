package com.example.bastienwcs.atelierregex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                String nameContent = name.getText().toString();
                Pattern pattern = Pattern.compile("^[\\-a-zA-Z ]+$");
                Matcher m = pattern.matcher(nameContent);
                while (m.find()) {
                    isNameOk = true;
                }
                if (!isNameOk) {
                    name.setError(getResources().getString(R.string.error_name));
                }

                boolean isAgeOk = false;
                String ageContent = age.getText().toString();
                Pattern pattern2 = Pattern.compile("^[0-9]{1,3}+$");
                Matcher m2 = pattern2.matcher(ageContent);
                while (m2.find()) {
                    isAgeOk = true;
                }
                if (!isAgeOk) {
                    age.setError(getResources().getString(R.string.error_age));
                }

                boolean isAddressOk = false;
                String addressContent = address.getText().toString();
                Pattern pattern3 = Pattern.compile("[0-9]{1,4}[a-zA-Z ,]+$");
                Matcher m3 = pattern3.matcher(addressContent);
                while (m3.find()) {
                    isAddressOk = true;
                }
                if (!isAddressOk) {
                    address.setError(getResources().getString(R.string.error_address));
                }

                boolean isEmailOk = false;
                String emailContent = email.getText().toString();
                Pattern pattern4 = Pattern.compile("[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}");
                Matcher m4 = pattern4.matcher(emailContent);
                while (m4.find()) {
                    isEmailOk = true;
                }

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
