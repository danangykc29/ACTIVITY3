package com.example.linearlayoutdanang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variable untuk button
    Button btnLogin;

    //Deklarasi variable untuk EditText
    EditText edmail, edpassword;

    //Deklarasi variable untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variable btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btnSignin);

        //menghubungkan variable dmail dengan componen button pada layout
        edmail = findViewById(R.id.edEmail);

        //menghubungkan variable edpassword dengan componen button pada layout
        edpassword = findViewById(R.id.edPassword);
    }//membuat fungsi onclick pada button btnlogin
    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //menyimpan input user di edit text password kedalam variable nama
            nama = edmail.getText().toString();
            //menyimpan input user di edittext passworc kedalam variable password
            password = edpassword.getText().toString();
            //mengeset email yang benar
            String email = "admin@mail.com";
            //mengeset password yang benar
            String pass = "123";
            //mengecek apakah isi dari email dan password sudah sama dengan email dan pass terdapat isi atau tidak
            id (nama.isEmpty() || password.isEmpty()) {
                //membuat variable toast dan menampilkan pesan
                Toast t = Toast.makeText(getApplicationContext(),
                        "Email dan password wajib diisi"
                        Toast.LENGHT_LONG);
                //menampilkan toast
            t.show();
            }else{
                //mengecek apakahisi dari email dan pass sudah sama
                id (nama.equals(email) && password.equals(pass)) {
                    //membuat variable toast dan menampilkan pesan "Login sukses"
                Toast t = Toast.makeText(getApplicationContext(),
                        "Login Sukses"
                        Toast.LENGHT_LONG);
                t.show();
                Bundle b = new Bundle();
                b.putString("a" nama.trim());
                b.putSrtring("b" password.trim());
                Intent i = new Intent(getApplicationContext(), ActivityHasil.class);
                i.putExtras(b);
                -startActivity(i
                }else{
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login gagal" Toast.LENGHT_LONG);
                    t.show();
                }

            }
        }

    }
};

