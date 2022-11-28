 package com.example.ytarchecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.BoringLayout
import com.example.ytarchecture.databinding.ActivityMainBinding
import com.example.ytarchecture.domain.models.SaveUserNameParam
import com.example.ytarchecture.domain.models.UserName
import com.example.ytarchecture.domain.useCases.GetUserNameUseCase
import com.example.ytarchecture.domain.useCases.SaveUserNameUseCase

 class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding
     private val getUserNameUseCase = GetUserNameUseCase()
     private val saveUserNameUseCase = SaveUserNameUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaveData.setOnClickListener {
            val text = binding.etInputData.text.toString()
            val params = SaveUserNameParam(name = text)
            val result : Boolean = saveUserNameUseCase.execute(params = params)
            binding.tvOutputData.text = "Save result = $result"
        }

        binding.btnGetData.setOnClickListener {
            val userName: UserName = getUserNameUseCase.execute()
            binding.tvOutputData.text = "${userName.firstName} ${userName.lastName}"
        }
    }
}