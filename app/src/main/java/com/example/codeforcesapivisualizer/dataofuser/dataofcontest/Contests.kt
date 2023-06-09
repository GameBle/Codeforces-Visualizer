package com.example.codeforcesapivisualizer.dataofuser.dataofcontest

data class Contests(
        val contestId: Int,
        val contestName: String?,
        val handle: String?,
        val newRating: Int,
        val oldRating: Int,
        val rank: Int?,
        val ratingUpdateTimeSeconds: Long
)