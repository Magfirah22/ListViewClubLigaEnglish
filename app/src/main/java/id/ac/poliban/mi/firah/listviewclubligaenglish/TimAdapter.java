package id.ac.poliban.mi.firah.listviewclubligaenglish;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class TimAdapter extends BaseAdapter {
    private List<Tim> data = new ArrayList<>();

    public TimAdapter(List<Tim> data){
        this.data = data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_flag;
        TextView tvTimName;
        TextView tvTimDesc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_tim, parent, false);
        img_flag = convertView.findViewById(R.id.img_flag);
        tvTimName = convertView.findViewById(R.id.tv_tim_name);
        tvTimDesc = convertView.findViewById(R.id.tv_tim_desc);

        Glide.with(parent.getContext())
                .load(data.get(position).getFlag())
                .apply(new RequestOptions().override(60,60))
                .into(img_flag);
        tvTimName.setText(data.get(position).getTimName());
        tvTimDesc.setText(data.get(position).getTimDesc());


        return convertView;
    }
}
