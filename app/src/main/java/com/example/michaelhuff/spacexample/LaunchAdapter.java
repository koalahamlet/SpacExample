package com.example.michaelhuff.spacexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class LaunchAdapter extends RecyclerView.Adapter<LaunchAdapter.LaunchViewHolder> {

    List<Launch> data;

    @NonNull
    @Override
    public LaunchViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.launch_item_layout, viewGroup, false);
        return new LaunchViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LaunchViewHolder launchViewHolder, int i) {
        Launch launch = data.get(i);
        Picasso.get().load(launch.links.mission_patch).into(launchViewHolder.imageView);
        launchViewHolder.launchYearTextView.setText(launch.getLaunch_year());
        launchViewHolder.flightNumTextView.setText(String.valueOf(launch.getFlight_number()));
        launchViewHolder.launchTextView.setText(launch.getMission_name());
    }

    @Override
    public int getItemCount() {
        if (data == null) {
            return 0;
        } else {
            return data.size();
        }
    }

    public List<Launch> getData() {
        return data;
    }

    public void setData(List<Launch> data) {
        this.data = data;
    }

    class LaunchViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView launchTextView;
        TextView flightNumTextView;
        TextView launchYearTextView;

        public LaunchViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.launchImage);
            launchTextView = itemView.findViewById(R.id.missionName);
            flightNumTextView = itemView.findViewById(R.id.launchYear);
            launchYearTextView = itemView.findViewById(R.id.flightNumber);
        }
    }
}
