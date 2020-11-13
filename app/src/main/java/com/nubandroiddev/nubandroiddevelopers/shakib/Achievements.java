package com.nubandroiddev.nubandroiddevelopers.shakib;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nubandroiddev.nubandroiddevelopers.R;

public class Achievements extends Fragment {

    public Achievements() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ListView myProjectsListView = (ListView) container.findViewById(R.id.myAchievementsList);

        ArrayAdapter<CharSequence> achievementsAdapter = ArrayAdapter.createFromResource(container.getContext(),R.array.sakib_achievements, android.R.layout.simple_dropdown_item_1line);
        myProjectsListView.setAdapter(achievementsAdapter);


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_achievements, container, false);
    }
}