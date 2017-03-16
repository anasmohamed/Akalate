package com.example.android.akalate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView title, prepare_time,
            cooking_time, total_time, persons_num,
            tools, ingradinats, ingradinats_content, steps,
            steps_content;
    private ImageView meal_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        init();

    }

    private void init() {
        title = (TextView) findViewById(R.id.title);
        meal_photo = (ImageView) findViewById(R.id.meal_photo);
        prepare_time = (TextView) findViewById(R.id.prepare_time);
        cooking_time = (TextView) findViewById(R.id.cooking_time);
        total_time = (TextView) findViewById(R.id.total_time);
        tools = (TextView) findViewById(R.id.tools);
        persons_num = (TextView) findViewById(R.id.persons_num);
        ingradinats_content = (TextView) findViewById(R.id.ingradinats_content);
        steps_content = (TextView) findViewById(R.id.steps_content);
        setData();
    }

    public void setData() {
        title.setText(getIntent().getStringExtra("MealName"));
        prepare_time.setText(getIntent().getStringExtra("prepare_time"));
        cooking_time.setText(getIntent().getStringExtra("cooking_time"));
        total_time.setText(getIntent().getStringExtra("total_time"));
        persons_num.setText(getIntent().getStringExtra("persons_num"));
        tools.setText(getIntent().getStringExtra("tools"));
        ingradinats_content.setText(getIntent().getStringExtra("Ingredients_content"));
        steps_content.setText(getIntent().getStringExtra("Steps_content"));
        String id = getIntent().getStringExtra("ID");
        switch (Integer.parseInt(id)) {
            case 1:
                meal_photo.setImageResource(R.drawable.photo6);
                break;
            case 2:
                meal_photo.setImageResource(R.drawable.photo2);
                break;
            case 3:
                meal_photo.setImageResource(R.drawable.photo1);
                break;
            case 4:
                meal_photo.setImageResource(R.drawable.photo3);
                break;
            case 5:
                meal_photo.setImageResource(R.drawable.photo4);
                break;
            case 6:

                meal_photo.setImageResource(R.drawable.photo5);
                break;
            case 7:
                meal_photo.setImageResource(R.drawable.photo8);
                break;
            case 8:
                meal_photo.setImageResource(R.drawable.photo7);
                break;
            case 9:
                meal_photo.setImageResource(R.drawable.photo10);
                break;
            case 10:
                meal_photo.setImageResource(R.drawable.photo9);


        }
    }
}
