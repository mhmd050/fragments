package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragment2 extends Fragment {
    private Button add;
    private EditText name ,phone;

    public BlankFragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_blank2, container, false);
        name=view.findViewById(R.id.textView);
        phone=view.findViewById(R.id.textView4);
        add=view.findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().trim().isEmpty()||phone.getText().toString().trim().isEmpty()){
                    Toast.makeText(getActivity(),"please fill all fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    String n ,p;
                    n=name.getText().toString().trim();
                    p=phone.getText().toString().trim();
                    MainActivity.people.add(new Person(n , p , R.drawable.baseline_person_24));
                    Toast.makeText(getActivity(),"person added successfully", Toast.LENGTH_SHORT).show();
                    name.setText("");
                    phone.setText("");
                    BlankFragment3.notifyDataSetChanged();
                }
            }
        });
        return view;
    }
}