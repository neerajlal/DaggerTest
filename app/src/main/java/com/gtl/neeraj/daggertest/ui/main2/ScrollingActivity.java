package com.gtl.neeraj.daggertest.ui.main2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.gtl.neeraj.daggertest.R;
import com.gtl.neeraj.daggertest.network.ApiService;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScrollingActivity extends AppCompatActivity implements BseContract.View {

    @BindView(R.id.listView)
    ListView listView;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(android.R.id.empty)
    TextView emptyView;

    private List<BseDataAdapter.Model> data = new ArrayList<>();
    private BseDataAdapter adapter;

    private BsePresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(getString(R.string.exchange_rate));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        presenter = new BsePresenterImpl(this, new ApiService());
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.getData();
            }
        });

        ViewCompat.setNestedScrollingEnabled(listView, true);
        listView.setEmptyView(emptyView);
        adapter = new BseDataAdapter(data);
        listView.setAdapter(adapter);
    }

    @Override
    public void setData(String dataIn) {
        data.clear();
        if (dataIn != null) {
            String[] parts0 = dataIn.split("#");
            for (String part : parts0) {
                String[] parts1 = part.split("@");
                data.add(new BseDataAdapter.Model(parts1[0], parts1[1]));
            }
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public void setError(String error) {
        emptyView.setText(error);
    }
}
