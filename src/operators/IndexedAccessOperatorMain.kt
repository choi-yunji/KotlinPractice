package operators

/** []연산자는 표현식[표현식] 형태로 적으며, 객체의 일부 값을 추출해낼때 사용한다.
 * []연산자에는 여러개의 피연산자를 지정할 수 있다.
 */
fun main(args:Array<String>){
    val person = Person("Kotlin","2016-02-15")
    println(person[0])
    println(person[1])
    println(person[-1])


    person[0] = "Java"
    println(person.name)
}