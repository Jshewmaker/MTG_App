package com.example.yeti.mtg_app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Player_2_Fragment extends Fragment {
    private static  final String TAG = "Player_2_Fragment";

    private Button btn_increase;
    private Button btn_decrease;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_player_2_health, container, false);
        btn_increase = view.findViewById(R.id.player_2_increase);
        btn_decrease = view.findViewById(R.id.player_2_decrease);

        btn_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Player 2 Increase",Toast.LENGTH_SHORT).show();
            }
        });

        btn_decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Player 2 Decrease",Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
