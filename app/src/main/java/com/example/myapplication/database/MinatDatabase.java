package com.example.myapplication.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.myapplication.dao.InputDao;
import com.example.myapplication.ui.inputdata.ModelInput;


@Database(entities = {ModelInput.class}, version = 1)
public abstract class MinatDatabase extends RoomDatabase {

    private static MinatDatabase instance;

    public abstract InputDao inputDao();

    public static synchronized MinatDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    MinatDatabase.class, "minat_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }

    private static final Callback roomCallback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
        }
    };

}
