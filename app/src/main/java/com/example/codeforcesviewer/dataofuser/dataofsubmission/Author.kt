package com.asr.codeforcesapivisualizer.dataofuser.dataofsubmission

data class Author(
        val contestId: Int,
        val ghost: Boolean,
        val members: List<Member>,
        val participantType: String,
        val room: Int,
        val startTimeSeconds: Int
)