package com.example.mohaned.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mohaned on 4/22/2018.
 */

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Samakmak","Address: 60 Sidi Yakout, As Sayalah Gharb, Qesm Al Gomrok, Alexandria Governorate", R.drawable.ic_restaurant_black_24dp, 4));
        places.add(new Place("Tejanos Mexican Grill", "Address: Estoret Louran Tower, 19 Al Akbal, San Stifano, Qism El-Montaza, Alexandria Governorate", R.drawable.ic_restaurant_black_24dp, 3));

        placeAdapter adapter = new placeAdapter(this, places, R.color.category_restaurants);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
