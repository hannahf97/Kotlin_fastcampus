package aop.part2.calculator

import androidx.room.Database
import androidx.room.RoomDatabase
import aop.part2.calculator.dao.HistoryDao
import aop.part2.calculator.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun historyDao(): HistoryDao

}