package com.example.meuprimeiroapp.database.converters

import androidx.room.TypeConverter
import java.util.Date

/**
 * Date Converter para "Ensinar" o data base a trabalhar com objetos do tipo Date
 * O Date nada mais do que um long com a data em milissegundos
 */
class DateConverters {

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }
    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}