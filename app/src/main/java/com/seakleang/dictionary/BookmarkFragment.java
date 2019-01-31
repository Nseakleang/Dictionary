package com.seakleang.dictionary;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BookmarkFragment extends Fragment {
    ListView listView;
    public BookmarkFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bookmark, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = view.findViewById(R.id.listViewBookmark);
        BookmarkAdapter adapter = new BookmarkAdapter(getActivity(), getListOfWord());
        listView.setAdapter(adapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    String[] getListOfWord(){
        String[] words = new String[]{
                "a"
                ,"abandon"
                ,"abandoned"
                ,"ability"
                ,"able"
                ,"about"
                ,"above"
                ,"abroad"
                ,"absence"
                ,"absent"
                ,"absolute"
                ,"absolutely"
                ,"absorb"
                ,"abuse"
                ,"abuse"
                ,"academic"
                ,"accent"
                ,"accept"
                ,"acceptable"
                ,"access"
                ,"accident"
                ,"accidental"
                ,"accidentally"
                ,"accommodation"
                ,"accompany"
                ,"according to"
                ,"account"
        };
        return words;
    }
}
