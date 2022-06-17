package operators

/** in 연산자는 어떤 값이 객체에 포함되어 있는지 여부를 조사하는 역할 **/
fun main(args:Array<String>){
    println('o' in "Kotlin")
    println("in" !in "Kotlin")
}

/*
    String 클래스에는 Char 타입을 인수로 받는 contains 와, String 타입을 인수로 받는 contains 가 존재한다.
    in 연산자의 왼쪽 피연산자로 Char 타입과 String 타입의 표현식을 지정할 수 있다.
    in 연산자는 operator fun contains(매개변수:타입):Boolean 멤버함수로 오버로딩 할 수 있다.
 */