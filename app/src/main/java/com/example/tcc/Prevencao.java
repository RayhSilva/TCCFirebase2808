package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Prevencao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevencao);
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.dados_usuario:
                usuario();
                return true;
            case R.id.administrador:
                adm();
                return true;
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }

    public void usuario() {
        Intent intent = new Intent(this, DadosUsuario.class);
        startActivity(intent);
    }
    public void adm() {
        String url = "https://soscapivari.ifspcapivari.com.br/login.php";
        Intent urlIntent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
        );
        startActivity(urlIntent);
    }

}
