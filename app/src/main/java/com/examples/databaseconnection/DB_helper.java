package com.examples.databaseconnection;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DB_helper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Student.db";
    public static final String TABLE_NAME="student_table";
    public static final String name="Name";
    public static final String rollno="Rollno";

    public DB_helper(Context context)
    {
        super(context,DATABASE_NAME, null, 1);
        SQLiteDatabase db=this.getWritableDatabase();

    }
    public void onCreate(SQLiteDatabase db)
    {
        String sql="create table student_table(Name text,Rollno text )";
        db.execSQL(sql);
    }
    public void onUpgrade(SQLiteDatabase db, int oldversion ,int newVeersion)
    {

    }
    public void insert_data(String name, String rollno) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Name", name);
        cv.put("Rollno",rollno);

        db.insert(TABLE_NAME, null, cv);
    }
    }
