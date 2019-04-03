package com.example.Prueba1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private EditText txt;
    private Button btn;
    private LinearLayout ll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (EditText) findViewById(R.id.etxtInsertar);          //Defino mi editor de texto
        btn = (Button) findViewById(R.id.btnOK);                   //Defino mi boton
        ll = (LinearLayout) findViewById(R.id.llPrincipal);


      btn.setOnClickListener(new View.OnClickListener() {     //Al hace click en el boton llamo a un grupo de funciones   morse
            @Override
            public void onClick(View v) {
                String txtConvertido = Morse();                                  //Llamo a la funcion que define el codigo morse

                msj(txtConvertido);
            }

        });

    }

    //----------------------------------------------------------------------------------------------Funcion llamada al dar click





    //----------------------------------------------------------------------------------------------Funcion txtMorse (Devuelve una cadena en unos y ceros)
    public String Morse() {

        String txtExtraido = txt.getText().toString();                      //Extraigo el texto ingresado
        String txtConvertido = "00";                                         //Creo una cadena que siempre comenzara en apagado

        txtExtraido.toLowerCase();                                          //Convierto a minuscula

        char[] txtArray = txtExtraido.toCharArray();                        //Creo un arreglo que contiene todas las letras de la cadena

        for (int i = 0; i < txtArray.length; i++) {                         //Recorro el arreglo




            /*El siguiente switch convierte cada letra en ceros y unos, los ceros representan luz apagada y los unos la luz encendida,
            al estar dos unos unidos representan la duracion de la luz, sin apagar, el doble de lo que equivale un solo uno*/

            switch (txtArray[i]) {
                case 'a':                                       //letras
                    txtConvertido=txtConvertido + "10110";
                    break; //a-z
                case 'b':
                    txtConvertido=txtConvertido +"110101010";
                    break;
                case 'c':
                    txtConvertido=txtConvertido +"1101011010";
                    break;
                case 'd':
                    txtConvertido=txtConvertido +"1101010";
                    break;
                case 'e':
                    txtConvertido=txtConvertido +"10";
                    break;
                case 'f':
                    txtConvertido=txtConvertido +"101011010";
                    break;
                case 'g':
                    txtConvertido=txtConvertido +"11011010";
                    break;
                case 'h':
                    txtConvertido=txtConvertido +"10101010";
                    break;
                case 'i':
                    txtConvertido=txtConvertido +"1010";
                    break;
                case 'j':
                    txtConvertido=txtConvertido +"10110110110 ";
                    break;
                case 'k':
                    txtConvertido=txtConvertido +"11010110";
                    break;
                case 'l':
                    txtConvertido=txtConvertido +"101101010";
                    break;
                case 'm':
                    txtConvertido=txtConvertido +"110110";
                    break;
                case 'n':
                    txtConvertido=txtConvertido +"11010";
                    break;
                case 'ñ':
                    txtConvertido=txtConvertido +"11011010110110";
                    break;
                case 'o':
                    txtConvertido=txtConvertido +"110110110";
                    break;
                case 'p':
                    txtConvertido=txtConvertido +"1011011010";
                    break;
                case 'q':
                    txtConvertido=txtConvertido +"11011010110 ";
                    break;
                case 'r':
                    txtConvertido=txtConvertido +"1011010";
                    break;
                case 's':
                    txtConvertido=txtConvertido +"101010";
                    break;
                case 't':
                    txtConvertido=txtConvertido +"110";
                    break;
                case 'u':
                    txtConvertido=txtConvertido +"1010110";
                    break;
                case 'v':
                    txtConvertido=txtConvertido +"101010110";
                    break;
                case 'w':
                    txtConvertido=txtConvertido +"10110110";
                    break;
                case 'x':
                    txtConvertido=txtConvertido +"1101010110";
                    break;
                case 'y':
                    txtConvertido=txtConvertido +"11010110110";
                    break;
                case 'z':
                    txtConvertido=txtConvertido +"1101101010";
                    break;


                case '0':                                               //numeros
                    txtConvertido=txtConvertido +"110110110110110";
                    break;
                case '1':
                    txtConvertido=txtConvertido +"10110110110110";
                    break;
                case '2':
                    txtConvertido=txtConvertido +"1010110110110";
                    break;
                case '3':
                    txtConvertido=txtConvertido +"101010110110";
                    break;
                case '4':
                    txtConvertido=txtConvertido +"10101010110";
                    break;
                case '5':
                    txtConvertido=txtConvertido +"1010101010";
                    break;
                case '6':
                    txtConvertido=txtConvertido +"11010101010";
                    break;
                case '7':
                    txtConvertido=txtConvertido +"110110101010";
                    break;
                case '8':
                    txtConvertido=txtConvertido +"1101101101010";
                    break;
                case '9':
                    txtConvertido=txtConvertido +"11011011011010";
                    break;






                case ' ':
                    txtConvertido=txtConvertido +"000";     //Espacio entre palabra
                    break;
                default:
                    break;
            }

            txtConvertido=txtConvertido +("00000");                                        //Final de la oracion

        }

        return (txtConvertido);                                                   //Devuelve la cadena convertida en unos y ceros
    }


    //----------------------------------------------------------------------------------------------Funcion Mensaje (Devuelve la luz)
    public void msj(final String txtC) {


        final Timer timer = new Timer();
        TimerTask timerTask = new TimerTask(){

            int i=0;
            char[] Mensaje = txtC.toCharArray();

            public void run(){


                if(Mensaje.length <= i)
                {
                    timer.cancel();
                }
                decision(Mensaje, i);
                i++;

            }

        };
        timer.schedule(timerTask, 0, 1000);
    }



    public int decision(char [] Mensaje, int j) {

        if (Mensaje[j]  != '0') {
            ll.setBackgroundColor(Color.WHITE);


        } else {

            ll.setBackgroundColor(Color.BLACK);

        }

        j++;
        return (j);
    }
}
