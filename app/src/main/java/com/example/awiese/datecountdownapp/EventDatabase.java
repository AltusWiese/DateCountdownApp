package com.example.awiese.datecountdownapp;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

/**
 * Created by AWiese on 2017/10/12.
 */
@Database(entities = {Event.class}, version = 1)
@TypeConverters(DateTypeConverters.class)
public abstract class EventDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "event_db";

    // For Singleton instantiation
    private static final Object LOCK = new Object();
    private static volatile EventDatabase sInstance;

    public static EventDatabase getInstance(Context context) {
        if (sInstance == null) {
            synchronized (LOCK) {
                if (sInstance == null) {
                    sInstance = Room.databaseBuilder(context.getApplicationContext(),
                            EventDatabase.class, EventDatabase.DATABASE_NAME).build();
                }
            }
        }
        return sInstance;
    }

    public abstract EventDao eventDao();
}
