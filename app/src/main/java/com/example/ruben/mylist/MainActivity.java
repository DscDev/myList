package com.example.ruben.mylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listPokemons;
    List<Pokemon> pokemonList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listPokemons  = (ListView) findViewById(R.id.listPokemons);

        Pokemon pokemon1 = new Pokemon("Pikachu" , "Pika Pika","pokemon_1");
        Pokemon pokemon2 = new Pokemon("Squartle" , "Vamo' a calmarno'","pokemon_2");
        Pokemon pokemon3 = new Pokemon("Bulbasour" , "Bubaaa","pokemon_3");
        Pokemon pokemon4 = new Pokemon("Charmander" , "Chaaaaar","pokemon_4");

        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);
        pokemonList.add(pokemon3);
        pokemonList.add(pokemon4);

        ListAdapter adapter = new ListAdapter(pokemonList,MainActivity.this);
        listPokemons.setAdapter(adapter);

        listPokemons.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Pokemon pokemon = pokemonList.get(position);
                Intent intent = new Intent(MainActivity.this,PokemonDetail.class);
                intent.putExtra("name", pokemon.getName());
                startActivity(intent);

            }
        });

    }
}
