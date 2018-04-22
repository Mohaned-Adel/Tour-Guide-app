package com.example.mohaned.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mohaned on 4/22/2018.
 */

public class MuseumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> museums = new ArrayList<>();

        museums.add(new Place("Alexandria National Museum", "Address: 131 El-Shaheed Galal El-Desouky, Bab Sharqi WA Wabour Al Meyah, Qesm Bab Sharqi, Alexandria Governorate", R.drawable.alexnational, 4.4));
        museums.add(new Place("Royal Jewelry Museum", "Address: 27 Ahmed Yehia Pasha, Alexandria Governorate", R.drawable.royal, 4.6));
        museums.add(new Place("Graeco-Roman Museum", "Address: Al Mesallah Sharq, Qesm Al Attarin, Alexandria Governorate", R.drawable.grecoroman, 3.5));
        museums.add(new Place("Cavafy Museum", "Address: off Salah Moustafa street, at the end of Cavafy street. 2nd floor، Qesm Al Attarin, Alexandria Governorate", R.drawable.cavafy, 4.1));
        museums.add(new Place("Mahmoud Said Museum", "Address: 6 Mohamed Pasha Said St.، GANAKLIS، Qism El-Raml, Alexandria Governorate", R.drawable.mahmoudsaid, 4.2));
        museums.add(new Place("Alexandria Aquarium", "Address: Qaitbay St.، EL ANFOUSHI، Qesm Al Gomrok, Alexandria Governorate", R.drawable.alexaquarium, 4.1));
        museums.add(new Place("Roman Auditorium", "Address: Kom Ad Dakah Gharb, Qesm Al Attarin, Alexandria Governorate", R.drawable.roman, 4.2));

        placeAdapter adapter = new placeAdapter(this, museums, R.color.category_museums);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
