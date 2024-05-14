package com.example.letsdo

import androidx.room.*

@Dao
interface DAO {
    @Insert
    suspend fun insertTask(entity: Entity)

    @Update
    suspend fun updateTask(entity: Entity)

    @Delete
    suspend fun deleteTask(entity: Entity)

    @Query("Delete from to_do")
    suspend fun deleteAll()

    @Query("Select * from to_do")
    suspend fun getTasks():List<CardInfo>

    @Query("SELECT * FROM to_do WHERE id = :id")
    suspend fun getTaskById(id: Int): CardInfo?

    @Query("SELECT * FROM to_do WHERE priority = :priority")
    suspend fun getTasksByPriority(priority: String): List<CardInfo>

}