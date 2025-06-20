package com.example.dependencyinjection1

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                                                  /*@Named("email")*/@messageQualifier private val notificationService: NotificationService) {

    fun registerUser(email:String,password:String)
    {
        userRepository.SaveUser(email,password)
        notificationService.send(email,"utpalmohanta517@gmail.com","User Registerd")
    }
}