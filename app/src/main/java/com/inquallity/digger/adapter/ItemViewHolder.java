package com.inquallity.digger.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.inquallity.digger.R;

/**
 * @author Maxim Radko on 19.04.2018.
 */

class ItemViewHolder extends RecyclerView.ViewHolder {

    public ItemViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(String s) {
        final TextView tv = (TextView) itemView.findViewById(R.id.text);
        tv.setText(s);
    }
}
