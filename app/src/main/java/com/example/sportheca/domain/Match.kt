package com.example.sportheca.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Match(
    @SerializedName("descricao")
    val description: String,
    @SerializedName("local")
    val place: Pleace,
    @SerializedName("mandante")
    val homeTeam: Team,
    @SerializedName("visitante")
    val awayTeam: Team
) : Parcelable