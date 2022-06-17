package ConditionalStatement

// 흐름제어- 조건문 if-else
// else 는 if와 짝이 되는 키워드 , if가 나오고 난 다음에만 else 를 사용할 수 있다.
// else 는 자신과 연결된 if의 조건이 false 일 때만 실행된다.

fun main(args:Array<String>): Unit {
    val a = 10
    val b = 5

    if(a < b)
        println("if")
    else
        println("else")

    if (a > b)
        println("a가 크다.")
    else
        println("b는 a 이상이다.")

    function()
    function2()
}
// if-else 의 중첩
// if 나 else 안에는 또 다른 if 를 넣을 수 있다.
fun function() {

    val score = 88

    if (score >= 90){
        println('A')
    }else if (score >= 80){
        print('B')
    }else if (score >= 70){
        println('C')
    }else{
        println('F')
    }
}

// if-else 를 표현식으로 사용하기
fun function2() {
    val value:Int = if(10 > 5){
        println("10은 5보다 크다")
        10
    }else{
        println("10은 5보다 크지 않다")
        5
    }
    println(value)
}