/* const - 변수에 접근하는 코드를 변수에 저장된 값으로 대체
   전역 변수, 오브젝트의 프로퍼티 등에 붙일 수 있으며 const 가 붙은 변수에는 리터럴로 이루어진 표현식만 저장이 가능하다.
   const 키워드가 붙은 변수는 리터럴로 대체된다.
 */
const val hello = "Hello" + " World!"

object Foo {
    const val bar = "bar"
}

fun main(args:Array<String>){
    println(hello)
    println(Foo.bar)
    println(hello)
    println(Foo.bar)
}