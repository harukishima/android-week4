package com.example.week4;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<String> {
    private Context context;
    private int resourse;
    Integer[] smallImages;
    String[] contactName; String[] contactNumber;

    public ContactAdapter(Context mainActivityContext, int layoutToBeInflated, String[] name, String[] callNumber, Integer[] thumbnails)
    {
        super(mainActivityContext, R.layout.contactlayout, name);
        this.context = mainActivityContext;
        this.resourse = layoutToBeInflated;
        smallImages = thumbnails;
        this.contactName = name;
        contactNumber = callNumber;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.contactlayout, null);
        if(convertView == null)
        {
            //convertView = LayoutInflater.from(context).inflate(R.layout.contactlayout, parent, false);
            TextView name = (TextView) row.findViewById(R.id.txt1);
            TextView number = (TextView)row.findViewById(R.id.txt2);
            ImageView avatar = (ImageView) row.findViewById(R.id.imageSource);
            name.setText(contactName[position]);
            number.setText(contactNumber[position]);
            avatar.setImageResource(smallImages[0]);
        }

        return (row);
    }
}
