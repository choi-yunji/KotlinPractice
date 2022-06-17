/* 상속(Inheritance) - 기존에 존재하는 클래스를 확장하여 새로운 클래스를 정의하는 기법
   코틀린은 자바와는 달리, 클래스 선언이 기본적으로 final 로 되어 있기 때문에 상속을 허용하려면,
   클래스 정의부 앞에 open 키워드를 붙여주어야 한다.
   상속을 할 때는 반드시 슈퍼클래스의 생성자를 호출해야 한다.
   class 클래스 이름:슈퍼클래스 생성자(인수)
   {...}
   서브클래스도 앞에 open 을 붙이면 상속 가능
 */
package ex_inheritance
/** 상속의 대상이 되는 클래스(슈퍼클래스) **/
open class Person(val name:String, val age:Int)
/** 상속하여 확장된 클래스(서브클래스) **/
class Student(name:String, age: Int, val id:Int):Person(name,age)

fun main(args:Array<String>){
    val person = Person("홍길동",35)
    val student = Student("김길동",23,20171217)
}

// 상속의 용도
// 클래스를 확장하기 위해서 보다는, 유사한 객체들을 하나의 타입으로 받을 수 있게 하기 위해서 사용한다.
// 단순히 클래스를 확장하는 게 목표라면, 상속보다는 확장 함수나 확장 프로퍼티를 이용하는 것이 더 낫다.