package com.example.android.akalate;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;


public class TestAdapter {
    protected static final String TAG = "DataAdapter";

    private final Context mContext;
    private SQLiteDatabase mDb;
    private DataBaseHelper mDbHelper;


    public TestAdapter(Context context) {
        this.mContext = context;
        mDbHelper = new DataBaseHelper(mContext);
    }

    public TestAdapter createDatabase() throws SQLException {
        try {
            mDbHelper.createDataBase();
        } catch (IOException mIOException) {
            Log.e(TAG, mIOException.toString() + "  UnableToCreateDatabase");
            throw new Error("UnableToCreateDatabase");
        }
        return this;
    }

    public TestAdapter open() throws SQLException {
        try {
            mDbHelper.openDataBase();
            mDbHelper.close();
            mDb = mDbHelper.getReadableDatabase();
        } catch (SQLException mSQLException) {
            Log.e(TAG, "open >>" + mSQLException.toString());
            throw mSQLException;
        }
        return this;
    }

    public void close() {
        mDbHelper.close();
    }

//    public Cursor getTestData() {
//        try {
//            String sql = "SELECT * FROM meal";
//
//            Cursor mCur = mDb.rawQuery(sql, null);
//            if (mCur != null) {
//                mCur.moveToNext();
//            }
//            return mCur;
//        } catch (SQLException mSQLException) {
//            Log.e(TAG, "getTestData >>" + mSQLException.toString());
//            throw mSQLException;
//        }
//    }

    public ArrayList<MealsInfo> getAllContacts() {
        ArrayList<MealsInfo> movies = new ArrayList<>();
        String selectQuery = "select * from meal";
        Cursor cursor = mDb.rawQuery(selectQuery, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                do {
                    MealsInfo meal = new MealsInfo();
                    meal.setMealTitle(cursor.getString(0));
                    meal.setPrepare_time(cursor.getString(1));
                    meal.setCooking_time(cursor.getString(2));
                    meal.setTotal_time(cursor.getString(3));
                    meal.setTools(cursor.getString(4));
                    meal.setIngredients_content(cursor.getString(5));
                    meal.setSteps_content(cursor.getString(6));
                    meal.setId(cursor.getString(7));
                    meal.setPersons_num(String.valueOf(cursor.getInt(8)));
                    movies.add(meal);
                } while (cursor.moveToNext());
            }
        }
        return movies;
    }
}
