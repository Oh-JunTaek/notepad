
1. 변수 선언
    val immutable = "I can't be changed"//불변의 변수(읽기전용)
    var mutable = "I can be changed"//가변의 변수

2. 함수 정의
    2-1.fun sayHello() {
        println("Hello, World!")
    }//메세지를 출력하는 함수 정의

    2-2.fun add(a: Int, b: Int): Int {
        return a + b
    }//int(정수인자)를 받아 덧셈을 한다.
    //fun add(a: Int, b: Int): Int = a + b 한줄로 표현이 가능.

    2-3.fun greet(name: String = "World") {
        println("Hello, $name!")
    }

greet() // prints "Hello, World!"
greet("Kotlin") // prints "Hello, Kotlin!"
//greet()함수는 문자열 타입인 name 매개변수를 하나 가진다. 호출시 아무 인자도 전달되지 않으면 기본값 출력한다.

3. 조건문
    val a = 10 //a 값 선언
    if (a > 5) { //a 에 대한 조건을 건다.
        println("a is greater than 5")//충족시 출력을 한다.
    }else if (a == 5) {//그렇지 않다면 이 조건을 확인 해라.
        println("a is equal to 5")
    } else {//if에 포함되지 않는다면 이 문장을 수행해라.
        println("a is less than 5")
    }
//val a = -1
//val result = if (a >0) "positive number" else "non-positive number"
//println(result) 로도 표현이 가능하다.

4. 반복문
    4-1 for 반복문//for문은 반복 가능한 객체(범위, 배열, 컬렉션)을 순회하는데 사용
for (i in 1..10) { // includes both 1 and 10.
        println(i) //
}.

val array = arrayOf("a", "b", "c")
for (i in array.indices) {
    println("Element at $i is ${array[i]}")
}

// or

for ((index, value) in array.withIndex()) {
    println("Element at $index is $value")
}

    var i = 0
    while (i < 10) {
        i++
}
    4-2. wihle 반복문 //조건이 참인 동안 코드 블록을 계속 실행

var i = 0
while (i < 5) {
    println(i)
    i++
}

    4-3.do while 반복문 //조건 검사보다 코드 블록이 먼저 실행된다. (최소 한번은 실행 된다는 뜻)
var i = 0
do {
    println(i)
    i++
} while (i < 5)

    4-4. Break, Continue //특정 조건 만족시 루프 중단, 다음단계로 진입.
for (i in 1..10) {
    if (i == 3) continue // skip the rest of this loop iteration and continue with the next one
    if (i > 5) break // terminate the loop
    print(i)
} // This will print "12"

5. class //클래스 정의 ->객체 지향 프로그래밍의 핵심 요소
//객체지향의 특징.
//1.캡슐화 : 객체의 상태와 행동을 하나로 묶고 외부에서 접근 못하게 한다.(덷이터 보호 및 변경영향 최소화)
//2.상속 : 한 클래스가 다른 클래스의 속성과 메서드를 가져온다. (코드 재사용과 유지보수가 용이)
//3.다형성 : 같은타입의 객체들이 동일한 인터페이스에 서로 다른 동작을 할 수 있다.
//4.추상화 : 복잡한 시스템을 단순화 시켜 필요한 정보만 보고 쉽게 이해하도록 한다.
class Person { //Person이라는 이름으로 class를 정의하였음.
    var name: String = "" //name 이라는 속성이 있다.
    var age: Int = 0
    fun speak() {
        println("Hello, my name is $name and I am $age years old.")
    }
}
5-1 data class : data 키워드를 사용하여 선언도딘 클래스는 데이터 보관용으로 사용.
data class User(val name: String, val age: Int)
5-2 Sealed class : sealed 키워드를 사용하여 선언된 클래스는 한정된 하위 클래스만 가짐.
sealed class Expr {
    data class Const(val number: Double) : Expr()
    data class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr()
}

6.null 안전성
        6-1. 기능타입 : 기본적으로 null값을 가질 수 없지만 변수가 가져야 한다면 ? 를붙인 후 선언.
var nonNullableString: String = "Hello, World!"
nonNullableString = null // 컴파일 에러

var nullableString: String? = "Hello, World!"
nullableString = null // 이것은 허용됩니다.
        6-2 기타 예시
val length: Int? = nullableString?.length//안전 호출 연산자(Safe Call Operator) ?.
val length: Int = nullableString?.length ?: 0//엘비스 연산자(Elvis Operator)?:
val length: Int = nullableString!!.length //강제 참조 연산자(Non-null Asserted Operator)!!:

