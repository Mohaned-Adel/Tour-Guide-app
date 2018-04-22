package com.example.mohaned.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mohaned on 4/22/2018.
 */

public class EventsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> events = new ArrayList<>();

        events.add(new Place("Laseronics", "Address: El-Rashid St, Madinet Al Eelam, Al Agouzah", R.drawable.ic_event_black_24dp, 4.5));
        events.add(new Place("Go Events", "Address: 487 Abou Quer, Fleming, Qism El-Raml, Alexandria Governorate 21531", R.drawable.ic_event_black_24dp, 5.0));
        events.add(new Place("QIG Egypt", "Address: 114 Sheraton Heliopolis, Beside Radisson Hotel -Cairo - Egypt., Cairo, Cairo Governorate", R.drawable.ic_event_black_24dp, 5.0));
        events.add(new Place("The Lounge DB", "Address: 17 Abd El-Moneim Hafez, Heliopolis, Cairo, Cairo Governorate", R.drawable.ic_event_black_24dp, 3.2));

        placeAdapter adapter = new placeAdapter(this, events, R.color.category_events);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
