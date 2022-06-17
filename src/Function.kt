/* 함수(Function)
   함수 선언
   fun 식별자 (): 반환타입
   {
        함수에 포함시킬 문장
   }
 */
fun main(args:Array<String>):Unit {
    println(myFunction()) // 이 줄이 실행되는 순간 해당 함수속에 들어 있던 문장들이 순차적으로 실행, 이를 함수 호출이라함
    println(myFunction() + 10)
}

fun myFunction():Int{
    val a = 3
    val b = 6
    println("a:" + a + "b:" + b)
    return a + b // return 은 함수를 호출했던 위치로 되돌아 가는 키워드
                 // return 뒤에 함수 반환 타입에 맞는 표현식을 적으면 함수가 표현식의 값으로 대체된다.
}

/* 함수 간단히 쓰기
   fun function():Double
   {
        return 3.0 + 7
   }
   함수 블록의 문장이 하나일 경우, 한줄로 축약할 수 있다.
   fun function():Double = 3.0 + 7
   단 return 은 반드시 생략해야하며 = 오른쪽은 함수의 반환 타입과 일치하는 표현식이 와야한다.
   나아가 함수의 반환타입까지 생략할 수 있다.
   fun function() = 3.0 + 7
 */