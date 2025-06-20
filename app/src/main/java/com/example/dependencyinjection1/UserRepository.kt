package com.example.dependencyinjection1

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun SaveUser(email:String,password:String)
}

class SQLRepository @Inject constructor():UserRepository{
    override fun SaveUser(email:String, password:String)
    {
        Log.d("utpal","User saved in Database")
    }
}
class FirebaseRepository:UserRepository
{
    override fun SaveUser(email: String, password: String) {
        Log.d("utpal","User saved in Firebase")

    }

}