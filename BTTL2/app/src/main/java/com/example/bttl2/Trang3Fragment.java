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

public class Trang3Fragment extends Fragment {

    ArrayList<Player> championList;
    PlayerAdapter adapter;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trang3, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        championList = new ArrayList<>();


        championList.add(new Player("Doran", "T1 6* - Top", R.drawable.t16star));
        championList.add(new Player("Oner", "T1 6* - Jungle", R.drawable.t16star));
        championList.add(new Player("Faker", "T1 6* - Mid", R.drawable.t16star));
        championList.add(new Player("Gumayusi", "T1 6* - ADC", R.drawable.t16star));
        championList.add(new Player("Keria", "T1 6* - Support", R.drawable.t16star));

        adapter = new PlayerAdapter(getContext(), championList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}