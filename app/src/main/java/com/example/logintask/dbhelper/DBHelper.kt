package com.example.logintask.dbhelper

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object{
        val DATABASE_NAME = "VITPL"
        val DATABASE_VERSION = 1
        val _ID = "_ID"
        val TABLE_NAME = "USERS"
        val NAME = "NAME"
        val EMAIL = "EMAIL"
        val PASSWORD = "PASSWORD"
        val CITY = "CITY"
        val ADDRESS = "ADDRESS"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val query = "CREATE TABLE " +
                TABLE_NAME + " ( " +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                NAME + " TEXT, " +
                EMAIL + " TEXT, " +
                CITY + " TEXT, " +
                ADDRESS + " TEXT, " +
                PASSWORD + " TEXT " +");"

        val insertQuery = "INSERT INTO " +
                TABLE_NAME + "(NAME, EMAIL, CITY, ADDRESS, PASSWORD) VALUES ( 'sagar','sagar@123.com','nagpur','nagpur','123')"

        db.execSQL(query)
        db.execSQL(insertQuery)

    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

//    add user data
//    @Throws(SQLiteConstraintException::class)
//    fun insertUser(user: UserModel): Boolean {
//        val values = ContentValues()
//        values.put(NAME, user.name)
//        values.put(EMAIL, user.email)
//        values.put(CITY, user.city)
//        values.put(ADDRESS, user.address)
//        values.put(PASSWORD, user.password)
//        val db = this.writableDatabase
//        db.insert(TABLE_NAME, null, values)
//        db.close()
//        return true
//    }

//    fun insertData(name: String, email: String,city : String, address: String, password: String):Boolean {
//        val values = ContentValues()
//        values.put(NAME, name)
//        values.put(EMAIL, email)
//        values.put(CITY, city)
//        values.put(ADDRESS, address)
//        values.put(PASSWORD, password)
//        val db = this.writableDatabase
//        db.insert(TABLE_NAME, null, values)
//        db.close()
//        return true
//    }


//    fun checkUserExist(username: String, password: String): Boolean {
//        val columns = arrayOf("username")
//        val db = this.readableDatabase
//        val selection = "username=? and password = ?"
//        val selectionArgs = arrayOf(username, password)
//        val cursor: Cursor =
//            db.query(TABLE_NAME, columns, selection, selectionArgs, null, null, null)
//        val count = cursor.count
//        cursor.close()
//        close()
//        return count > 0
//    }

}


