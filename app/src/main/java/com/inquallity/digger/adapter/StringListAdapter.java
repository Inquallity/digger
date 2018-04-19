package com.inquallity.digger.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inquallity.digger.R;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * @author Maxim Radko on 19.04.2018.
 */

public class StringListAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private View.OnClickListener mListener;
    private List<String> mValues = new ArrayList<>();

    @Inject
    public StringListAdapter(View.OnClickListener listener) {
        mListener = listener;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final View view = inflater.inflate(R.layout.li_string, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.bind(mValues.get(position));
        holder.itemView.setOnClickListener(mListener);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public void changeDataset(List<String> values) {
        mValues = values;
        notifyDataSetChanged();
    }
}
