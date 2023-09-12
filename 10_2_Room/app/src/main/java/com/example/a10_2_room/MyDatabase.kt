package com.example.a10_2_room

import android.content.Context
import androidx.room.*
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [Student::class], exportSchema = false, version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun getMyDao(): MyDAO

    companion object {
        private var INSTANCE: MyDatabase? = null
        private val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
            }
        }

        fun getDatabase(context: Context):MyDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context, MyDatabase::class.java, "school_database")
                    .addMigrations(MIGRATION_1_2)
                    .build()
            }
            // for in-memory database
            /*INSTACNE = Room.inMemoryDatabaseBuilder(
                context, MyDatabase::class.java
            ).build()*/
            return INSTANCE as MyDatabase
        }
    }
}