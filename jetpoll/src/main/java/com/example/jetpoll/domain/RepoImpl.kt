package com.example.jetpoll.domain

import com.example.jetpoll.data.DataSource
import com.example.jetpoll.data.model.Poll
import com.example.jetpoll.vo.Result

class RepoImpl(private val dataSource: DataSource):Repo{
    override suspend fun getAllPolls(): Result<List<Poll>> = dataSource.dummyPollList
    override suspend fun createPoll(poll: Poll): Result<Boolean> = dataSource.createPoll(poll)
}