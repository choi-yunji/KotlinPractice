/* 특정조건을 만족하는 경우 컴파일러는 변수의 타입을 다른 타입으로 자동캐스팅 한다
   이를 스마트캐스팅(Smart Casting)이라고 부른다.
 */
fun main(args:Array<String>){
    val number:Int? = null
    val number2 = 1225

    checkNull(number)
    checkNull(number2)
}

fun checkNull(any:Any?){
    if (any == null){
        println("null 이 들어왔습니다.")
        return
    }

    /** any 가 null 이면 15번줄에 의해 함수가 종료되므로 19번줄까지 실행흐름이 왔다는 것은 any 가 null 이 아니라는것을 의미한다.
     * 이렇게 특정 변수에 null 값이 들어있지 않다는 것을 완벽히 추론해 낼 수 있을 때 그변수는 자동으로 Not-null 타입이된다.
     * 그래서 any?.toString()이 아닌 any.toString()으로 호출이 가능하다.
      */
    println(any.toString())
}
