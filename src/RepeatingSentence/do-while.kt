package RepeatingSentence

/* do-while 도 문장 마지막에서 조건을 검사한다는 점만 빼면 while 과 동일함
    조건을 검사하는 부분이 맨 뒤로 옮겨졌으므로 적어도 한번은 무조건 실행된다.
    do
    {
        do-while 에 포함시킬 문장들
    }while(Boolean 표현식)

 */

fun main(args:Array<String>):Unit {
    var i = 1
    do {
        println("실행됨")
    }while (i==0)
}