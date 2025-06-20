package com.example.dependencyinjection1

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule(){ //private val retryCount: Int

    @messageQualifier
/*
    @Named("message")
*/
    @Provides
    fun getMessageService(retryCount:Int):NotificationService
    {
        return MessageService(retryCount)  //3 sudu dila ta hard code hoya jay..
    }

    @Named("email")
    @Provides
    fun getEmailService():NotificationService
    {
        return EmailService()
    }


}