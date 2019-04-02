package com.example.Prueba1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private EditText txt;
    private Button btn;
    private LinearLayout ll;
    private int segundo = 1000;
    char[] Mensaje;
    private int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (EditText) findViewById(R.id.etxtInsertar);          //Defino mi editor de texto
        btn = (Button) findViewById(R.id.btnOK);                   //Defino mi boton
        ll = (LinearLayout) findViewById(R.id.llPrincipal);


      /*  btn.setOnClickListener(new View.OnClickListener() {     //Al hace click en el boton llamo a un grupo de funciones   morse
            @Override
            public void onClick(View v) {
                String txtConvertido = Morse();                                  //Llamo a la funcion que define el codigo morse

                msj(txtConvertido);
            }

        });*/

    }

    //----------------------------------------------------------------------------------------------Funcion llamada al dar click

    public void darClck(View v) {

                String txtConvertido = Morse();                                  //Llamo a la funcion que define el codigo morse
                msj(txtConvertido);

    }



    //----------------------------------------------------------------------------------------------Funcion txtMorse (Devuelve una cadena en unos y ceros)
    public String Morse() {

        String txtExtraido = txt.getText().toString();                      //Extraigo el texto ingresado
        String txtConvertido = "0";                                         //Creo una cadena que siempre comenzara en apagado

        txtExtraido.toLowerCase();                                          //Convierto a minuscula

        char[] txtArray = txtExtraido.toCharArray();                        //Creo un arreglo que contiene todas las letras de la cadena

        for (int i = 0; i < txtArray.length; i++) {                         //Recorro el arreglo




            /*El siguiente switch convierte cada letra en ceros y unos, los ceros representan luz apagada y los unos la luz encendida,
            al estar dos unos unidos representan la duracion de la luz, sin apagar, el doble de lo que equivale un solo uno*/

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
                    txtConvertido.concat("000");                                  //Espacio entre palabra
                default:
                    break;
            }

            txtConvertido.concat("00000");                                        //Final de la oracion

        }

        return (txtConvertido);                                                   //Devuelve la cadena convertida en unos y ceros
    }


    //----------------------------------------------------------------------------------------------Funcion Mensaje (Devuelve la luz)
    public void msj(String txtC) {
        Mensaje = txtC.toCharArray();

        for (i = 0; i < Mensaje.length; i++) {


                    if (Mensaje[i] == 1) {
                        ll.setBackgroundColor(Color.WHITE);
                    } else {
                        ll.setBackgroundColor(Color.BLACK);
                    }


                    try {
                        Thread.sleep(segundo);
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }

                }
        }
}
