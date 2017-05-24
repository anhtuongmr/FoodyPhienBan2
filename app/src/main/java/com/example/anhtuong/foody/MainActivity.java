package com.example.anhtuong.foody;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

import static android.R.color.black;
import static android.R.id.tabhost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    //
    public static int lnFoodFlag;

    // Cấu hình các button và tabhost
    TabHost TabHostWindow;
    LinearLayout lnPlace,lnFood;
    TextView tvPlace,tvFood;
    Button btnCancel;
    ImageButton btnaa;
    ImageButton btnba;
    ImageButton btnca;
    ImageButton btnda;
    int clickNumber[] = {1, 0, 0};
    public static int foodFlag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo toogle button trên đầu tiên
        lnPlace = (LinearLayout)findViewById(R.id.lnPlace) ;
        lnFood = (LinearLayout)findViewById(R.id.lnFood) ;
        tvPlace =(TextView)findViewById(R.id.tvPlace);
        tvFood = (TextView)findViewById(R.id.tvFood);

        // Mặc định vừa khởi động ứng dụng là toogle Ở đâu active


        // Corner radius cho toogle button trên đầu


        // Sự kiện click vào toggle button
        lnPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnPlace.setBackgroundResource(R.color.white);
                lnFood.setBackgroundResource(R.color.red);
                tvPlace.setTextColor(getResources().getColor(black));
                tvFood.setTextColor(getResources().getColor(R.color.white));
            }
        });

        // Sự kiện click vào toggle button
        lnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnPlace.setBackgroundResource(R.color.red);
                lnFood.setBackgroundResource(R.color.white);
                tvPlace.setTextColor(getResources().getColor(R.color.white));
                tvFood.setTextColor(getResources().getColor(black));
            }
        });

        // Khởi tạo button Cancel và 5 button dưới cùng
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnaa = (ImageButton) findViewById(R.id.btnaa);
        btnba = (ImageButton) findViewById(R.id.btnba);
        btnca = (ImageButton) findViewById(R.id.btnca);
        btnda = (ImageButton) findViewById(R.id.btnda);

        //Assign id to Tabhost.
        TabHostWindow = (TabHost)findViewById(tabhost);

        //Creating tab menu.
        final TabSpec TabMenu1 = TabHostWindow.newTabSpec("Tab1");
        TabSpec TabMenu2 = TabHostWindow.newTabSpec("Tab2");
        TabSpec TabMenu3 = TabHostWindow.newTabSpec("Tab3");
        TabSpec TabMenu4 = TabHostWindow.newTabSpec("Tab4");

        //Setting up tab 1 name.
        TabMenu1.setIndicator(getTabIndicator(this, R.string.tab1, R.drawable.down));
        //Set tab 1 activity to tab 1 menu.
        TabMenu1.setContent(new Intent(this,Tab1Activity.class));

        //Setting up tab 2 name.
        TabMenu2.setIndicator(getTabIndicator(this, R.string.tab2, R.drawable.down));
        //Set tab 3 activity to tab 1 menu.
        TabMenu2.setContent(new Intent(this,Tab2Activity.class));

        //Setting up tab 1 name.
        TabMenu3.setIndicator(getTabIndicator(this, R.string.tab3, R.drawable.down));
        //Set tab 1 activity to tab 1 menu.
        TabMenu3.setContent(new Intent(this,Tab3Activity.class));

        TabMenu4.setIndicator("None");
        //Set tab 1 activity to tab 1 menu.
        TabMenu4.setContent(new Intent(this,TabMainActivity.class));

        //Adding tab1, tab2, tab3 to tabhost view.
        TabHostWindow.addTab(TabMenu1);
        TabHostWindow.addTab(TabMenu2);
        TabHostWindow.addTab(TabMenu3);
        TabHostWindow.addTab(TabMenu4);

        // Set 1 tabhost cuối cùng là GONE
        TabHostWindow.getTabWidget().getChildAt(3).setVisibility(View.GONE);

        // Set mặc định là tabhost này
        TabHostWindow.setCurrentTab(3);

        // Unselect tất cả cả các tabhost
        setTabColor(TabHostWindow);

        // Sự kiện click vào tabhost 1
        getTabWidget().getChildAt(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // custom code
                clickNumber[0] = (clickNumber[0] + 1) % 2;
                if (clickNumber[0] == 1) {
                    setTabColor2(TabHostWindow, 0);
                    TabHostWindow.setCurrentTab(0);
                } else {
                    setTabColor(TabHostWindow);
                    TabHostWindow.setCurrentTab(3);
                }
            }
        });

        // Sự kiện click vào tabhost 2
        getTabWidget().getChildAt(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // custom code
                clickNumber[1] = (clickNumber[1] + 1) % 2;
                if (clickNumber[1] == 1) {
                    setTabColor2(TabHostWindow, 1);
                    TabHostWindow.setCurrentTab(1);
                } else {
                    setTabColor(TabHostWindow);
                    TabHostWindow.setCurrentTab(3);
                }
            }
        });

        // Sự kiện click vào tabhost 3
        getTabWidget().getChildAt(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // custom code
                clickNumber[2] = (clickNumber[2] + 1) % 2;
                if (clickNumber[2] == 1) {
                    setTabColor2(TabHostWindow, 2);
                    TabHostWindow.setCurrentTab(2);
                } else {
                    setTabColor(TabHostWindow);
                    TabHostWindow.setCurrentTab(3);
                }
            }
        });

        // Sự kiện click vào button Cancel
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNumber[0] = 0;
                clickNumber[1] = 0;
                clickNumber[2] = 0;
                setTabColor(TabHostWindow);
                TabHostWindow.setCurrentTab(3);
            }
        });
    }

    // Cấu hình text và image cho tabhost
    private View getTabIndicator(Context context, int title, int icon) {
        View view = LayoutInflater.from(context).inflate(R.layout.tab_layout, null);
        ImageView iv = (ImageView) view.findViewById(R.id.imageView);
        iv.setImageResource(icon);
        TextView tv = (TextView) view.findViewById(R.id.textView);
        tv.setText(title);
        return view;
    }

    // Set trạng thái Select cho 1 trong 3 tabhost và
    // ác sự kiện liên quan
    public void setTabColor2(TabHost tabhost, int child) {
        btnCancel.setVisibility(View.VISIBLE);
        btnaa.setVisibility(View.GONE);
        btnba.setVisibility(View.GONE);
        btnca.setVisibility(View.GONE);
        btnda.setVisibility(View.GONE);
        for(int i=0;i<3;i++) {
            if (i == child) {
                tabhost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#eeeeee"));
            } else {
                tabhost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#FFFFFF"));
                clickNumber[i] = 0;
            }
        }
        //if(!what.equals("disappear"))
        //    tabhost.getTabWidget().getChildAt(tabhost.getCurrentTab()).setBackgroundColor(Color.parseColor("FF0000")); // selected red colored

        //    else
        //tabhost.getTabWidget().getChildAt(tabhost.getCurrentTab()).setBackgroundColor(Color.parseColor("FFFFFF")); // selected but show as unselected with white color


    }

    // Set trạng thái cho các tabhost là Unselect và
    // các sự kiện liên quan
    public void setTabColor(TabHost tabhost) {
        btnCancel.setVisibility(View.GONE);
        btnaa.setVisibility(View.VISIBLE);
        btnba.setVisibility(View.VISIBLE);
        btnca.setVisibility(View.VISIBLE);
        btnda.setVisibility(View.VISIBLE);
        for(int i=0;i<tabhost.getTabWidget().getChildCount();i++)
        {
            tabhost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#FFFFFF")); //unselected white colored
        }
        clickNumber[0] = 0;
        clickNumber[1] = 0;
        clickNumber[2] = 0;
        //if(!what.equals("disappear"))
        //    tabhost.getTabWidget().getChildAt(tabhost.getCurrentTab()).setBackgroundColor(Color.parseColor("FF0000")); // selected red colored

        //    else
        //tabhost.getTabWidget().getChildAt(tabhost.getCurrentTab()).setBackgroundColor(Color.parseColor("FFFFFF")); // selected but show as unselected with white color
    }
}