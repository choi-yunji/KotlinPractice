// Nothing 타입은 실행 흐름이 도달할 수 없는 구역을 나타내기 위한 특수타입이다.
// throw Exception() 표현식은 Nothing 타입을 갖는다.
fun throwing():Nothing = throw Exception()

fun main(args:Array<String>){
    println("start")
    // Nothing 타입은 어떠한 타입과도 호환됨
    val i:Int = throwing()
    println(i)
}

/* Nothing 타입의 활용
    fun validate(num:Int){
        val result:Int =
            if (num >= 0) num
            else throw Exception("num 이 음수입니다.")
    }
    Nothing 타입은 throw 를 표현식으로 쓸 수 있게 하기위한 장치이다.
 */