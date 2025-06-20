package com.example.dependencyinjection1

import dagger.BindsInstance
import dagger.Component

@Component(modules=[UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {

    /*fun getUserRegistrationService():UserRegistrationService
    fun getEmailService():EmailService*/

    fun inject(mainActivity: MainActivity)   /* where mainActivity is a consumer VideoC:04*/

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }
}