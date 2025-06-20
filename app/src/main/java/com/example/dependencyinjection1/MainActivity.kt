package com.example.dependencyinjection1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.sql.Date
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService:UserRegistrationService /*Field Injection*/

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(3)

        /*.notificationServiceModule(NotificationServiceModule(3))
        .build()*/

/*
        val component= DaggerUserRegistrationComponent.Builder().build()
*/
        component.inject(this)

        /*val userRegistrationService=component.getUserRegistrationService()
        val emailService=component.getEmailService()*/

        userRegistrationService.registerUser("sdjklsadl@gmail.com","11111")

    }
}

