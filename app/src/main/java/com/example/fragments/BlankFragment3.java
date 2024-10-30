package com.example.fragments;

import android.app.Person;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

public class BlankFragment3 extends Fragment {
    public static RecyclerView recyclerView;
    public static RecyclerView.Adapter myAdapter;
    public static RecyclerView.LayoutManager layoutManager;

    public BlankFragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank3, container, false);
        recyclerView=view.findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);
        myAdapter=new Person_Adapter(this.getActivity(),MainActivity.people);
        recyclerView.setAdapter(myAdapter);
        return view;
    }
    public static void notifyDataSetChanged(){
        myAdapter.notifyDataSetChanged();
    }
}