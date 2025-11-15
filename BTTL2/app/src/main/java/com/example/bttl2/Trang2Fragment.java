package com.example.bttl2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Trang2Fragment extends Fragment {

    ArrayList<Player> playerList;
    PlayerAdapter adapter;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trang2, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        playerList = new ArrayList<>();


        playerList.add(new Player("Faker", "T1 - Mid", R.drawable.t1));
        playerList.add(new Player("Chovy", "GEN - Mid", R.drawable.geng));
        playerList.add(new Player("Caps", "G2 - Mid", R.drawable.g2));
        playerList.add(new Player("BDD", "KT - Mid", R.drawable.kt));
        playerList.add(new Player("Knight", "BLG - Mid", R.drawable.blg));
        playerList.add(new Player("Creme", "TES - Mid", R.drawable.tes));
        playerList.add(new Player("Zeka", "HLE - Mid", R.drawable.hle));
        playerList.add(new Player("Poby", "FNC - Mid", R.drawable.fnatic));



        adapter = new PlayerAdapter(getContext(), playerList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}