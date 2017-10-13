package com.example.awiese.datecountdownapp;

import android.arch.persistence.room.TypeConverter;

import java.time.LocalDateTime;

/**
 * Created by AWiese on 2017/10/12.
 */

public class DateTypeConverters {


    @TypeConverter
    public static void toDate(Long timestamp) {
    }

    @TypeConverter
    public static void toTimestamp(LocalDateTime date) {

    }
}
