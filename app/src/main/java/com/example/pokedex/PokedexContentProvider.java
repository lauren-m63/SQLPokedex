package com.example.pokedex;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

public class PokedexContentProvider extends ContentProvider {

    public static final String TABLE_NAME= "PokedexTable";
    public static final String COL_NATIONALNUMBER= "NationalNumber";
    public static final String COL_NAME= "Name";
    public static final String COL_SPECIES= "Species";
    public static final String COL_HEIGHT= "Height";
    public static final String COL_WEIGHT= "Weight";
    public static final String COL_LEVEL= "Level";
    public static final String COL_HP= "HP";
    public static final String COL_ATTACK= "Attack";
    public static final String COL_DEFENSE= "Defense";
    public static final String COL_GENDER= "Gender";
    public static final String DB_NAME= "PokedexDB";
    MainDatabaseHelper mHelper;

    public final static String SQL_CREATE= "CREATE TABLE" + TABLE_NAME+ "("+
            "_ID INTEGER PRIMARY KEY," +
            COL_NATIONALNUMBER + "TEXT,"+
            COL_NAME + "TEXT,"+
            COL_SPECIES + "TEXT,"+
            COL_HEIGHT + "TEXT,"+
            COL_WEIGHT + "TEXT,"+
            COL_GENDER + "TEXT,"+
            COL_LEVEL + "TEXT,"+
            COL_HP + "TEXT,"+
            COL_ATTACK + "TEXT,"+
            COL_DEFENSE + "TEXT) ";

    public static final Uri CONTENT_URI = Uri.parse("content://com.package.pokedex.provider");



    protected final class MainDatabaseHelper extends SQLiteOpenHelper {
        public MainDatabaseHelper(Context context) {
            super(context, DB_NAME, null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(SQL_CREATE);
        } //end onCreate

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    } // last MainDatabaseHelper


    public PokedexContentProvider() {
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        // Implement this to handle requests to delete one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public String getType(Uri uri) {

        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        String nationalNumber = values.getAsString(COL_NATIONALNUMBER);
        String name = values.getAsString(COL_NAME);
        long id = mHelper.getWritableDatabase().insert(TABLE_NAME, null, values);

        return Uri.withAppendedPath(uri, id+"");

    }

    @Override
    public boolean onCreate() {
        mHelper= new MainDatabaseHelper(getContext());
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        Cursor c = mHelper.getReadableDatabase().query(TABLE_NAME, projection, selection, selectionArgs, null, null, sortOrder);
        return c;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}