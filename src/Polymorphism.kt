open class AA {
    open fun hello() = println("AA 입니다.")
}

class BB :AA(){
    override fun hello() = println("BB 입니다.")
}

fun main(args:Array<String>){
    val one = AA()
    val two = BB()
    // 오버라이딩 된 멤버 함수를 호출하면 참조 변수가 실제로 가리키고 있는 객체의 멤버 함수가 호출된다.
    val three:AA = two

    one.hello()
    two.hello()
    three.hello()
}

// 멤버함수를 호출하는 형태는 한가지이지만, 문맥에 따라 호출되는 함수가 다르다.