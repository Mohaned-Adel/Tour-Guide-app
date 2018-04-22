package com.example.mohaned.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Mohaned on 4/21/2018.
 */

public class listCategory extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_categories);

        TextView restaurants = (TextView) findViewById(R.id.restaurant);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantPage = new Intent(listCategory.this, RestaurantsActivity.class);
                startActivity(restaurantPage);
            }
        });
    }
}