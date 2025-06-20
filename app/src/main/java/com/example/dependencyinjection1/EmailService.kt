package com.example.dependencyinjection1

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to:String,from:String,body:String)
}

class EmailService @Inject constructor():NotificationService{
    override fun send(to:String, from:String, body:String)
    {
        Log.d("Utpal1","Email sent")
    }
}
class MessageService(private val retryCount:Int):NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d("Utpal1","Messagee sent")
    }

}
