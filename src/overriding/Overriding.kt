/* 슈퍼클래스의 멤버 함수와 시그니처가 동일한 멤버 함수를 서브클래스에서 선언하면,
   슈퍼클래스 멤버 함수의 동작을 덮어쓰기 할 수 있다. 이것을 오버라이딩(Overriding)이라고 한다.
 */
open class AAAA {
    open fun func() = println("AAA")
}

class BBB:AAAA() {
    /** 자바에서는 오버라이딩시 @Overriding 어노테이션을 붙이는 것이 옵션이였지만
     * 코틀린에서는 override 함수를 반드시 붙여야 한다.
     * override 키워드가 강제이므로 멤버 함수를 제대로 오버라이딩하지 않을 시 오류로 알려주기때문에
     * 훨씬 안전한 코드를 작성할 수 있게 되었다.
     */
    override fun func(){
        super.func()
        println("BBB")
    }
}

fun main(args:Array<String>){
    AAAA().func()
    BBB().func()
}

/* final 키워드
   override 키워드는 그 자체로 open 키워드가 포함되어 있다.
   override 된 멤버함수는 서브클래스에서 몇번이고 재 오버라이딩이 가능하다.
   멤버함수의 재 오버라이딩을 막으려면 final 키워드를 붙여야 한다.
 */