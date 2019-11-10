package com.om.andriodform.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.om.andriodform.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignIn extends Fragment implements View.OnClickListener {
    EditText etN,etP;
    Button btnS;

    public SignIn() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sign_in, container, false);
        etN=view.findViewById(R.id.etfis);
        etP=view.findViewById(R.id.etsec);
        btnS=view.findViewById(R.id.btnc);
        btnS.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
