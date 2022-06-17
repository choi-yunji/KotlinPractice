/* 메모리의 스택(Stack)영역
   지역변수가 저장되는 영역 스택은 '쌓아올리다' 라는 뜻으로 변수가 생성될때
   생성된 순서대로 차곡차곡 쌓이기 때문에 이런 이름이 붙었다.
 */
fun main(args: Array<String>)
{
    val a = -36
    val result = absolute(a)
    println(result)
}

// 입력받은 정수의 절대값을 반환하는 함수
fun absolute(number: Int): Int
{
    return if (number >= 0)
        number
    else -number
}