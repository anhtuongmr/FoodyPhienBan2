package com.example.anhtuong.foody;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.example.anhtuong.foody.AdapterTab2;
import com.example.anhtuong.foody.R;

import java.util.ArrayList;

public class Tab2Activity extends Activity {

    // Cấu hình listView và context
    ListView lv;
    Context context;

    // Mảng chứa textView và image cho listView
    ArrayList prgmName;
    public static int[] prgmImages = {R.drawable.meal1, R.drawable.meal2,
            R.drawable.meal3, R.drawable.meal4, R.drawable.meal5, R.drawable.meal6,
            R.drawable.meal7, R.drawable.meal8, R.drawable.meal9, R.drawable.meal10,
            R.drawable.meal11, R.drawable.meal12, R.drawable.meal13, R.drawable.meal14,
            R.drawable.meal15, R.drawable.meal16, R.drawable.meal17, R.drawable.meal18,
            R.drawable.meal19, R.drawable.meal20, R.drawable.meal21, R.drawable.meal22,
            R.drawable.meal23, R.drawable.meal24, R.drawable.meal25, R.drawable.meal26,
            R.drawable.meal28, R.drawable.meal29, R.drawable.meal30, R.drawable.meal31,
            R.drawable.meal32};
    public static String[] prgmNameList = {"Việt Nam", "Châu Mỹ", "Mỹ", "Tây Âu",
            "Ý", "Pháp", "Đức", "Tây Ban Nha", "Trung Hoa", "Ấn Độ", "Thái Lan",
            "Nhật Bản", "Hàn Quốc", "Malaysia", "Quốc tế", "Sang Trọng", "Buffet",
            "Nhà Hàng", "Ăn vặt/vỉa hè", "Ăn chay", "Cafe/Dessert", "Quán ăn", "Bar/Pub",
            "Quán nhậu", "Beer club", "Tiệm bánh", "Tiệc tận nơi", "Shop online",
            "Giao cơm văn phòng", "Khu ẩm thực"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        // Set thông số cho listView
        context = this;
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new AdapterTab2(this, prgmNameList, prgmImages));

    }
}
