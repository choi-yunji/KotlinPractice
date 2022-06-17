package operators

import ex_inheritance.Person
import ex_inheritance.Student

class Professor(name:String, age:Int):Person(name, age)

fun main(args:Array<String>){
    val person:Person = Student("Mark Zuckerberg", 33, 20171225)
    /** is 연산자로 참조 변수가 실제로 가리키고 있는 객체의 타입을 알아낼 수 있다.
     * 코틀린의 is 연산자는 자바의 instanceof 에 해당한다.
     */
    println("${person is Person}")
    println("${person is Student}")
    println("${person is Professor}")

    val person2:Person = Professor("Kim", 48)
    println("${person2 is Person}")
    println("${person2 is Student}")
    println("${person2 !is Professor}")
}

/* is 연산자를 when 에 사용하기
    val person:Person
    ...
    when(person){
    is Person -> {}
    is Student -> {}
    is Professor -> {}
    }
 */