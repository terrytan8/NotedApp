package com.example.notedapp.feature.domain.util

sealed class OrderType{
    object Ascending:OrderType()
    object Descending:OrderType()
}
