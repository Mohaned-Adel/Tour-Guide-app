package com.example.mohaned.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mohaned on 4/22/2018.
 */

public class BeachesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.place_list);

        final ArrayList<Place> beaches = new ArrayList<>();

        beaches.add(new Place("Tolip Beach", "Address: Gleem، El-Gaish Rd, Qism El-Raml, Alexandria Governorate", R.drawable.tolip, 4.1));
        beaches.add(new Place("Paradise Inn Beach", "Address: El-Shaheed youssef El-Sebaey Maamoura Beach, alexandria, Maamoura", R.drawable.paradise, 3.9));
        beaches.add(new Place("Montazah Beach", "Address: Al Mandarah Bahri, Qism El-Montaza, Alexandria Governorate", R.drawable.montazah, 4.6));
        beaches.add(new Place("Stanley", "Stanley is a neighborhood near the city centre of Alexandria.", R.drawable.stanli, 4.3));
        beaches.add(new Place("TOLIP Hotel", "Address: 252 El-Gaish Rd, Mustafa Kamel WA Bolkli, Alexandria، Alexandria Governorate", R.drawable.tolip, 4.2));
        beaches.add(new Place("Four Seasons Hotel", "Address: 399 El Geish Road, Alexandria Governorate", R.drawable.fourseasons,4.6));
        beaches.add(new Place("Helnan Palestine Hotel", "Address: Montazah Park، El Saa Square, Al Mandarah Bahri, Qesm Al Montazah،", R.drawable.helnan, 4.4));
        beaches.add(new Place("Hilton Alexandria", "Address: 544 El-Gaish Rd, Sidi Beshr Bahri, Qism El-Montaza, Alexandria Governorate", R.drawable.hilton, 4.4));

        placeAdapter adapter = new placeAdapter(this, beaches, R.color.category_beaches);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
