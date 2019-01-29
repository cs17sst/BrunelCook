package com.example.shama.brunelcook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Home extends Fragment{

    /**this is the home page and the home.xml is the corresponding resource
    *it has already been set as the default page so when the app is run, it shows
    *the home page
     *please use import android.support.v4.app.Fragment; for any fragments you create
    */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home, container, false);
    }
}
