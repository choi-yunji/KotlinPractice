/** 멤버함수의 매개변수와 프로퍼티의 이름은 중복될 수 있다.
 * 변수 이름을 그냥 적으면 이 변수는 매개변수로 인식된다.
 */
class AAA {
    var num = 15

    fun memberFunc(num:Int){
        println(num)
        /** 변수 앞에 this. 를 붙이면 이 변수는 프로퍼티로 인식된다. **/
        println(this.num)
    }
}

fun main(args:Array<String>){
    val a = AAA()
    a.memberFunc(53)
}

