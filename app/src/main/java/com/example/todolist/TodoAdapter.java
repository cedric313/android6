package com.example.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class TodoAdapter extends ArrayAdapter<Todo> {

        public TodoAdapter(Context context, List<Todo> doIt) {
            super(context, 0, doIt);
        }
        @Override

        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO 1 : Get the data item for this position
            Todo item = getItem(position);

            // TODO 2 : Check if an existing view is being reused, otherwise inflate the view
            if (null == convertView) {
                convertView = LayoutInflater.from(getContext())
                        .inflate(R.layout.item_todo, parent, false);
            }
            // TODO 3 : Lookup view for data population
            TextView textDescription = convertView.findViewById(R.id.tvDescription);
            TextView textDate = convertView.findViewById(R.id.tvDate);

            // TODO 4 : Populate the data into the template view using the data object
            textDescription.setText(item.getDescription());

            textDate.setText(item.getDate());

            // Return the completed view to render on screen
            return convertView;
        }
    }

