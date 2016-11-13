package com.zaenalabidinal.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button kurang, tambah, hitung;
    private TextView tv_kalkulasi, harga, total;

    int hargakopi = 5000;
    int kalkulasi = 0;
    int total_final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_kalkulasi = (TextView) findViewById(R.id.tv_kalkulasi);
        harga = (TextView) findViewById(R.id.harga);
        total = (TextView) findViewById(R.id.total);
        kurang = (Button) findViewById(R.id.kurang);
        tambah = (Button) findViewById(R.id.tambah);
        hitung = (Button) findViewById(R.id.hitung);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahKalkulasi(kalkulasi + hargakopi);
                displayHasil(kalkulasi);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurangKalkulasi(kalkulasi - hargakopi);
                displayHasil(kalkulasi);
            }
        });

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kaliKalkulasi(kalkulasi * hargakopi);
                displayHasilTotal(total_final);
            }
        });
    }

    private void tambahKalkulasi(int number) {

        kalkulasi = kalkulasi + 1;
    }

    private void kurangKalkulasi(int number) {

        kalkulasi = kalkulasi - 1;
    }

    private void kaliKalkulasi(int number) {

        total_final = kalkulasi * hargakopi;
    }

    private void displayHasil(int number) {
        tv_kalkulasi.setText("" + number);
    }

    private void displayHasilTotal(int number) {
        total.setText("Total : Rp " + number + "\nThank You!!");
    }

    public void testerOnClick(View view){
        Toast.makeText(getApplicationContext(), "Tester OnClick",Toast.LENGTH_SHORT).show();
    }
//    private void displayTotal(int number) { total.setText("Total Harga :" + number);}

//    private void displayHasilFinal(int number) {
//        total.setText("" + number);
//    }
//
//    private void displayTotalFinal(int number) {
//        total.setText("Total Harga : " + number);
//    }
}