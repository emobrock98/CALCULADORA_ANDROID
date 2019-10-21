package com.example.calculadoraevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero,mas,menos,entre,por,igual,borr,seno,
            coseno,tangente,cotangente;
    TextView entrada;
    TextView salida;
    boolean operando = false;
    double op1, op2,resultado=0;
    int tipoOperacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
        if(getApplication().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            accionesLand();
        }

    }

    private void instancias(){
        uno = this.findViewById(R.id.uno);
        dos = this.findViewById(R.id.dos);
        tres = this.findViewById(R.id.tres);
        cuatro = this.findViewById(R.id.cuatro);
        cinco = this.findViewById(R.id.cinco);
        seis = this.findViewById(R.id.seis);
        siete = this.findViewById(R.id.siete);
        ocho = this.findViewById(R.id.ocho);
        nueve = this.findViewById(R.id.nueve);
        cero = this.findViewById(R.id.cero);
        igual = this.findViewById(R.id.igual);
        borr = this.findViewById(R.id.borr);
        mas = this.findViewById(R.id.mas);
        menos = this.findViewById(R.id.menos);
        entre = this.findViewById(R.id.entre);
        por = this.findViewById(R.id.por);
        entrada = this.findViewById(R.id.entrada);
        salida = this.findViewById(R.id.salida);
        seno = this.findViewById(R.id.sen);
        coseno = this.findViewById(R.id.cos);
        tangente = this.findViewById(R.id.tg);
        cotangente = this.findViewById(R.id.cotg);
    }

    private void acciones(){
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        cero.setOnClickListener(this);
        igual.setOnClickListener(this);
        mas.setOnClickListener(this);
        menos.setOnClickListener(this);
        por.setOnClickListener(this);
        entre.setOnClickListener(this);
        borr.setOnClickListener(this);
        salida.setOnClickListener(this);
    }
    private void accionesLand()
    {
        seno.setOnClickListener(this);
        coseno.setOnClickListener(this);
        tangente.setOnClickListener(this);
        cotangente.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.uno:
                if (!operando) {
                    entrada.setText(entrada.getText() + "1");
                } else
                    entrada.setText("1");
                break;
            case R.id.dos:
                if (!operando) {
                    entrada.setText(entrada.getText() + "2");
                } else
                    entrada.setText("2");
                break;
            case R.id.tres:
                if (!operando) {
                    entrada.setText(entrada.getText() + "3");
                } else
                    entrada.setText("3");
                break;
            case R.id.cuatro:
                if (!operando) {
                    entrada.setText(entrada.getText() + "4");
                } else
                    entrada.setText("4");
                break;
            case R.id.cinco:
                if (!operando) {
                    entrada.setText(entrada.getText() + "5");
                } else
                    entrada.setText("5");
                break;
            case R.id.seis:
                if (!operando) {
                    entrada.setText(entrada.getText() + "6");
                } else
                    entrada.setText("6");
                break;
            case R.id.siete:
                if (!operando) {
                    entrada.setText(entrada.getText() + "7");
                } else
                    entrada.setText("7");
                break;
            case R.id.ocho:
                if (!operando) {
                    entrada.setText(entrada.getText() + "8");
                } else
                    entrada.setText("8");
                break;
            case R.id.nueve:
                if (!operando) {
                    entrada.setText(entrada.getText() + "9");
                } else
                    entrada.setText("9");
                break;
            case R.id.mas:
                operando = true;
                if(entrada.getText() != ""){
                    op1 = Double.valueOf(entrada.getText().toString());
                    tipoOperacion = 1;}
                break;
            case R.id.menos:
                if(entrada.getText() != ""){
                    operando = true;
                    op1 = Double.valueOf(entrada.getText().toString());
                    tipoOperacion = 2;}
                break;
            case R.id.por:
                if(entrada.getText() != ""){
                    operando = true;
                    op1 = Double.valueOf(entrada.getText().toString());
                    tipoOperacion = 3;}
                break;
            case R.id.entre:
                if(entrada.getText() != ""){
                    operando = true;
                    op1 = Double.valueOf(entrada.getText().toString());
                    tipoOperacion = 4;}
                break;
            case R.id.sen:
                if(entrada.getText() != ""){
                    operando = true;
                    op1 = Double.valueOf(entrada.getText().toString());
                    tipoOperacion = 5;}
                break;
            case R.id.cos:
                if(entrada.getText() != ""){
                    operando = true;
                    op1 = Double.valueOf(entrada.getText().toString());
                    tipoOperacion = 6;}
                break;
            case R.id.tg:
                if(entrada.getText() != ""){
                    operando = true;
                    op1 = Double.valueOf(entrada.getText().toString());
                    tipoOperacion = 7;}
                break;
            case R.id.cotg:
                if(entrada.getText() != ""){
                    operando = true;
                    op1 = Double.valueOf(entrada.getText().toString());
                    tipoOperacion = 8;}
                break;
            case R.id.borr:
                entrada.setText("");
                salida.setText("");
                operando=false;
                break;
            case R.id.igual:
                op2 = Double.valueOf(entrada.getText().toString());
                switch (tipoOperacion){
                    case 1:
                        resultado = op1+op2;
                        break;
                    case 2:
                        resultado = op1-op2;
                        break;
                    case 3:
                        resultado = op1*op2;
                        break;
                    case 4:
                        resultado = op1/op2;
                        break;
                    case 5:
                        resultado = Math.sin(op1);
                        break;
                    case 6:
                        resultado = Math.cos(op1);
                        break;
                    case 7:
                        resultado = Math.tan(op1);
                        break;
                    case 8:
                        resultado = Math.tanh(op1);
                        break;
                }
                salida.setText(String.valueOf(resultado));
                operando=false;
                entrada.setText("");


        }
    }
}
