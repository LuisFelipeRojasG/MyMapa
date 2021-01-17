package com.stingrey.mymapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {

    MapsActivity maps;
    private ImageButton mapa01, mapa02, mapa03, mapa04;
    private String dato = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se inicializan las variables
        mapa01 = findViewById(R.id.bIrMapa01);
        mapa02 = findViewById(R.id.bIrMapa02);
        mapa03 = findViewById(R.id.bIrMapa03);
        mapa04 = findViewById(R.id.bIrMapa04);

    }

    //Método para identificar el botón presionado
    public void presionado (View view){

        if (mapa01.isPressed()){
            dato = "catedral";
        }else if (mapa02.isPressed()){
            dato = "explora";
        }else if (mapa03.isPressed()){
            dato = "museo";
        }else if (mapa04.isPressed()){
            dato = "arvi";
        }

    }

    //Métodos para ir al mapa de cada ubicación
    public void irCatedral(View view){
        presionado(view);
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("seleccionado", dato);
        startActivity(i);
    }

    public void irExplora(View view){
        presionado(view);
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("seleccionado", dato);
        startActivity(i);
    }

    public void irMuseo(View view){
        presionado(view);
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("seleccionado", dato);
        startActivity(i);
    }

    public void irArvi(View view){
        presionado(view);
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("seleccionado", dato);
        startActivity(i);
    }

}