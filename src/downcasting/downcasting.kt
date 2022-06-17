package downcasting

import upcasting.Person
import upcasting.Student

fun main(args:Array<String>){
    val person:Person = Student("John", 32, 20171218)
    val person2:Person = Person("Jack",29)

    // as 연산자는 왼쪽 피연산자(참조변수)의 타입을 오른쪽 피연산자(타입)으로 캐스팅한다.
    var person3:Student = person as Student
    // 캐스팅에 실패했을 때 예외가 발생하는 것을 막고싶으면 as? 연산자를 대신 사용해야 한다.
    // as 연산자는 캐스팅에 실패하면 null 을 돌려준다.
    person3 = person2 as Student
}