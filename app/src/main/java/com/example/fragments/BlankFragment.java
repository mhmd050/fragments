package com.example.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class BlankFragment extends Fragment {
    private ImageView image;
    private TextView name,phone;

    public BlankFragment() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        name=view.findViewById(R.id.textView2);
        phone=view.findViewById(R.id.textView3);
        image=view.findViewById(R.id.imageView2);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNum = phone.getText().toString().trim();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNum));
                startActivity(intent);
            }
        });
        return view;
    }
    public void updateTexts (String st1 , String st2 , int img){
        name.setText(st1);
        phone.setText(st2);
        image.setImageResource(img);
    }
}