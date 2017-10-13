package com.example.awiese.datecountdownapp;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by AWiese on 2017/10/12.
 */

public class DateTypeConverters {


    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }

    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
