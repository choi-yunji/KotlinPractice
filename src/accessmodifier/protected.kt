package accessmodifier
/** protected 는 서븤클래스에서도 접근 가능하다는 점만 빼면 private 와 동일하다. **/
open class AAA(protected val number:Int)

class BBB(number: Int) : AAA(number)
{
    fun printNumber()
    {
        // AAA 클래스의 number 프로퍼티에 접근 가능
        println(number)
    }
}

fun main(args: Array<String>)
{
    val test = BBB(36)
//	println(test.number) 에러
    test.printNumber()
}
