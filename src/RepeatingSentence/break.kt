package RepeatingSentence

fun main(args:Array<String>):Unit {
    var i = 0
    while (true) {
        i += 1
        if (i >= 5)
            break //반복문을 즉시 탈출 할 수 있다. 이 문장이 실행되는 순간 while 블록을 탈출한다.
                  // 가장가까운 블록 하나만 탈출
        println(i)
    }
}