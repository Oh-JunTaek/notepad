 //data 키워드를 사용하여 선언도딘 클래스는 데이터 보관용으로 사용.
data class Person(val name: String, val age: Int)

val john = Person("John", 30)
val jane = john.copy(name = "Jane") // John 객체를 복사하여 Jane 객체를 생성

println(john) // 출력: Person(name=John, age=30)
println(jane) // 출력: Person(name=Jane, age=30)

if (john == jane) {
    println("They are the same person.")
} else {
    println("They are different people.")
}
// 출력: They are different people.