package com.example.anhtuong.foody;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class TabMainActivity extends AppCompatActivity {

    // Cấu hình listView và context
    ExpandableHeightGridView grid;
    ExpandableHeightGridView grid2;

    // Mảng chứa textView và image cho listView
    String[] web = {"Gần tôi", "Coupon", "Đặt chỗ ưu đãi", "Đặt giao hàng",
            "E-card", "Game & Fun", "Bình luận", "Blogs", "Top thành viên",
            "Video"};

    int[] imageId = {R.drawable.a1, R.drawable.a2,
            R.drawable.a3, R.drawable.a4, R.drawable.a5,
            R.drawable.a6, R.drawable.a7, R.drawable.a8,
            R.drawable.a8, R.drawable.a9, R.drawable.a10};

    String[] web1 = {"Google", "Github", "Instagram", "Facebook",
            "Flickr", "Pinterest", "Quora", "Twitter", "Vimeo",
            "WordPress", "Youtube", "Stumbleupon", "SoundCloud",
            "Reddit", "Blogger" };
    String[] web11 = {"Google", "Github", "Instagram", "Facebook",
            "Flickr", "Pinterest", "Quora", "Twitter", "Vimeo",
            "WordPress", "Youtube", "Stumbleupon", "SoundCloud",
            "Reddit", "Blogger" };
    String[] web12 = {"Google", "Github", "Instagram", "Facebook",
            "Flickr", "Pinterest", "Quora", "Twitter", "Vimeo",
            "WordPress", "Youtube", "Stumbleupon", "SoundCloud",
            "Reddit", "Blogger" };
    String[] web13 = {"Google", "Github", "Instagram", "Facebook",
            "Flickr", "Pinterest", "Quora", "Twitter", "Vimeo",
            "WordPress", "Youtube", "Stumbleupon", "SoundCloud",
            "Reddit", "Blogger" };
    String[] web14 = {"Google", "Github", "Instagram", "Facebook",
            "Flickr", "Pinterest", "Quora", "Twitter", "Vimeo",
            "WordPress", "Youtube", "Stumbleupon", "SoundCloud",
            "Reddit", "Blogger" };
    int[] imageId1 = {R.drawable.meal1, R.drawable.meal2,
            R.drawable.meal3, R.drawable.meal4, R.drawable.meal5,
            R.drawable.meal6, R.drawable.meal7, R.drawable.meal8,
            R.drawable.meal9, R.drawable.meal10, R.drawable.meal11,
            R.drawable.meal12, R.drawable.meal13, R.drawable.meal14,
            R.drawable.meal15};
    int[] imageId11 = {R.drawable.human1, R.drawable.human2,
            R.drawable.human3, R.drawable.human4, R.drawable.human5,
            R.drawable.human6, R.drawable.human7, R.drawable.human8,
            R.drawable.human9, R.drawable.human10, R.drawable.human11,
            R.drawable.human12, R.drawable.human13, R.drawable.human14,
            R.drawable.human15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_main);

        // Set thông số cho listView
        CustomGrid adapter = new CustomGrid(TabMainActivity.this, web, imageId);
        CustomGrid2 adapter2 = new CustomGrid2(TabMainActivity.this, web1, web11,
                web12, web13, web14, imageId1, imageId11);
        grid=(ExpandableHeightGridView)findViewById(R.id.grid);
        grid2=(ExpandableHeightGridView)findViewById(R.id.grid2);
        grid.setAdapter(adapter);
        grid2.setAdapter(adapter2);
        grid.setExpanded(true);
        grid2.setExpanded(true);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(TabMainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
