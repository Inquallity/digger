package com.inquallity.digger.di;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.inquallity.digger.R;
import com.inquallity.digger.adapter.StringListAdapter;

import dagger.Module;
import dagger.Provides;

/**
 * @author Maxim Radko on 19.04.2018.
 */
@Module
public class AdaptersModule {

    @Provides
    @MyScope
    View.OnClickListener listener(final Context ctx) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, ctx.getString(R.string.app_name), Toast.LENGTH_SHORT).show();
            }
        };
    }

    @Provides
    @MyScope
    StringListAdapter adapter(View.OnClickListener listener) {
        return new StringListAdapter(listener);
    }
}