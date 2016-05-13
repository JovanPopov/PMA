package rs.reviewer.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by skapl on 13-Apr-16.
 */
public class ReviewerSQLiteHelper extends SQLiteOpenHelper {

    public static final String TABLE_CINEMA = "cinema";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_AVATAR = "avatar";


    private static final String DATABASE_NAME = "cinema.db";
    private static final int DATABASE_VERSION = 1;

    private static final String DB_CREATE = "create table "
            + TABLE_CINEMA + "("
            + COLUMN_ID  + " integer primary key autoincrement , "
            + COLUMN_NAME + " text, "
            + COLUMN_DESCRIPTION + " text, "
            + COLUMN_AVATAR + " integer"
            + ")";





    public ReviewerSQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DB_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CINEMA);
        onCreate(db);
    }


}
