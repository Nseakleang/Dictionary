package com.seakleang.dictionary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class BookmarkAdapter extends BaseAdapter {

    private Context context;
    private String[] source;

    public BookmarkAdapter(Context context, String[] source){
        this.context = context;
        this.source = source;
    }

    @Override
    public int getCount() {
        return source.length;
    }

    @Override
    public Object getItem(int position) {
        return source[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.bookmark_layout_item, parent, false);
            viewHolder.textView = convertView.findViewById(R.id.textViewBookmark);
            viewHolder.imageView = convertView.findViewById(R.id.imageViewDelete);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textView.setText(source[position]);
        return convertView;
    }

    class ViewHolder{
        TextView textView;
        ImageView imageView;
    }
}
