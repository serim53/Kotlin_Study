package com.example.kotlinpractice

// 코틀린은 파일이름이랑 클래스 이름이랑 일치하지 않아도 됨
// 여러 클래스를 한 파일 안에 넣어도 됨

class Human constructor(val name : String = "Anonymous"){ // 생성자 constructor 빼고 class Human(val name : String) 형태도 ok

    constructor(name : String, age :Int) : this(name){   // 부생성자는 주생성자의 위임을 받아야 함
        println("My name is ${name}, ${age}years old")
    }
    init {  // 주생성자의 일부라서 객체 생성시 함께 돌아감
        println("New human has been born!!")
    }
    //val name = name
    fun eatingCake() {
        println("This is so YUMMY~")
    }
}

fun main(){
    /*
    val human = Human("minsu")

    val stranger = Human()

    human.eatingCake()
    */

    val serim = Human("serim", 23)
//    println("this human's name is ${human.name}")
//    println("this human's name is ${stranger.name}")    //디폴트값이 출력됨


}