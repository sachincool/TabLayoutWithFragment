package com.example.root.tablayoutwithfragment;

import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by root on 12/1/18.
 */

public class FragmentStore extends Fragment {
View view;
    public FragmentStore() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
  view=inflater.inflate(R.layout.store_fragment,container,false);
  return view;


    }
}
