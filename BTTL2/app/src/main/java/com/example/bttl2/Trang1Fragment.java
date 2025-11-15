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

public class Trang1Fragment extends Fragment {

    ArrayList<Team> teamList;
    TeamAdapter adapter;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trang1, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        teamList = new ArrayList<>();

        teamList.add(new Team("T1", R.drawable.t1, "#4-LCK: Đương kim vô địch World 2024"));
        teamList.add(new Team("GEN.G", R.drawable.geng, "#1-LCK: Đương kim vô địch MSI 2025"));
        teamList.add(new Team("G2 Esports", R.drawable.g2, "#1-LEC: Đương kim vô địch Split LEC 2025"));
        teamList.add(new Team("Fnatic", R.drawable.fnatic, "#3-LEC"));
        teamList.add(new Team("Bilibili Gaming", R.drawable.blg, "#1-LPL: Đương kim vô địch Split 3 LPL 2025"));
        teamList.add(new Team("Top Esports", R.drawable.tes, "#3-LPL: Đương kim vô địch Split 1 LPL 2025"));
        teamList.add(new Team("KT Rolster", R.drawable.kt, "#3-LCK"));
        teamList.add(new Team("Hanwha Life Esports", R.drawable.hle, "#2-LCK: Đương kim vô địch First Stand 2025"));
        teamList.add(new Team("Anyone's Legend", R.drawable.al, "#2-LPL: Đương kim vô địch Split 2 LPL 2025"));

        adapter = new TeamAdapter(getContext(), teamList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}