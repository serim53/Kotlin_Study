package com.example.kotlinpractice


// 1. Lamda
// 람다식은 우리가 마치 value처럼 다룰 수 있는 익명 함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}


val square : (Int) -> (Int) = {number -> number*number}

val nameAge = {name : String, age : Int ->
    "My name is ${name} I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("serim", 23))
    val a = "Serim said "
    val b = "Rim said "

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("serim",23))

    println(calculateGrade(97))


    val lamda = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))

    println(invokeLamda{it > 3.22}) // 마지막 파라미터가 람다식일 때



}

// 확장함수

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String {

    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}

    return name.introduceMyself(age)
}

// 람다의 Return
// 마지막 표현식이 return의 value type을 결정한다.

val calculateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}

// pojo 클래스 (메소드가 있어서 특정 행동을 하기보다는 비어있어서 틀 역할을 해주는 클래스)
