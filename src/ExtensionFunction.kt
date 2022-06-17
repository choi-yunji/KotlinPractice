/** 확장함수 - 상속없이 클래스 외부에서 멤버 함수를 추가할 수 있다.
 * 확장함수 선언 - 함수이름 앞에 '함수를 주입할 클래스.' 를 붙여주면된다.
 * 여기서 함수를 주입할 클래스를 리시버(Receiver) 타입이라고 부른다.
 */
// 문자열이 숫자로만 이루어져있는지 판단하는 확장 함수
fun String.isNumber(): Boolean
{
    var i = 0
    while (i < this.length)
    {
        // 숫자가 아닌 문자가 하나라도 들어있으면 false 반환
        if (!('0' <= this[i] && this[i] <= '9'))
            return false
        i += 1
    }
    // 모든 조건을 통과하면 true 반환
    return true
}

fun main(args: Array<String>)
{
    println("1234567890".isNumber())
    println("500 원".isNumber())
}

/* 멤버함수와 동일한 확장함수
   만약, 클래스에 이미 존재하는 멤버 함수와 동일한 시그니처의 확장 함수가 있으면 어떻게 될까?
   오류는 나지 않지만, 확장함수가 가려진다. 즉, 함수 호출시 멤버함수만 항상 호출된다.
 */