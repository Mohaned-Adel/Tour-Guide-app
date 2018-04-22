package com.example.mohaned.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mohaned on 4/22/2018.
 */

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment(){
        // it requires an empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

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

        placeAdapter adapter = new placeAdapter (getActivity(), places, R.color.category_restaurants);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;


    }
}
