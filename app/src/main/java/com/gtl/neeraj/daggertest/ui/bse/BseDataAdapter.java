package com.gtl.neeraj.daggertest.ui.bse;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gtl.neeraj.daggertest.R;

import java.util.List;

public class BseDataAdapter extends BaseAdapter {
    private List<Model> data;

    public BseDataAdapter(List<BseDataAdapter.Model> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data != null ? data.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_item, viewGroup, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Model model = (Model) getItem(position);
        holder.label.setText(model.getLabel());
        holder.value.setText(model.getValue());

        return convertView;
    }

    private static class ViewHolder {
        private TextView label;
        private TextView value;

        public ViewHolder(View view) {
            this.label = view.findViewById(R.id.label);
            this.value = view.findViewById(R.id.value);
        }
    }

    public static class Model {
        String label;
        String value;

        public Model(String label, String value) {
            this.label = label;
            this.value = value;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
