package com.example.awiese.datecountdownapp;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;


class DateTypeConverters {


    @TypeConverter
    static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }

    @TypeConverter
    static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
