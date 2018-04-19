package com.inquallity.digger.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.inquallity.digger.AppDelegate;
import com.inquallity.digger.R;
import com.inquallity.digger.adapter.StringListAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * @author Maxim Radko on 19.04.2018.
 */

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "OYAEBU";

    @Inject StringListAdapter mAdapter;

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppDelegate.adapters().inject(this);
        setContentView(R.layout.ac_main);
        mRecyclerView = findViewById(R.id.rvItems);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        fillList();
    }

    private void fillList() {
        final List< String > values = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            values.add("Value #" + i);
        }
        mAdapter.changeDataset(values);
    }

    private void check() {
        Log.d(TAG, "check: Adapter is injected: " + (mAdapter != null));
    }
}
