package com.example.roland.testaapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.roland.testaapp.R;
import com.example.roland.testaapp.models.Project;

import java.util.ArrayList;

public class AdapterProjects extends ArrayAdapter<Project>

{
    LayoutInflater inflater;
    ArrayList<Project> projectArrayList = new ArrayList<>();
    public AdapterProjects(@NonNull Context context,ArrayList<Project> projectArrayList) {
        super(context, 0);
        this.projectArrayList = projectArrayList;
        inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.layout_project_row,parent,false);
        TextView tvName = linearLayout.findViewById(R.id.tvName);
        TextView tvUrl = linearLayout.findViewById(R.id.tvUrl);
        TextView tvDescription = linearLayout.findViewById(R.id.tvDescription);
        Project project = projectArrayList.get(position);

        tvName.setText(project.getName());
        tvUrl.setText(project.getUrl());
        tvDescription.setText(project.getDescription());
        return linearLayout;
    }
}
