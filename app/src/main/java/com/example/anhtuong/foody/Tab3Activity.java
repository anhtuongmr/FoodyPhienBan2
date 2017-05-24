package com.example.anhtuong.foody;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.example.anhtuong.foody.AdapterTab3;
import com.example.anhtuong.foody.R;

import java.util.ArrayList;

public class Tab3Activity extends Activity {

    // Cấu hình listView và context
    ListView lv;
    Context context;

    // Mảng chứa textView và image cho listView
    ArrayList prgmName;
    public static String[] prgmNameList = {"Quận 1", "Quận 2", "Quận 3", "Quận 4",
            "Quận 5", "Quận 6", "Quận 7", "Quận 8", "Quận 9", "Quận 10", "Quận 11",
            "Quận 12", "Quận Bình Thạnh", "Quận Tân Bình", "Quận Phú Nhuận",
            "Quận Tân Phú", "Quận Gò Vấp", "Quận Bình Tân", "Quận Thủ Đức",
            "Bình Chánh", "Nhà Bè", "Hóc Môn"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);

        // Set thông số cho listView
        context = this;
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new AdapterTab3(this, prgmNameList));

    }
}
