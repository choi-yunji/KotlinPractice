package exception

fun main(args:Array<String>){
    try {
        someting()
    }
    catch (e:Exception){
        println(e.message)
    }
}

fun someting(){
    // a를 b로 나눈 몫을 반환하는 함수
    fun div(a:Int, b:Int):Int{
        if (b == 0)
            // 예외를 던지는 코드 예외를 던질때는 throw Throwable 타입 표현식 과 같이쓴다.
        /** 여기서는 Throwable 이 아닌 Exception 의 인스턴스를 생성했는데  Exception 이 Throwable 을 상속하므로 문제없다.
         * Exception 의 생성자로 String 값을 전달하면 예외의 원인을 알려주는 메시지를 지정할 수 있다.
         * 예외가 던져지는 순간 그아래에 있는 코드들은 모두 무시되며 함수를 호출했던 곳으로 실행흐름이 이동된다.
         */
        throw Exception("0으로 나눌 수 없습니다.")
        return a/b
    }
}

/* 코틀린의 throws 키워드
   코틀린에는 throws 키워드가 없다. 자바에서는  throws 가 있는 함수를 호출 할 때마다
   try-catch 블록으로 감싸야만 한다.
   코틀린에서의 예외처리는 필수가 아닌 옵션이다.
 */