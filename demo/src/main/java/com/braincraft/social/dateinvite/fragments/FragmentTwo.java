package com.braincraft.social.dateinvite.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.braincraft.social.dateinvite.R;


/**
 * Created by Anu on 22/04/17.
 */



public class FragmentTwo extends Fragment {
    View view;
    public FragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.slide_screen2, container, false);


      /*  View  viewbutton2 = (View) getActivity().findViewById(R.id.logindemo1);
        viewbutton2.setVisibility(View.INVISIBLE);*/
// get the reference of Button
        // secondButton = (Button) view.findViewById(R.id.secondButton);
// perform setOnClickListener on second Button
       /* secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "Second Fragment", Toast.LENGTH_LONG).show();
            }
        });*/
        return view;
    }

}