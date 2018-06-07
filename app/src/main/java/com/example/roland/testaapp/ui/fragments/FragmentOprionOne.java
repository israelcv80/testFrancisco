package com.example.roland.testaapp.ui.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.roland.testaapp.R;

public class FragmentOprionOne extends Fragment {
    ConstraintLayout constraintLayout;
    WebView webView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        constraintLayout = (ConstraintLayout) inflater.inflate(R.layout.fragment_option_one,container,false);
        webView = constraintLayout.findViewById(R.id.webViewGoogle);
        webView.loadUrl("https://www.google.com/");
        webView.getSettings().setJavaScriptEnabled(true);


        return constraintLayout;
    }
}
