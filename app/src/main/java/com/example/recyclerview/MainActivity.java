package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private RecyclerView thisRecycler;
    private ArrayList<Advertise> AdvertArray;
    private ArrayList<Content> ContentArray;
    private MyAdapter myAdapterReff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        init();


    }

    public void init(){

        setContentView(R.layout.activity_main);

        thisRecycler = findViewById(R.id.MainactRecyclerV);
        thisRecycler.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));


        AdvertArray = new ArrayList<Advertise>();
        AdvertArray.add(new Advertise(R.drawable.rummy_cards,"Play rummy & win prizes"));
        AdvertArray.add(new Advertise(R.drawable.township,"Flat in Pune @ 40 lakhs"));


        ContentArray = new ArrayList<Content>();
        ContentArray.add(new Content("Optical Mouse","450/-",R.drawable.mouse));
        ContentArray.add(new Content("Car Freshener","150/-",R.drawable.car_freshener));
        ContentArray.add(new Content("Computer Table","1500/-",R.drawable.computer_table));
        ContentArray.add(new Content("Connector Cable","250/-",R.drawable.connecter_cable));
        ContentArray.add(new Content("Gogles","1300/-",R.drawable.gogles));
        ContentArray.add(new Content("Keyboard","450/-",R.drawable.keyboard));
        ContentArray.add(new Content("Laptop","45000/-",R.drawable.laptop));
        ContentArray.add(new Content("Oven","6500/-",R.drawable.oven));
        ContentArray.add(new Content("Oven","2500/-",R.drawable.cloth_iron));
        ContentArray.add(new Content("Water Bottle","300/-",R.drawable.water_bottle));
        ContentArray.add(new Content("Ubmrella","550/-",R.drawable.umbrella));
        ContentArray.add(new Content("Optical Mouse","450/-",R.drawable.mouse));
        ContentArray.add(new Content("Car Freshener","150/-",R.drawable.car_freshener));
        ContentArray.add(new Content("Computer Table","1500/-",R.drawable.computer_table));
        ContentArray.add(new Content("Oven","2500/-",R.drawable.cloth_iron));
        ContentArray.add(new Content("Connector Cable","250/-",R.drawable.connecter_cable));
        ContentArray.add(new Content("Gogles","1300/-",R.drawable.gogles));
        ContentArray.add(new Content("Water Bottle","300/-",R.drawable.water_bottle));
        ContentArray.add(new Content("Keyboard","450/-",R.drawable.keyboard));
        ContentArray.add(new Content("Oven","2500/-",R.drawable.cloth_iron));
        ContentArray.add(new Content("Laptop","45000/-",R.drawable.laptop));
        ContentArray.add(new Content("Oven","6500/-",R.drawable.oven));
        ContentArray.add(new Content("Ubmrella","550/-",R.drawable.umbrella));
        ContentArray.add(new Content("Water Bottle","300/-",R.drawable.water_bottle));




        myAdapterReff = new MyAdapter(AdvertArray,ContentArray);
        thisRecycler.setAdapter(myAdapterReff);


    }
}


