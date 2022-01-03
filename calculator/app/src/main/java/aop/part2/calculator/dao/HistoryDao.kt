package aop.part2.calculator.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import aop.part2.calculator.model.History

@Dao
interface HistoryDao {

    @Query("SELECT * FROM History")
    fun getAll():List<History>

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM History")
    fun deleteAll()

    @Delete
    fun delete(history: History)


}