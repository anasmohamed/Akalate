package com.example.android.akalate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setTitle(null);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(MainActivity.this, 2);

        RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(rowListItem);
        rView.setAdapter(rcAdapter);

    }



    private List<ItemObject> getAllItemList() {

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("سلطة البيض", R.drawable.photo6));
        allItems.add(new ItemObject("سلطة يونانى مع السردين", R.drawable.photo2));
        allItems.add(new ItemObject("فيلية الماكريل على الطريقة الأيرلندية", R.drawable.photo1));
        allItems.add(new ItemObject("أرز بالكوسة", R.drawable.photo3));
        allItems.add((new ItemObject("سلطة الفاكهة بالزبادي", R.drawable.photo4)));
        allItems.add(new ItemObject("خرشوف محشى خضار سوتية", R.drawable.photo5));
        allItems.add(new ItemObject("ساندويتش البيض على الطريقة الإيطالى", R.drawable.photo8));
        allItems.add(new ItemObject("شطائر التوست بالجبن الفيتا والمشروم", R.drawable.photo7));
        allItems.add(new ItemObject("شوربة المنسترونى", R.drawable.photo10));
        allItems.add(new ItemObject("مافن الموز", R.drawable.photo9));
        return allItems;
    }
}

