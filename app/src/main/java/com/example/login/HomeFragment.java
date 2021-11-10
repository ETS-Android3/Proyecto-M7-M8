package com.example.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button cerrar = view.findViewById(R.id.cerrar_sesion);

        SharedPreferences prefs= getContext().getSharedPreferences("SharedP", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.clear().commit();
            }
        });
        return view;
    }
}