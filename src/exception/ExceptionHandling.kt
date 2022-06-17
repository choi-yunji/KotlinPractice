package exception

import java.lang.NumberFormatException

fun main(args:Array<String>){
    // 예외가 발생할 가능성이 있는 부분을 try 블록으로 감싸고 있음
    try {
        val str = "abcd"
        val num = str.toInt()

        println(num)
    // try 블록 바로 아래에 예외가 발생했을 때 실행할 코드를 catch 블록으로 지정
    // catch 의 소괄호 안에는 어떤 예외가 발생했을 때 이 catch 블록을 실행할지를 지정
    }catch (e:NumberFormatException){
        // e는 예외 객체를 가리키는 참조변수, NumberFormatException 은 예외 타입
        println("문자열을 숫자로 변경하지 못함")
    // 예외 발생 여부와 상관 없이 무조건 실행되는 블록 try 블록 안의 코드를 무사히 마쳐도
    // 예외가 발생해 catch 블록으로 빠져도 finally 블록은 항상 실행된다.
    }finally {
        println("프로그램 종료")
    }
}

/** 여러 종류의 예외 처리하기
 * 여러 종류의 예외를 처리하려면 catch 블록을 여러 개 두면 된다.
 * try {...}
 * catch (e:NumberFormatException){...}
 * catch (e:KotlinNullPointerException) {...}
 * 발생한 예외에 맞는 catch 블록으로 실행 흐름이 점프한다.
 **/
