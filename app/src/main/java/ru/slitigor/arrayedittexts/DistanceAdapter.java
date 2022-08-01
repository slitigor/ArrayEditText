package ru.slitigor.arrayedittexts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class DistanceAdapter extends ArrayAdapter<Distance> {
    private LayoutInflater inflater;
    private int layout;
    private List<Distance> mDistances;

    public DistanceAdapter(@NonNull Context context, int resource, List<Distance> distances) {
        super(context, resource, distances);
        this.mDistances = distances;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            
        }
        return super.getView(position, convertView, parent);
    }
}
