package com.hackthealps.paylocal_reader.model


data class Payment(
        val customerTransactionKey:String,
        val customerTokenIdentification: String,
        val amount: Int,
        val shopTokenIdentification: String,
        val shopTransactionKey: String,
        val modelID: Int,
        val  modelName:String,
        val greentravle:Boolean)

{
}