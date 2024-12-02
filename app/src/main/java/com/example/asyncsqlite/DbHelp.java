package com.example.asyncsqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelp extends SQLiteOpenHelper {

    String number,name;

    //details need to create table
    String tName="userData";
    String id="tId";
    String col1="uName";
    String col2="uNumber";

    public DbHelp(Context c,String n,String num){
        super(c, "userDetails.db", null, 1);
        number=num;
        name=n;
//        Log.d("myVal",number+" "+name);
Log.d("db_cretae","databse created");
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTable="create table "+tName+"("+id+"INTEGER PRIMARY KEY,"+col1+" TEXT,"+col2+" TEXT"+")";
        sqLiteDatabase.execSQL(createTable);
        Log.d("createdTable","table created");

    }
    public void insertUserData(){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues ctVal=new ContentValues();
        ctVal.put("uName",name);
        ctVal.put("uNumber",number);
        db.insert(tName,null,ctVal);
        Log.d("insert","data inserted...");
    }
//    public void fetchMyData(){
//        SQLiteDatabase sqdb=this.getReadableDatabase();
//        Cursor c=sqdb.rawQuery("select * from "+tName,null);
//        String val=c.getString(1);
//        Log.d("count",""+c.getCount());
//
//    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
