package com.jerry.colist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by jerry on 16/11/14.
 */
public class ListItemAdapter extends BaseAdapter{

    //Variables
    private Context itemContext = null;
    private ArrayList <ListItem> arrayListItem = null;
    private LayoutInflater itemLayoutInflater = null;

    public ListItemAdapter (Context context, ArrayList <ListItem> arrayList) {
        itemContext = context;
        itemLayoutInflater = LayoutInflater.from(context);
        arrayListItem = arrayList;
    }

    @Override
    public Object getItem(int position) {
        return arrayListItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public int getCount (){
        return arrayListItem.size();
    }

    static class Holder {
        ImageView coImage;
        TextView coName;
        TextView coDedicated;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        View view = convertView;
        //Check if view is null
        if (view == null){
            holder = new Holder ();
            view = itemLayoutInflater.inflate(R.layout.list_item,null);
            holder.coImage = (ImageView) view.findViewById(R.id.coImage);
            holder.coName = (TextView) view.findViewById(R.id.txtCompanyName);
            holder.coDedicated = (TextView) view.findViewById(R.id.txtDedicated);
            view.setTag(holder);
        }
        else{
            holder=(Holder)view.getTag();

        }
        holder.coImage.setImageDrawable(arrayListItem.get(position).getCoImage());
        holder.coName.setText(arrayListItem.get(position).getCoName());
        holder.coDedicated.setText(arrayListItem.get(position).getCoDedicated());
        return view;
    }
}
