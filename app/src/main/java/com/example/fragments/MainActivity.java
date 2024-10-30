package com.example.fragments;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements Person_Adapter.ItemSelected {
    public static ArrayList<Person> people;
    TextView tvDate;
    String CurrentDate;
    Calendar calender=Calendar.getInstance();
    FragmentManager fragmentManager;
    BlankFragment3 listFrag;
    BlankFragment detailFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDate=findViewById(R.id.textView6);
        fragmentManager=this.getSupportFragmentManager();
        CurrentDate= DateFormat.getDateInstance(DateFormat.FULL).format(calender.getTime());
        tvDate.setText(CurrentDate);
        listFrag=(BlankFragment3) fragmentManager.findFragmentById(R.id.fragmentContainerView3);
        initArray();
        detailFrag=(BlankFragment) fragmentManager.findFragmentById(R.id.fragmentContainerView);
    }
    public static void initArray (){
        people = new ArrayList<>();
        people.add(new Person("Saleh","0522952887",R.drawable.saleh));
        people.add(new Person("Mahmod","0503652954",R.drawable.holi));
        people.add(new Person("Diab","0535255800",R.drawable.debo));
        people.add(new Person("Abo Romi","0525314005",R.drawable.abo_romi));
        people.add(new Person("Azzam","0528734466",R.drawable.azzam));
        people.add(new Person("Ahmad Rami","0522942260",R.drawable.ahmad));
        people.add(new Person("Muhammed Khaled","0503656115",R.drawable.mohamed_khaled));
    }

    @Override
    public void onItemSelected(int index) {
        if (!people.isEmpty()){
            detailFrag.updateTexts(people.get(index).getName(),people.get(index).getPhone(),people.get(index).getImage());
        }
        else{
            return ;
        }
    }

    @Override
    public void onItemClicked(int Index) {

    }
}