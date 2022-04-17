package com.akan.androidtopics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.akan.androidtopics.R;

public class AkAdapter extends ArrayAdapter<String> {
    private String[] arr;
    private Context context;
    public AkAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.context = context;
        this.arr = arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.ak_layout, parent, false);
        TextView t = convertView.findViewById(R.id.textView1);
        t.setText(getItem(position));
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked on "+ arr[position], Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}

