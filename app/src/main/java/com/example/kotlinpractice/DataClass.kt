package com.example.kotlinpractice

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)

// toString(), hashCode(), equals(), copy() 가 data class를 이용하면 자동으로 만들어짐

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main(){
    val ticketA = Ticket("KoreanAir", "serimYoon", "20210713", 14)
    val ticketB = TicketNormal("KoreanAir", "serimYoon", "20210713", 14)

    println(ticketA)
    println(ticketB)
}