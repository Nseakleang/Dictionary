package com.seakleang.dictionary.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.seakleang.dictionary.R;
import com.seakleang.dictionary.data.dao.DictionaryDao;
import com.seakleang.dictionary.data.dao.HistoryDao;

import java.util.List;

public class HistoryAdapter extends BaseAdapter {
    List<String>  wordList;
    HistoryDao historyDao;

    public HistoryAdapter(List<String>  wordList, HistoryDao historyDao){
        this.wordList = wordList;
        this.historyDao = historyDao;
    }

    // count item in array or arrayList
    @Override
    public int getCount() {
        return wordList.size();
    }

    //return item
    @Override
    public Object getItem(int position) {
        return wordList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //convert layout from xml and bind data
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
        if(convertView == null)
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.history_layout_item, parent, false);
        else
            view = convertView;

        //create view Object
        TextView word = view.findViewById(R.id.tvHistoryWord);
        TextView date = view.findViewById(R.id.tvDate);
        TextView time = view.findViewById(R.id.tvTime);

        word.setText(wordList.get(position));
        date.setText(historyDao.getDateById(position+1));
        time.setText(historyDao.getTimeById(position+1));

        return view ;
    }
}
