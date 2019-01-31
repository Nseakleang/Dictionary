package com.seakleang.dictionary;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DictionaryFragment extends Fragment {

//    FragmentListener listener;

    public DictionaryFragment() {
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
        return inflater.inflate(R.layout.fragment_dictionary, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        Button btnGotoDetail = view.findViewById(R.id.btnGotoDetail);
//        btnGotoDetail.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                listener.onItemClick();
//                Intent intent = new Intent(getActivity(), DetailActivity.class);
//                intent.putExtra("Title", "Word");
//                startActivity(intent);
//            }
//        });

        ListView listView = view.findViewById(R.id.listWord);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, getListOfWord());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra("Word", getListOfWord()[position]);
                startActivity(intent);
            }
        });
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

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

//    public void setListener(FragmentListener listener) {
//        this.listener = listener;
//    }
}
