package com.train

import java.util.*

fun main() {
    println("Please enter number of tickets: ")
    val numTScanner = Scanner(System.`in`)
    if (!numTScanner.hasNextInt()) {
        println("Input is not number, Please enter number")
        return
    }
    val numT = numTScanner.nextInt()
    if (numT <= 0) {
        println("Please enter number > 0")
        return
    }
    println("How many round-trip tickets:  ")
    val numRTScanner = Scanner(System.`in`)
    if (!numRTScanner.hasNextInt()) {
        println("Input is not number, Please enter number")
        return
    }
    val numRT = numRTScanner.nextInt()
    if (numRT > numT) {
        println("round-trip tickets number > total tickets")
        return
    }
    TicketKotlin(numT, numRT).printPrice()
}


class TicketKotlin(val numTicket: Int, val numRoundTrip: Int) {
    private val priceT = 1000
    private val priceRT = 2000
    private val discount = 0.9f

    private fun getTPrice(): Int = (numTicket - numRoundTrip) * priceT

    private fun getRTPrice(): Float = numRoundTrip * priceRT * discount

    private fun getTotalPrice(): Float = getTPrice() + getRTPrice()

    fun printPrice() {
        println("Total tickets: $numTicket")
        println("Round-trip: $numRoundTrip")
        println("Total: ${getTotalPrice()}")
    }
}