package RepeatingSentence

/* while 은 특정 문장을 반복할 때 사용하는 키워드
   while(Boolean 표현식) - 조건이라고하며 조건이 ture 이면 while 블록속에 문장을 실행
                          반복 조건을 잘못 지정하면 조건이 계속 ture 이기 때문에 while 블록을 무한히 실행하는 무한루프에 빠진다
   {
        while 에 포함시킬 문장들
    }
 */

fun main(args:Array<String>): Unit {
    var i =1

    while (i<10){
        println(i)
        i += 1
    }
}