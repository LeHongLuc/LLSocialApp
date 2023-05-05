package com.luclh.llsocialapp.base.usecase

interface UseCase<PARAM, RESULT> {
    suspend fun excute(param: PARAM): RESULT
}