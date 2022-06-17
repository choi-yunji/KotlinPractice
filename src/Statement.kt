//문장(Statement)은 독립적으로 실행 할 수 있는 코틀린 코드 조각을 뜻함

fun main(args:Array<String>): Unit {
    val num: Int
    num = 15

    println(num + 7 * 3)
}

/*
     여러 문장을 한 줄로 연결하기
     세미콜론을 이용하면, 여러 개의 문장을 한 줄에 쓸 수 있다.
     val num: Int; num = 15; println(num + 7 * 3)
 */