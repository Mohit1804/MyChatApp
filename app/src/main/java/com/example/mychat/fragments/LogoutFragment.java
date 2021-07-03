package com.example.mychat.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.mychat.R;
import com.example.mychat.StartActivity;
import com.google.firebase.auth.FirebaseAuth;


public class LogoutFragment extends Fragment {
    private Button logout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this cfragment
        View view=inflater.inflate(R.layout.fragment_logout, container, false);

        logout=view.findViewById(R.id.frag_logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth mUser= FirebaseAuth.getInstance();
                mUser.signOut();
                Intent intent=new Intent(getActivity(), StartActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}