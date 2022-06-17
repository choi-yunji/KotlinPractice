/* 캐스팅(Casting) 또는 형변환이란, 특정타입을 다른타입으로 변환하는 것
 */
package upcasting

open class Person(val name:String, val age:Int)

class Student(name: String, age: Int, val id:Int):Person(name,age)

fun main(args:Array<String>){
    // 이렇게 서브클래스의 인스턴스를 슈퍼클래스 타입으로 가리키는 것을 업캐스팅(Upcasting)이라고 한다.

    val person:Person = Student("John", 32, 20171218)
}
