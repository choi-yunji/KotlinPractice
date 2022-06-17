package accessmodifier

fun main(args: Array<String>)
{
//	num = 5 // private 이기때문에 Test 파일 외부에서 접근하면 에러
    hello(15)

    val person = Person(10)
    println(person.age)
//	person.age = 20 // 에러

    println(person.isYoung)
}
