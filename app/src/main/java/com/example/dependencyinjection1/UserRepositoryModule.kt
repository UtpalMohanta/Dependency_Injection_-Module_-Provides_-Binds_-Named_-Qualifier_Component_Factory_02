package com.example.dependencyinjection1

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

    /*@Provides
    fun getFirebaseRepository():UserRepository
    {
        return FirebaseRepository()
    }*/

    /*@Provides
    fun getSQLRepository(sqlRepository: SQLRepository):UserRepository
    {
        return SQLRepository()
    }*/

    @Binds  //provide ae poribotta..
    abstract fun getSQLRepository(sqlRepository: SQLRepository):UserRepository
}