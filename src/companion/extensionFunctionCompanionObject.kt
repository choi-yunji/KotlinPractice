package companion

/* 동반자 객체의 확장 함수
   확장 함수를 다음과 같이 선언하면 동반자 객체에도 확장 함수를 달 수 있다.
   fun 클래스 이름.Companion.함수이름(){
   }
 */

class Person {companion object}

fun Person.Companion.create() = Person()

fun main(args:Array<String>) = Person.create()