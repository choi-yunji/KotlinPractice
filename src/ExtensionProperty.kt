// 문자열이 숫자로만 이루어져있는지 판단하는 확장 프로퍼티
// 확장프로퍼티도 확장함수처럼 프로퍼티 이름 앞에 리시버 타입을 적는다.
/** 확장프로퍼티에는 Field 가 존재하지 않는다. 따라서 field 식별자는 사용할 수 없다.
 *
 */
val String.isNumber: Boolean
    get()
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
    println("1234567890".isNumber)
    println("500 원".isNumber)
}
