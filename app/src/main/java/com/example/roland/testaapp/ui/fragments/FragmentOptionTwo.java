package com.example.roland.testaapp.ui.fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.roland.testaapp.R;

public class FragmentOptionTwo extends Fragment implements View.OnClickListener {
    private ConstraintLayout constraintLayout;
    private Button buttonToast;
    private Button buttonDialog;
    private Activity self;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        self =getActivity();
        constraintLayout = (ConstraintLayout) inflater.inflate(R.layout.fragment_option_two,container,false);

        buttonDialog = constraintLayout.findViewById(R.id.buttonDialog);
        buttonToast = constraintLayout.findViewById(R.id.buttonToast);
        buttonToast.setOnClickListener(this);
        buttonDialog.setOnClickListener(this);

        return constraintLayout;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonDialog:
                AlertDialog.Builder builder = new AlertDialog.Builder(self);
                builder.setTitle("Attention!").setMessage("Say Hello!!!").setPositiveButton("say hello", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setNegativeButton("i dont want to",null);

                builder.create().show();
                break;
            case R.id.buttonToast:
                Toast.makeText(self, "Hello, with toast!!", Toast.LENGTH_LONG).show();
                break;
                default:
                    break;

        }
    }
}
