package com.example.Prueba1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.os.CountDownTimer;
import  java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private EditText txt;
    private Button btn;
    private CountDownTimer timer;
    private int segundo = 1000;
    private boolean timerCorriendo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(EditText)findViewById(R.id.etxtInsertar);          //Defino mi editor de texto
        btn=(Button)findViewById(R.id.btnOK);                   //Defino mi boton

        btn.setOnClickListener(new View.OnClickListener() {     //Al hace click en el boton llamo a un grupo de funciones   morse
            @Override
            public void onClick(View v) {
                String conversion = txtAMorse();                                  //Llamo a la funcion que define el codigo morse

            }
        });
    }


    public String txtAMorse(){
        String txtExtraido = txt.getText().toString();
        String txtConvertido = "";

        txtExtraido.toLowerCase();

        char[] textoArray = txtExtraido.toCharArray();
        for (int i = 0; i < textoArray.length; i++) {


            switch (textoArray[i])
            {
                case 'a': txtConvertido.concat("10110"); break; //a-z
                case 'b': txtConvertido.concat("110101010"); break;
                case 'c': txtConvertido.concat("1101011010"); break;
                case 'd': txtConvertido.concat("1101010"); break;
                case 'e': txtConvertido.concat("10"); break;
                case 'f': txtConvertido.concat("101011010"); break;
                case 'g': txtConvertido.concat("11011010"); break;
                case 'h': txtConvertido.concat("10101010"); break;
                case 'i': txtConvertido.concat("1010"); break;
                case 'j': txtConvertido.concat("10110110110 "); break;
                case 'k': txtConvertido.concat("11010110"); break;  //POr aqui me quede
                case 'l': txtConvertido.concat("10110"); break;
                case 'm': txtConvertido.concat("10110"); break;
                case 'n': txtConvertido.concat("10110"); break;
                case 'ñ': txtConvertido.concat("10110"); break;
                case 'o': txtConvertido.concat("10110"); break;
                case 'p': txtConvertido.concat("10110"); break;
                case 'q': txtConvertido.concat("10110"); break;
                case 'r': txtConvertido.concat("10110"); break;
                case 's': txtConvertido.concat("10110"); break;
                case 't': txtConvertido.concat("10110"); break;
                case 'u': txtConvertido.concat("10110"); break;
                case 'v': txtConvertido.concat("10110"); break;
                case 'w': txtConvertido.concat("10110"); break;
                case 'x': txtConvertido.concat("10110"); break;
                case 'y': txtConvertido.concat("10110"); break;
                case 'z': txtConvertido.concat("10110"); break;

                case '1': txtConvertido.concat("10110"); break; //1-0
                case '2': txtConvertido.concat("10110"); break;
                case '3': txtConvertido.concat("10110"); break;
                case '4': txtConvertido.concat("10110"); break;
                case '5': txtConvertido.concat("10110"); break;
                case '6': txtConvertido.concat("10110"); break;
                case '7': txtConvertido.concat("10110"); break;
                case '8': txtConvertido.concat("10110"); break;
                case '9': txtConvertido.concat("10110"); break;
                case '0': txtConvertido.concat("10110"); break;

                default: break;
            }


        }
        return("");
    }

}
