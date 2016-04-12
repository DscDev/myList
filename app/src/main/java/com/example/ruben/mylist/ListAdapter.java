package com.example.ruben.mylist;

import android.content.Context;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter {
    private List<Pokemon> pokemonList = new ArrayList<>();
    private Context context;

    public ListAdapter(List<Pokemon> pokemonList, Context context) {
        this.pokemonList = pokemonList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pokemonList.size();
    }

    @Override
    public Object getItem(int position) {
        return pokemonList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View newView = convertView;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            newView = inflater.inflate(R.layout.pokemon_row, parent, false);
        }

        TextView lblName = (TextView) newView.findViewById(R.id.lblName);
        TextView lblNickname = (TextView) newView.findViewById(R.id.lblNickname);
        ImageView imgPokemon  = (ImageView) newView.findViewById(R.id.imgPokemon);

        Pokemon pokemon = pokemonList.get(position);
        lblName.setText(pokemon.getName());
        lblNickname.setText(pokemon.getNickname());

        int id = context.getResources().getIdentifier(pokemon.getImage(),"drawable",context.getPackageName());
        imgPokemon.setImageResource(id);

        return newView;
    }
}
