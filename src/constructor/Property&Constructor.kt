package constructor
/* 생성자와 프로퍼티 한번에 쓰기
   생성자 매개변수 앞에 val 이나 var 키워드를 붙이면, 동일한 이름의 프로퍼티가 같이 선언된다.
   생성자 매개변수에 들어온 인수가 프로퍼티의 초기값이 된다.
 */
class Car(val name:String, val speed:Int=0)

fun main(args:Array<String>){
    // Car 의 인스턴스를 생성하고 내용을 출력
    val car = Car("My Car")
    println(car.name)
    println(car.speed)
}