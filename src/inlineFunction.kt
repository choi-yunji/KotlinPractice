/* inline 함수 - 실행 흐름을 점프하지 않고 함수 호출문을 함수의 몸체로 대체
   inline 함수는 재귀호출이 불가능하다. 함수 몸체 코드가 무한대로 늘어날 수 있기때문
   inline 함수는 함수 속의 문장을 재활용 하지 않기 때문에 문장이 많은 함수를 inline 으로 바꾸면
   프로그램의 크기가 기하급수적으로 늘어난다.
 */
inline fun hello()
{
    println("Hello")
    println("Kotlin")
}

fun main(args: Array<String>)
{
    hello()
    hello()
    hello()
}

/* 이 함수 호출문들은 컴파일되는 순간 다음처럼 코드가 대체된다.
    fun main(args:Array<String>){
    println("Hello")
    println("Kotlin")
    println("Hello")
    println("Kotlin")
    println("Hello")
    println("Kotlin")
    } 함수 호출문이 함수 속의 문장으로 대체됐다.
 */

