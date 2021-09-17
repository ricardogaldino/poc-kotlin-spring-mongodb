package com.engsoft.cine.infrastructure.data.entity

data class MovieEntity(
    val _id: String,
    val title: String,
    val year: Int,
    val rating: Int,
    val genre: String,
    val director: String,
    val country: String,
    val actors: List<String>,
    val languages: List<String>,
    val subtitles: List<String>,
)