package com.example.converter_application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.WindowDecorActionBar;

import java.text.DecimalFormat;


public class MainActivity extends Activity {


   // DecimalFormat usaDf = new DecimalFormat();

    Spinner color;
    Spinner color1;
    // GUI widgets
    Button btnConvert;
    Button btnClear;
    EditText txtKwacha;
    TextView text;
    TextView convert;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtKwacha = (EditText)findViewById(R.id.txtKwacha);


        // attach click behavior to buttons
        btnClear = (Button)findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new OnClickListener() {
            // clear the text boxes
            @Override
            public void onClick(View v) {
                txtKwacha.setText("");
                convert.setText("Converted Amount");

            }
        });

        // do the conversion from USD to Euros and Colones
        btnConvert = (Button) findViewById(R.id.btnConvert);
        convert = findViewById(R.id.convert);
        btnConvert.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String quantity = txtKwacha.getText().toString();
                    //usdStr = txtUSDollars.getText().toString();
                    double quantity1 = Double.parseDouble(quantity);
                    double quantity2 = 0;


                    color=(Spinner) findViewById(R.id.color);
                    color1=(Spinner) findViewById(R.id.color1);
                    text=(TextView) findViewById(R.id.convert);
                  String first = String.valueOf(color.getSelectedItem());
                   String second=String.valueOf(color1.getSelectedItem());


                    if(first.equals("Meters(m)") && second.equals("Meters(m)")){
                       quantity2 = quantity1 * 1;
                    }
                    else if(first.equals("Centimeters(cm)") && second.equals("Centimeters(cm)")){
                        quantity2 = quantity1 * 1;
                    }
                    else if(first.equals("Litres(L)") && second.equals("Litres(L)")){
                        quantity2 = quantity1 * 1;
                    }
                    else if(first.equals("MilliLitres(mL)") && second.equals("MilliLitres(mL)")){
                        quantity2 = quantity1 * 1;
                    }
                    else if(first.equals("Kilograms(Kg)") && second.equals("kilograms(Kg)")){
                        quantity2 = quantity1 * 1;
                    }
                    else if(first.equals("Grams(g)") && second.equals("Grams(g)")){
                        quantity2 = quantity1 * 1;
                    }
                    //meters to centimeters and vice versa
                    else if(first.equals("Meters(m)") && second.equals("Centimeters(cm)")){
                        quantity2 = quantity1 * 100;
                    }
                    else if(first.equals("Centimeters(cm)") && second.equals("Meters(m)")){
                        quantity2 = quantity1 / 100;
                    }
                    //Litres to milliLitres and vice versa
                    else if(first.equals("Litres(L)") && second.equals("MilliLitres(mL)")){
                        quantity2 = quantity1 * 1000;
                    }
                    else if(first.equals("MilliLitres(mL)") && second.equals("Litres(L)")){
                        quantity2 = quantity1 / 1000;
                    }
                    //kilograms to litres and vice versa
                    else if(first.equals("Kilograms(Kg)") && second.equals("Grams(g)")){
                        quantity2 = quantity1 * 1000;
                    }
                    else if(first.equals("Grams(g)") && second.equals("Kilograms(Kg)")){
                        quantity2 = quantity1 / 1000;
                    }

                    Double currency= quantity2;
                    String quantity3 = String.valueOf(currency);
                    text.setText(quantity3);



                } catch (NumberFormatException e) {
                    // ignore errors
                }

            }
        });// setOnClick...

    }// onCreate

    }