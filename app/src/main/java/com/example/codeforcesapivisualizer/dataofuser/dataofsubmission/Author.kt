package com.example.codeforcesapivisualizer.dataofuser.dataofsubmission

import com.example.codeforcesapivisualizer.dataofuser.dataofsubmission.Member

data class Author(
    val contestId: Int,
    val ghost: Boolean,
    val members: List<Member>,
    val participantType: String,
    val room: Int,
    val startTimeSeconds: Int
)