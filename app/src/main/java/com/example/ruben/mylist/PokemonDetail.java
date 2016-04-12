package com.example.ruben.mylist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Ruben on 12/04/2016.
 */
public class PokemonDetail extends AppCompatActivity {

    String name = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pokemon_detail);
        name = getIntent().getStringExtra("name");
        Toast.makeText(PokemonDetail.this,name, Toast.LENGTH_SHORT).show();
        }
}
