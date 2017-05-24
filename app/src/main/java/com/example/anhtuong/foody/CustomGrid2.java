package com.example.anhtuong.foody;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by anhtuong on 4/2/17.
 */

public class CustomGrid2 extends BaseAdapter {

    // Cấu hình các mảng chứa thông tin
    private Context mContext;
    private final String[] web1;
    private final String[] web11;
    private final String[] web12;
    private final String[] web13;
    private final String[] web14;
    private final int[] Imageid1;
    private final int[] Imageid11;

    // Khởi tạo các mảng chứa thông tin
    public CustomGrid2(Context c, String[] web1, String[] web11,
                       String[] web12, String[] web13, String[] web14,
                       int[] Imageid1, int[] Imageid11) {
        mContext = c;
        this.Imageid1 = Imageid1;
        this.Imageid11 = Imageid11;
        this.web1 = web1;
        this.web11 = web11;
        this.web12 = web12;
        this.web13 = web13;
        this.web14 = web14;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return web1.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Đổ dữ liệu vào gridView
        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid_single2, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            TextView textView1 = (TextView) grid.findViewById(R.id.grid_text1);
            TextView textView2 = (TextView) grid.findViewById(R.id.grid_text2);
            TextView textView3 = (TextView) grid.findViewById(R.id.grid_text3);
            TextView textView4 = (TextView) grid.findViewById(R.id.grid_text4);
            ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            ImageView imageView1 = (ImageView)grid.findViewById(R.id.grid_image1);
            textView.setText(web1[position]);
            textView1.setText(web11[position]);
            textView2.setText(web12[position]);
            textView3.setText(web13[position]);
            textView4.setText(web14[position]);
            imageView.setImageResource(Imageid1[position]);
            imageView1.setImageResource(Imageid11[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}
