package com.example.exercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt_anoNasci, txt_anoActu;
    TextView sair, sair1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calcula (View view){
        txt_anoNasci = findViewById(R.id.txt_anaNasc);
        txt_anoActu = findViewById(R.id.txt_anaAct);
         sair = findViewById(R.id.textView);
         sair1 = findViewById(R.id.textView2);

         int anoNascimento = Integer.parseInt(txt_anoNasci.getText().toString());
         int anoActual = Integer.parseInt(txt_anoActu.getText().toString());

         int idadeAct = anoActual - anoNascimento;
         int idade2 = 2050 - anoNascimento;

         sair.setText("Idade Actual:" +String.valueOf(idadeAct)+"Anos");
         sair1.setText("Idade em 2050:" +String.valueOf(idade2)+"Anos");

    }
}