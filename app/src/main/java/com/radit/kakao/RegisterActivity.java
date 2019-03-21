package com.radit.kakao;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Calendar;

public class RegisterActivity extends AppCompatActivity implements  DatePickerDialog.OnDateSetListener {

    private EditText inputEmail, inputPassword, inputName,inputKTP,inputNomorHP;
    private FirebaseAuth auth;
    private Button btnSignUp;
    String tgllahir ="";
    private ProgressDialog PD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        PD = new ProgressDialog(this);
        PD.setMessage("Loading...");
        PD.setCancelable(true);
        PD.setCanceledOnTouchOutside(false);

        auth = FirebaseAuth.getInstance();

        if (auth.getCurrentUser() != null) {
            startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            finish();
        }

        inputEmail = (EditText) findViewById(R.id.emailregister);
        inputPassword = (EditText) findViewById(R.id.passwordregister);
        inputName = (EditText) findViewById(R.id.name);
        inputKTP = (EditText) findViewById(R.id.noID);
        inputNomorHP = (EditText) findViewById(R.id.nohp);



        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = inputEmail.getText().toString();
                final String password = inputPassword.getText().toString();
                final String nama = inputName.getText().toString();
                final String ktp = inputKTP.getText().toString();
                final String nohp = inputNomorHP.getText().toString();



                try {
                    if (password.length() > 0 && email.length() > 0) {
                        PD.show();
                        auth.createUserWithEmailAndPassword(email, password)
                                .addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                        if (!task.isSuccessful()) {
                                            Toast.makeText(
                                                    RegisterActivity.this,
                                                    "Authentication Failed",
                                                    Toast.LENGTH_LONG).show();


                                            Log.v("error", task.getResult().toString());
                                        } else {
                                            FirebaseUser user = auth.getCurrentUser();
                                            FirebaseDatabase database = FirebaseDatabase.getInstance();
                                            DatabaseReference myRef = database.getReference("Biodata").child(user.getUid());

//                                            String namaUser, emailUser, NoKTP, password, NomorHP,TanggalLahir
                                            Profil profil = new Profil(nama,email,ktp,nohp,tgllahir);
                                            myRef.setValue(profil);
                                            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                                            startActivity(intent);

                                            finish();

                                        }
                                        PD.dismiss();
                                    }
                                });
                    } else {
                        Toast.makeText(
                                RegisterActivity.this,
                                "Fill All Fields",
                                Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Button btntgllhr = (Button) findViewById(R.id.buttontanggallahir);
        btntgllhr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(),"date picker ");
            }
        });


    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
        tgllahir=currentDateString;
        Button button = (Button) findViewById(R.id.buttontanggallahir);
        button.setText(currentDateString);
    }
}