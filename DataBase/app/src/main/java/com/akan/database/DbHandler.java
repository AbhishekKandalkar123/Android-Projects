package com.akan.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DbHandler extends SQLiteOpenHelper {
    public DbHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE myemployee (sno INTEGER PRIMARY KEY, name TEXT, increment TEXT)";
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String drop = String.valueOf("DROP TABLE IF EXISTS");
        db.execSQL(drop, new String[]{"myemployee"});
        onCreate(db);
    }

    public void addEmployee(Employee emp){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name",emp.getName());
        values.put("increment",emp.getIncrement());
        long k = db.insert("myemployee",null, values);
        Log.d("mytag", Long.toString(k));
        db.close();
    }

    public void getEmployee(int Sno){
        SQLiteDatabase db =this.getReadableDatabase();
        Cursor c = db.query("myemployee", new String[]{"Sno", "name", "increment"},
               "Sno=?",new String[]{String.valueOf(Sno)},null,null,null);
        if(c != null && c.moveToFirst()){
            Log.d("mytag", c.getString(1));
            Log.d("mytag", c.getString(2));
        }
        else
            Log.d("mytag", "Some Error Occured");

    }
}
