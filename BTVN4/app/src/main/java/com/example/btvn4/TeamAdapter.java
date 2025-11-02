package com.example.btvn4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class TeamAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Team> teamList;

    public TeamAdapter(Context context, int layout, ArrayList<Team> teamList) {
        this.context = context;
        this.layout = layout;
        this.teamList = teamList;
    }

    @Override
    public int getCount() {
        return teamList.size();
    }

    @Override
    public Object getItem(int position) {
        return teamList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private static class ViewHolder {
        ImageView imgLogo;
        TextView tvName, tvRegion;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);

            holder = new ViewHolder();
            holder.imgLogo = convertView.findViewById(R.id.imgLogo);
            holder.tvName = convertView.findViewById(R.id.tvName);
            holder.tvRegion = convertView.findViewById(R.id.tvRegion);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Team team = teamList.get(position);
        holder.tvName.setText(team.getName());
        holder.imgLogo.setImageResource(team.getLogo());
        holder.tvRegion.setText("Khu vực: " + team.getRegion());

        return convertView;
    }
}
