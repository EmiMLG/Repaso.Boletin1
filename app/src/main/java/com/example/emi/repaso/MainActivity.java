package com.example.emi.repaso;

import android.media.MediaPlayer;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    //PROBLEMA 5.1: Declaración de vista con ButterKnife
    @BindView(R.id.button)Button button;
    @BindView(R.id.activity_main___edit_text)EditText editText;
    @BindView(R.id.activity_main___text_view)TextView textView;
    @BindView(R.id.activity_main___image_view)ImageView imageView;

    MediaPlayer mediaPlayer; //PROBLEMA 8: Creamos el objeto MediaPlayer y le damos un nombre.


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ButterKnife.bind(this); //PROBLEMA 5.2: Linea imprescindible para la librería ButterKnife
            mediaPlayer = MediaPlayer.create(this, R.raw.sound_button); //PROBLEMA 8.2: Le asignamos el sonido descargado

            Log.d("Este es el problema 1","Hola mundo" ); //PROBLEMA 1 Imprimir en codiante nsola, meLog.d
            /*Button button;              //PROBLEMA 2 Creación de un botón. Declaramos las secciones del XML y le ponemos un nombre
            final EditText editText;     //PROBLEMA 3.1: Añadir un campo de edición de texto a la actividad, donde poder escibir
            final TextView textview;     //PROBLEMA 4: Añadir un textView*/


            //Declaracion de botones con findViewbyID **NOTA** con ButterKnife ya se declaran arriba.
            /*button = (Button) findViewById(R.id.button);
            editText = (EditText) findViewById(R.id.activity_main___edit_text);
            textview = (TextView) findViewById(R.id.activity_main___text_view);*/



            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();//PROBLEMA 8.3 Inciamos el sonido al pulsar el botón

                    //PROBEMA 3.2: al pulsar el botón, se debe imprimir por la consola lo que tengamos escrito en el campo de texto
                    String addText; //¿Qué vamos a introducir en el EditText? En este caso un String y le pondremos un nombre
                    addText = editText.getText().toString(); //PROBLEMA 3.3: A esa variable le damos el nombre que anteriormente le hemos declarado.
                    textView.setText(addText); //PROBREMA 4: Cogemos con setText
                    //Log.d(addText, "PROBLEMA 3");//PROBLEMA 3.4: Imprimimos por consola con el Log, dándole el nombre de la variable.
                    //Log.d("PROBLEMA 2", "El botón ha sido pulsado");

                    Snackbar.make(editText,"texto cortico",Snackbar.LENGTH_LONG ).show();//PROBLEMA 6: Mostrar SnackBar
                    imageView.setVisibility(View.GONE);//PROBLEMA 7: Hacer invisible una imagen al pulsar el botón

                }
            });







        }





}