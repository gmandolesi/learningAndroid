package com.learning.a006_planetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Country> countries;
    private static MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 - AdapterView
        listView = findViewById(R.id.listOfNations);

        // 2 - Data source
        countries = new ArrayList<>();

        countries.add(new Country("Brazil", "5", R.drawable.brazil));
        countries.add(new Country("Germany", "4", R.drawable.germany));
        countries.add(new Country("France", "2", R.drawable.france));
        countries.add(new Country("Spain", "1", R.drawable.spain));
        countries.add(new Country("England", "1", R.drawable.unitedkingdom));
        countries.add(new Country("United States", "0", R.drawable.unitedstates));
        countries.add(new Country("Saudi Arabia", "0", R.drawable.saudiarabia));

        // 3 - Adapter
        adapter = new MyCustomAdapter(countries, getApplicationContext());

        listView.setAdapter(adapter);

        // 4 - Handling the click events
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+adapter.getItem(position).getCountryName()+" won the \nWolrd Cup "+
                        adapter.getItem(position).getWins()+" times",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}