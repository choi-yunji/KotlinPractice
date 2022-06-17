package RepeatingSentence

/* continue - 반복문의 일부 문장을 무시하고 건너뛸 수 있다

 */

fun main(args:Array<String>):Unit {
    var i = 0
    while (i < 10){
        i += 1
        if (i%2==0) //짝수이면
            continue // 아래의 문장들을 모두 skip 한다. i가 짝수이면 항상 continue 가 실행되므로 print 함수를
                    // 만나지 못해 출력되지 않는다.
        println(i)
    }
}