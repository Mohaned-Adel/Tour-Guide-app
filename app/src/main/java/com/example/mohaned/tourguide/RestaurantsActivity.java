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

        places.add(new Place("Samakmak","Address: 60 Sidi Yakout, As Sayalah Gharb, Qesm Al Gomrok, Alexandria Governorate", R.drawable.samakmak, 4.2));
        places.add(new Place("Tejanos Mexican Grill", "Address: Estoret Louran Tower, 19 Al Akbal, San Stifano, Qism El-Montaza, Alexandria Governorate", R.drawable.tejanos, 4.5));
        places.add(new Place("Balbaa", "Address: Abis, Qesm Al Amereyah, Alexandria Governorate", R.drawable.balbaa, 4.2));
        places.add(new Place("Sea Gull Restaurant", "Address: Al Meks, Qesm Ad Dekhilah, Alexandria Governorate", R.drawable.seagull, 4.3));
        places.add(new Place("Olé Café", "Address: Abu an Nawatir, Qism Sidi Gabir, Alexandria Governorate", R.drawable.olecafe, 4.2));
        places.add(new Place("Abd El Wahab grills Village", "Address: Cairo Alex Desert Rd, Abis, Qism Moharram Bek, Alexandria Governorate", R.drawable.abdelwahab, 4.2));
        places.add(new Place("Byblos", "Address: El-Gaish Rd, Alexandria, Alexandria Governorate 21599", R.drawable.balbaa, 4.5));
        places.add(new Place("Aroos El Bahr Fish Restaurant", "Address: 11 Sidi Nasr El-Deen, As Sayalah Sharq, Qesm Al Gomrok, Alexandria Governorate", R.drawable.arooselbahr, 4.2));
        places.add(new Place("Pablo Cafe & Restaurant", "Address: El-Gaish Rd, San Stifano, Qism El-Raml, Alexandria Governorate", R.drawable.pablo, 4.1));
        places.add(new Place("Delices", "Address: 46 Saad Zaghloul, Raml Station, Alexandria Governorate", R.drawable.delices, 4.4));
        places.add(new Place("Fish Market", "Address: El-Gaish Rd, Al Mazar, Qesm Al Gomrok, Alexandria Governorate", R.drawable.fishmarket,4.2));

        placeAdapter adapter = new placeAdapter(this, places, R.color.category_restaurants);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
