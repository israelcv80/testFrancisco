package com.example.roland.testaapp.ui.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.roland.testaapp.R;

import java.util.zip.Inflater;

public class FragmentOptionThree extends Fragment {


    private ConstraintLayout constraintLayout;
    private ListView listView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        constraintLayout = (ConstraintLayout) inflater.inflate(R.layout.fragment_option_three,container,false);
        listView = constraintLayout.findViewById(R.id.listViewProjects);


        return constraintLayout;
    }
}
