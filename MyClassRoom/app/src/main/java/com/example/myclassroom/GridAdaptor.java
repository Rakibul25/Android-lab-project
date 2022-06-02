package com.example.myclassroom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdaptor extends BaseAdapter {
    Context context;
    private final String[] arrayofmenuname;
    private final int[] images;
    private LayoutInflater layoutInflater;
    public GridAdaptor(Context context,String[] arrayofmenuname,int[] images){
        this.context = context;
        this.arrayofmenuname = arrayofmenuname;
        this.images = images;
    }



    @Override
    public int getCount() {
        return arrayofmenuname.length;
    }

    @Override
    public Object getItem(int position) {
        return arrayofmenuname[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridview = convertView;
        if (convertView == null){
            layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            gridview = layoutInflater.inflate(R.layout.gridmenuview,null);
        }

        ImageView imageView = (ImageView)gridview.findViewById(R.id.imageview);
        TextView textView = (TextView)gridview.findViewById(R.id.textincus);

        imageView.setImageResource(images[position]);
        textView.setText(arrayofmenuname[position]);

        return gridview;

    }
}
