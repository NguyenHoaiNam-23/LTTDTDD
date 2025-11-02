package com.example.btvn4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Team> teamList;
    TeamAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_main);

        listView = findViewById(R.id.listView);
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

        adapter = new TeamAdapter(this, R.layout.row_listview, teamList);
        listView.setAdapter(adapter);

        // 🟢 Thêm OnClick cho từng item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Team selectedTeam = teamList.get(position);
                Toast.makeText(MainActivity.this,
                        selectedTeam.getRegion()
                                +": "+ selectedTeam.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
