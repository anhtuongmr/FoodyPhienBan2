package com.example.anhtuong.foody;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.example.anhtuong.foody.AdapterTab1;
import com.example.anhtuong.foody.R;

import java.util.ArrayList;

public class Tab1Activity extends Activity {

    // Cấu hình listView và context
    ListView lv;
    Context context;

    // Mảng chứa textView và image cho listView
    ArrayList prgmName;
    public static int[] prgmImages = {R.mipmap.new_enable, R.mipmap.here_disable,
            R.mipmap.new_disable, R.mipmap.place_disable};
    public static int[] prgmImages2 = {R.mipmap.new_enable, R.mipmap.here_enable,
            R.mipmap.new_enable, R.mipmap.place_enable};
    public static String[] prgmNameList = {"Mới nhất", "Gần tôi", "Xem nhiều", "Du khách"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);

        // Set thông số cho listView
        context = this;
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new AdapterTab1(this, prgmNameList, prgmImages, prgmImages2));
    }
}
