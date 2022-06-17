/* 중위표기법 - 피연산자 연산자 피연산자의 순서로 표현식을 구성하는 방식
   멤버함수의 매개변수가 하나뿐이면 함수 호출을 중위표기법으로 할 수 있다.
   중위표기법을 지원하려면 함수선언문앞에 infix 를 붙여야 한다.
 */
class Point(var x :Int = 0, var y:Int=0){
    infix fun from(base:Point):Point {
        return  Point(x-base.x, y-base.y)
    }

    fun main(args:Array<String>){
        val pt = Point(3,6) from Point (1,1)
        println(pt.x)
        println(pt.y)
    }
}
