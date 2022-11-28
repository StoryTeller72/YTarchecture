package com.example.ytarchecture.domain.useCases

import com.example.ytarchecture.domain.models.UserName

class GetUserNameUseCase {
    fun execute(): UserName{
        return  UserName(firstName =  "Ivan", lastName = "Ivanov")
    }
}