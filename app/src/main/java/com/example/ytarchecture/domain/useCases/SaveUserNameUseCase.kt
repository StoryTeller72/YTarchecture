package com.example.ytarchecture.domain.useCases

import com.example.ytarchecture.domain.models.SaveUserNameParam

class SaveUserNameUseCase {

    fun execute(params: SaveUserNameParam): Boolean{
        return params.name.isNotEmpty()
    }
}