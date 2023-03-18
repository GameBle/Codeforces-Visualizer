package com.asr.codeforcesapivisualizer.dataofuser.dataofsubmission

import com.asr.codeforcesapivisualizer.dataofuser.dataofsubmission.Submission

data class UserSubmissions(
        val result: List<Submission>,
        val status: String
)