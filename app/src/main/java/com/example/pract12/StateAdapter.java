package com.example.pract12;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter  extends RecyclerView.Adapter<StateAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<State> states;

    StateAdapter(Context context, List<State> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StateAdapter.ViewHolder holder, int position) {
        State state = states.get(position);
        holder.guView.setImageResource(state.getGunResource());
        holder.nameView.setText(state.getName());
        holder.capitalView.setText(state.getClass_of_gun());

        holder.guView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), New_window.class);
                intent.putExtra("text", "это штурмовая винтовка");
                v.getContext().startActivity(intent);

            }
        });
        holder.nameView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), New_window.class);
                intent.putExtra("text", "это штурмовая винтовка");
                v.getContext().startActivity(intent);
            }
        });
        holder.capitalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), New_window.class);
                intent.putExtra("text","это штурмовая винтовка" );
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView guView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            super(view);
            guView = view.findViewById(R.id.gun);
            nameView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.class_vint);

        }
    }
}
