package com.example.anhtuong.foody;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by anhtuong on 4/2/17.
 */

public class AdapterTab3 extends BaseAdapter {

    // Cấu hình các thông số
    String[] result;
    Context context;
    int[] imageId;
    private static LayoutInflater inflater = null;

    // Khởi tạo các thông số
    public AdapterTab3(Tab3Activity tab3Activity, String[] prgmNameList) {
        // TODO Auto-generated constructor stub
        result = prgmNameList;
        context = tab3Activity;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder {
        TextView tv;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stubsố
        // Đổ dữ liệu vào listView
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.item_list_tab3, null);
        holder.tv = (TextView) rowView.findViewById(R.id.textView1);
        holder.tv.setText(result[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked " + result[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }
}
