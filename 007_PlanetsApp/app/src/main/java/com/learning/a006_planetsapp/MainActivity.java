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
    ArrayList<Planet> planetArrayList;
    private static MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listOfPlanets);

        planetArrayList = new ArrayList<>();

        Planet mercury = new Planet("mercury","0 Moons", R.drawable.mercury);
        Planet venus = new Planet("venus", "0 Moons", R.drawable.venus);
        Planet earth = new Planet("Earth", "1 Moon", R.drawable.earth);
        Planet mars = new Planet("mars", "2 Moons", R.drawable.mars);
        Planet jupiter = new Planet("Jupiter","95 Moons", R.drawable.jupiter);
        Planet saturn = new Planet("Saturn", "146 Moons", R.drawable.saturn);
        Planet uranus = new Planet("Uranus", "27 Moons", R.drawable.uranus);
        Planet neptune = new Planet("Neptune", "14 Moons", R.drawable.neptune);
        Planet pluto = new Planet("Pluto", "5 Moons", R.drawable.pluto);

        planetArrayList.add(mercury);
        planetArrayList.add(venus);
        planetArrayList.add(earth);
        planetArrayList.add(mars);
        planetArrayList.add(jupiter);
        planetArrayList.add(saturn);
        planetArrayList.add(uranus);
        planetArrayList.add(neptune);
        planetArrayList.add(pluto);

        adapter = new MyCustomAdapter(planetArrayList, getApplicationContext());

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Planet Name: "+adapter.getItem(position).getPlanetName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}