package ConditionalStatement

/* 흐름 제어- 조건문 when
   자바의 switch-case 를 훨씬 업그레이드 한 버전
   when 은 다음과 같은 형태로 쓴다.
   when (타깃 표현식)
   {
        타깃 표현식과 비교할 값  ->
        {
            N개의 문장
        }
    }
 */

fun main(args:Array<String>): Unit {
    val score = 64

    when(score/10) {
        6 -> println('D')
        7 -> println('C')
        8 -> println('B')
        9, 10 -> println('A')
        else -> println('F')
    }
    println("test")
    score()
}

//when 을 표현식으로 사용하기
fun score() {
    val score =95

    val grade:Char = when (score/10){
        6-> 'D'
        7-> 'C'
        8-> 'B'
        9,10 -> 'A'
        else -> 'F'
    }

    println(grade)
}

/* when 을 if-else 처럼 쓰기
   val grade:Char = when {
        score >=90 -> 'A'
        score >=80 -> 'B'
        score >=70 -> 'C'
        score >=60 -> 'D'
        else -> 'F'
    }
 */