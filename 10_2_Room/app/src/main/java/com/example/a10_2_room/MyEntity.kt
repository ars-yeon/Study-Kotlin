package com.example.a10_2_room

import androidx.room.*

@Entity(tableName = "student_table") // 테이블 이름을 student_table로 지정
data class Student(
    @PrimaryKey @ColumnInfo(name = "student_id")
    val id: Int,
    val name: String
)