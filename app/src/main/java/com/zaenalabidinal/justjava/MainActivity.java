package com.zaenalabidinal.justjava;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView nama;
    private TextView kota;
    private TextView jenkel;
    private Button submit;
    private Button reset;
    private Button intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        nama = (TextView) findViewById(R.id.nama);
        kota = (TextView) findViewById(R.id.kota);
        jenkel = (TextView) findViewById(R.id.jenkel);
        submit = (Button) findViewById(R.id.submit);
        reset = (Button) findViewById(R.id.reset);
        intent = (Button) findViewById(R.id.intent);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama_saya = nama.getText().toString();
                String kota_saya = kota.getText().toString();
                String jenkel_saya = jenkel.getText().toString();
                Toast.makeText(MainActivity.this, "Nama Saya : " + nama_saya +"\n Nama Kota :" + kota_saya +"\n Jenis Kelamin :" + jenkel_saya, Toast.LENGTH_SHORT).show();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
//
//                alert.setTitle("Hallo ini alert pertama saya");
//                alert.setMessage("Haii...??");
//
//                alert.show();

                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setMessage("Hai");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Welcome To My Application", Toast.LENGTH_SHORT).show();
                        setContentView(R.layout.activity_layout2);
                    }
                });
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"Selesai",Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
                alert.show();
            }
        });
        intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSaya = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intentSaya);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else if (id== R.id.action_exit){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
