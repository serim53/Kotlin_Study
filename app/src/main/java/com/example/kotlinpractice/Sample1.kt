package com.example.kotlinpractice

fun main(){
    helloWorld()

    println(add(4,5))

    //3. String Template

    val name = "Serim"
    val lastName = "Yoon"
    println("my name is ${name + lastName} I'm 23")

    println("is this true? ${1==0}")

    println("this is 2\$a")

    // 주석
    /*

     */

    // android studio 주석 : ctrl + /

    forAndWhile()

}

//1. 함수


fun helloWorld() : Unit {   // Unit은 void와 같음. 리턴형이 없을 때 써주면 됨 (생략 가능)
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int {   // 변수이름 : 변수타입
    return a+b
}

//2. val vs var
//val = value   바뀌지 않는 것(상수)
//var = variable 변하는 값

fun hi(){

    val a : Int = 10

    var b : Int = 9

    var e : String // var은 변수타입 써주어야 함

    b = 100

    val c = 100 // val은 변수 타입은 알아서 구분을 해줌
    var d = 100

    var name : String = "Serim" // : String 생략 가능

}

//4. 조건식
fun maxBy(a: Int, b : Int) : Int {

    if (a>b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a: Int, b : Int) = if(a>b) a else b  // 삼항연산자 return (a>b) ? a: b 대용

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3  // else 필수
    }

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay") // expression으로 사용된 것이 아니므로 없어도 됨
    }
}

// Expression vs Statement
// 코틀린의 모든 함수는 Expression임
// 값을 반환하면 Expression, 명령을 지시하는 문장은 Statement으로 분류

//5. Array and List

// Array는 크기가 지정되어 있음.

// List 1. (Immutable)List => 읽기 전용 2. MutableList(수정가능)  => 읽기, 쓰기 모두 가능

fun array(){
    val array = arrayOf(1,2,3)  // array 초기화
    val list = listOf(1,2,3)    // list 초기화

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
    var result = list.get(0)    // 가져오기만 가능, set이나 수정은 불가능

    var arrayList = arrayListOf<Int>()  // arraylist의 참조값(주소값) 자체는 변하지 않으므로 val로 선언해도 됨
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
}

//6. 반복문 for / while

fun forAndWhile(){

    val students = arrayListOf("serim","james","jenny","jennifer")

    for (name in students){
        println("${name}")
    }

    for ((index, name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for (i in 1..10 step 2){
        sum += i
    }

    /*
    for (i in 10 downTo 1){
        sum += i
    }
    */

    println(sum)

    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }
}

//7. Nullable / NonNull

fun nullcheck(){
    // NPE : NullPointerException
    // 자바에서는 컴파일 시점에서 잡을 수 없고 런해봐야 알 수 있음
    // 코틀린에서는 컴파일 시점에서 잡을 수 있도록 ?를 제공

    var name : String = "serim" // null이면 안되는 타입
    //var nullName : String = null 로 하면 에러
    var nullName : String? = null   // 타입 생략 불가

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase()   //null이 아니면 toUpperCase를 하고, 아니면 null반환 + nullable타입이 됨

    // ?:

    val lastName : String? = null

    val fullName = name + " " + (lastName?: "No lastName")


    // !! -> null이 절대 아님을 컴파일러에 알려줌

}

fun ignoreNulls(str : String?){
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email : String?= "serim@nana.vom"
    email?.let{     // email이 null아니면 let을 실행
        // let은 자신의 receiver 객체를 람다식 내부로 옮겨서 실행하는 함수
        // 여기서는 email이 receiver 객체
        println("my email is ${email}")
    }
}
