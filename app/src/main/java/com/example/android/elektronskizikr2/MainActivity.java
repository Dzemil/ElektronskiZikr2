package com.example.android.elektronskizikr2;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int numSub = 0;
    int numElh = 0;
    int numAll = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button subPlus = findViewById(R.id.plus_SubAllah);
        Button subMinus = findViewById(R.id.minus_SubAllah);
        Button elhPlus = findViewById(R.id.plus_ElhAllah);
        Button elhMinus = findViewById(R.id.minus_ElhAllah);
        Button allPlus = findViewById(R.id.plus_AllEkber);
        Button allMinus = findViewById(R.id.minus_AllEkber);

        subPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView subCounter = findViewById(R.id.sub_counter);

                if (numSub == 33) {
                    Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                    v.vibrate(400);

                    Toast toast =
                            Toast.makeText(getApplicationContext(),
                                    "Dostigao si 33 ponavljanja",
                                    Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                numSub += 1;
                subCounter.setText(String.valueOf(numSub));
            }
        });

        subMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView subCounter = findViewById(R.id.sub_counter);

                if (numSub == 0) {
                    Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                    v.vibrate(400);

                    Toast toast =
                            Toast.makeText(getApplicationContext(),
                                    "Vratio/la si se na 0",
                                    Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                numSub -= 1;
                subCounter.setText(String.valueOf(numSub));
            }
        });

        elhPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView subCounter = findViewById(R.id.elh_counter);
                if (numElh == 33) {
                    Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                    v.vibrate(400);

                    Toast toast =
                            Toast.makeText(getApplicationContext(),
                                    "Dostigao si 33 ponavljanja",
                                    Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                numElh += 1;
                subCounter.setText(String.valueOf(numElh));
            }
        });

        elhMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView subCounter = findViewById(R.id.elh_counter);

                if (numElh == 0) {
                    Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                    v.vibrate(400);

                    Toast toast =
                            Toast.makeText(getApplicationContext(),
                                    "Vratio/la si se na 0",
                                    Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                numElh -= 1;
                subCounter.setText(String.valueOf(numElh));
            }
        });

        allPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView subCounter = findViewById(R.id.alla_counter);
                if (numAll == 33) {
                    Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                    v.vibrate(400);

                    Toast toast =
                            Toast.makeText(getApplicationContext(),
                                    "Dostigao si 33 ponavljanja",
                                    Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                numAll += 1;
                subCounter.setText(String.valueOf(numAll));
            }
        });

        allMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView subCounter = findViewById(R.id.alla_counter);
                if (numAll == 0) {
                    Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                    v.vibrate(400);

                    Toast toast =
                            Toast.makeText(getApplicationContext(),
                                    "Dostigao si 33 ponavljanja",
                                    Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                numAll -= 1;
                subCounter.setText(String.valueOf(numAll));
            }
        });
    }
}
