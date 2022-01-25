package com.example.sportheca.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sportheca.databinding.ActivityMainBinding
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatActionBotton();
        setupHttpClient();
    }

    private fun setupHttpClient() {
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://github.com/rosianeclemente/API-Sportheca/blob/main/matches.json")
    }

    private fun setupMatchesList() {
        TODO("Not yet implemented")
    }
    private fun setupMatchesRefresh() {
        TODO("Not yet implemented")
    }
    private fun setupFloatActionBotton() {
        TODO("Not yet implemented")
    }


}