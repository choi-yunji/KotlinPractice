// nullable 리시버 - 리시버 타입에 ? 가 붙은 것
// 참조변수에 null 이 지정되어 있어도 함수 호출이 가능
fun String?.isNumber()
{
    if (this == null)
        println("문자열이 null입니다.")
}

fun main(args: Array<String>)
{
    val empty: String? = null
    empty.isNumber()
}
