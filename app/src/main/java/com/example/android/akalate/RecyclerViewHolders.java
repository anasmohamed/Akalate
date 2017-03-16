package com.example.android.akalate;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView MealName;
    public ImageView MealPhoto;

    ArrayList<MealsInfo> meals = new ArrayList<>();

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        MealName = (TextView) itemView.findViewById(R.id.country_name);
        MealPhoto = (ImageView) itemView.findViewById(R.id.country_photo);
    }

    @Override
    public void onClick(View view) {
        TestAdapter mDbHelper = new TestAdapter(view.getContext());
        mDbHelper.createDatabase();
        mDbHelper.open();
        Intent intent = new Intent(view.getContext(), DetailActivity.class);
        meals = mDbHelper.getAllContacts();
        intent.putExtra("MealName", meals.get(getAdapterPosition()).getMealTitle());
        intent.putExtra("ID", meals.get(getAdapterPosition()).getId());
        intent.putExtra("prepare_time", meals.get(getAdapterPosition()).getPrepare_time());
        intent.putExtra("cooking_time", meals.get(getAdapterPosition()).getCooking_time());
        intent.putExtra("total_time", meals.get(getAdapterPosition()).getTotal_time());
        intent.putExtra("persons_num", meals.get(getAdapterPosition()).getPersons_num());
        intent.putExtra("tools", meals.get(getAdapterPosition()).getTools());
        intent.putExtra("Ingredients_content", meals.get(getAdapterPosition()).getIngredients_content());
        intent.putExtra("Steps_content", meals.get(getAdapterPosition()).getSteps_content());
        view.getContext().startActivity(intent);
    }
}
