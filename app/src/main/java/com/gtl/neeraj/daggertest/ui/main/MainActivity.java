package com.gtl.neeraj.daggertest.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.gtl.neeraj.daggertest.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.Module;
import dagger.android.AndroidInjection;

@Module
public class MainActivity extends AppCompatActivity implements MainView {

    @Inject
    MainPresenter presenter;

    @BindView(R.id.listview)
    ListView listView;

    @BindView(R.id.loadMore)
    Button load;

    private List<NseDataAdapter.Model> data = new ArrayList<>();
    private NseDataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        adapter = new NseDataAdapter(data);
        listView.setAdapter(adapter);
        presenter.getData();

        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.getData();
            }
        });
    }

    @Override
    public void setData(Map<String, String> data) {
        this.data.clear();
        for (Map.Entry<String, String> map : data.entrySet()) {
            this.data.add(new NseDataAdapter.Model(map.getKey(), map.getValue()));
        }
        notifyAdapter();
    }

    private void notifyAdapter() {
        Runnable runnable = new Runnable() {
            public void run() {
                adapter.notifyDataSetChanged();
            }
        };
        runOnUiThread(runnable);
    }

    @Override
    public void setError(String error) {

    }
}
