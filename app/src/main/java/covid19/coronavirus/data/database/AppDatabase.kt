package covid19.coronavirus.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import covid19.coronavirus.BuildConfig
import covid19.coronavirus.data.database.dao.CountryDao
import covid19.coronavirus.data.database.dao.TotalCasesDao
import covid19.coronavirus.model.*

@Database(
    entities = [CountryResponse::class, CountryInfo::class, TotalResponse::class],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        const val DATABASE_NAME = BuildConfig.APPLICATION_ID
    }

    abstract fun countryDao(): CountryDao

    abstract fun totalCasesDao(): TotalCasesDao
}