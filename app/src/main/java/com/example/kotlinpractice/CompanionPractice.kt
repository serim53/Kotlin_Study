package com.example.kotlinpractice

// 정적인 메소드나 정적인 변수를 선언할 때 Companion을 쓴다.

class Book private constructor(val id : Int, val name : String){    // private를 사용하여 다른 곳에서 객체를 생성하지 못하게끔

    companion object BookFactory :IdProvider{  // companion object BookFactory { 로 써도 가능

        val myBook = "new book"

        fun create() = Book(getId(), myBook)

        override fun getId(): Int {
            return 444
        }
    }

}

interface IdProvider {
    fun getId() : Int
}

fun main(){
    val book = Book.create()  // companion은 생략 가능

    val bookId = Book.BookFactory.getId()

    println("${book.id} ${book.name}")
}

// Companion Object가 하는 일은
// Private 프로퍼티나 메소드를 읽어올 수 있게 함.
// Java의 Static과 같은 역할
