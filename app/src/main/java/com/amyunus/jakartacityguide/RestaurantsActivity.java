package com.amyunus.jakartacityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by amyunus on 8/6/17.
 */

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new RestaurantsFragment())
                .commit();
    }
}
