package com.amyunus.jakartacityguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by amyunus on 8/6/17.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    public AttractionAdapter(Activity context, int resource, ArrayList<Attraction> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listObjectView = convertView;
        if (listObjectView == null) {
            listObjectView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentObject = getItem(position);

        TextView objectTitle = (TextView) listObjectView.findViewById(R.id.object_title);
        objectTitle.setText(currentObject.getAttraction());

        TextView objectLocation = (TextView) listObjectView.findViewById(R.id.object_location);
        objectLocation.setText(currentObject.getLocation());

        ImageView objectThumbnail = (ImageView) listObjectView.findViewById(R.id.object_thumbnail);
        objectThumbnail.setImageResource(currentObject.getThumbnail());

        return listObjectView;
    }
}

