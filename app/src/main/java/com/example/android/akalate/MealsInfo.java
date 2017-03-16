package com.example.android.akalate;

/**
 * Created by no-one on 3/15/2017.
 */

public class MealsInfo {
    private String MealTitle;
    private String id;
    private String prepare_time;
    private String cooking_time;
    private String total_time;
    private String persons_num;
    private String tools;
    private String ingredients;
    private String ingredients_content;
    private String steps;
    private String steps_content;

    public String getMealTitle() {
        return MealTitle;
    }

    public void setMealTitle(String mealTitle) {
        MealTitle = mealTitle;
    }

    public String getPrepare_time() {
        return prepare_time;
    }

    public void setPrepare_time(String prepare_time) {
        this.prepare_time = prepare_time;
    }

    public String getCooking_time() {
        return cooking_time;
    }

    public void setCooking_time(String cooking_time) {
        this.cooking_time = cooking_time;
    }

    public String getTotal_time() {
        return total_time;
    }

    public void setTotal_time(String total_time) {
        this.total_time = total_time;
    }

    public String getPersons_num() {
        return persons_num;
    }

    public void setPersons_num(String persons_num) {
        this.persons_num = persons_num;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingradinats) {
        this.ingredients = ingradinats;
    }

    public String getIngredients_content() {
        return ingredients_content;
    }

    public void setIngredients_content(String ingradinats_content) {
        this.ingredients_content = ingradinats_content;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getSteps_content() {
        return steps_content;
    }

    public void setSteps_content(String steps_content) {
        this.steps_content = steps_content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
