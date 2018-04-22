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

public class MuseumsFragment extends Fragment {

    public MuseumsFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> museums = new ArrayList<>();

        museums.add(new Place("Alexandria National Museum", "Address: 131 El-Shaheed Galal El-Desouky, Bab Sharqi WA Wabour Al Meyah, Qesm Bab Sharqi, Alexandria Governorate", R.drawable.alexnational, 4.4));
        museums.add(new Place("Royal Jewelry Museum", "Address: 27 Ahmed Yehia Pasha, Alexandria Governorate", R.drawable.royal, 4.6));
        museums.add(new Place("Graeco-Roman Museum", "Address: Al Mesallah Sharq, Qesm Al Attarin, Alexandria Governorate", R.drawable.grecoroman, 3.5));
        museums.add(new Place("Cavafy Museum", "Address: off Salah Moustafa street, at the end of Cavafy street. 2nd floor، Qesm Al Attarin, Alexandria Governorate", R.drawable.cavafy, 4.1));
        museums.add(new Place("Mahmoud Said Museum", "Address: 6 Mohamed Pasha Said St.، GANAKLIS، Qism El-Raml, Alexandria Governorate", R.drawable.mahmoudsaid, 4.2));
        museums.add(new Place("Alexandria Aquarium", "Address: Qaitbay St.، EL ANFOUSHI، Qesm Al Gomrok, Alexandria Governorate", R.drawable.alexaquarium, 4.1));
        museums.add(new Place("Roman Auditorium", "Address: Kom Ad Dakah Gharb, Qesm Al Attarin, Alexandria Governorate", R.drawable.roman, 4.2));

        placeAdapter adapter = new placeAdapter(getActivity(), museums, R.color.category_museums);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
