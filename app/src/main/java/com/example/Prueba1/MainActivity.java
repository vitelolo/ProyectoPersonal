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
        txt = (EditText) findViewById(R.id.etxtInsertar);          //Defino mi editor de texto
        btn = (Button) findViewById(R.id.btnOK);                   //Defino mi boton

        btn.setOnClickListener(new View.OnClickListener() {     //Al hace click en el boton llamo a un grupo de funciones   morse
            @Override
            public void onClick(View v) {
                String txtConvertido = txtAMorse();                                  //Llamo a la funcion que define el codigo morse

                Mensaje(txtConvertido);
            }
        });
    }


    public String txtAMorse() {

        String txtExtraido = txt.getText().toString();
        String txtConvertido = "0";

        txtExtraido.toLowerCase();

        char[] txtArray = txtExtraido.toCharArray();

        for (int i = 0; i < txtArray.length; i++) {


            switch (txtArray[i]) {
                case 'a':
                    txtConvertido.concat("10110");
                    break; //a-z
                case 'b':
                    txtConvertido.concat("110101010");
                    break;
                case 'c':
                    txtConvertido.concat("1101011010");
                    break;
                case 'd':
                    txtConvertido.concat("1101010");
                    break;
                case 'e':
                    txtConvertido.concat("10");
                    break;
                case 'f':
                    txtConvertido.concat("101011010");
                    break;
                case 'g':
                    txtConvertido.concat("11011010");
                    break;
                case 'h':
                    txtConvertido.concat("10101010");
                    break;
                case 'i':
                    txtConvertido.concat("1010");
                    break;
                case 'j':
                    txtConvertido.concat("10110110110 ");
                    break;
                case 'k':
                    txtConvertido.concat("11010110");
                    break;
                case 'l':
                    txtConvertido.concat("101101010");
                    break;
                case 'm':
                    txtConvertido.concat("110110");
                    break;
                case 'n':
                    txtConvertido.concat("11010");
                    break;
                case 'ñ':
                    txtConvertido.concat("11011010110110");
                    break;
                case 'o':
                    txtConvertido.concat("110110110");
                    break;
                case 'p':
                    txtConvertido.concat("1011011010");
                    break;
                case 'q':
                    txtConvertido.concat("11011010110 ");
                    break;
                case 'r':
                    txtConvertido.concat("1011010");
                    break;
                case 's':
                    txtConvertido.concat("101010");
                    break;
                case 't':
                    txtConvertido.concat("110");
                    break;
                case 'u':
                    txtConvertido.concat("1010110");
                    break;
                case 'v':
                    txtConvertido.concat("101010110");
                    break;
                case 'w':
                    txtConvertido.concat("10110110");
                    break;
                case 'x':
                    txtConvertido.concat("1101010110");
                    break;
                case 'y':
                    txtConvertido.concat("11010110110");
                    break;
                case 'z':
                    txtConvertido.concat("1101101010");
                    break;
                case ' ':
                    txtConvertido.concat("000");
                    break;
                default:
                    break;
            }

            txtConvertido.concat("00000");

        }

        return (txtConvertido);
    }

    public void Mensaje(String txtConvertido) {

        char[] Mensaje = txtConvertido.toCharArray();

        for (int i = 0; i < Mensaje.length; i++) {

        }

    }

}
