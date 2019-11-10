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
public class SignUp extends Fragment implements View.OnClickListener {
EditText editText,editText1,editText2;
Button button;

    public SignUp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sign_up, container, false);
        editText=view.findViewById(R.id.etname);
        editText1=view.findViewById(R.id.etpassword);
        editText2=view.findViewById(R.id.etnewpass);
        button=view.findViewById(R.id.btnsignup);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
