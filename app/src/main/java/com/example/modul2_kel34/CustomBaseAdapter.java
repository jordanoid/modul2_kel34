package com.example.modul2_kel34;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String listName[];
    String listNIM[];
    LayoutInflater inflater;

    public CustomBaseAdapter (Context ctx, String [] nameList, String [] NIMList){
        this.context = ctx;
        this.listName = nameList;
        this.listNIM = NIMList;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.single_item, null);
        TextView nameView = (TextView) convertView.findViewById(R.id.tvNama);
        TextView nimView = (TextView) convertView.findViewById(R.id.tvNIM);
        nameView.setText(listName[position]);
        nimView.setText(listNIM[position]);
        return convertView;
    }
}