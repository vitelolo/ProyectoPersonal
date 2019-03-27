package com.example.Prueba1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(EditText)findViewById(R.id.etxtInsertar);
    }

    public void textoAMorse(){
        String textoExtraido = txt.getText().toString();


        char[] textoArray = textoExtraido.toCharArray();
        for (int i = 0; i < textoArray.length; i++) {

            if(textoArray[i]=='a')
            {

        // A . -
            }

        }

    }

}
