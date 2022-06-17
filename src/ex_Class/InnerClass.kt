package ex_Class

/* 내부 클래스(Inner Class) - 인스턴스가 바깥 클래스의 인스턴스에 완전히 소속된다.
   내부 클래스의 인스턴스를 생성하려면 바깥 클래스의 인스턴스.생성자() 를 해야한다.
   내부 클래스는 바깥 클래스의 인스턴스로부터만 생성할 수 있기 때문이다.
   this@Outer 키워드를 이용하여 자신이 속한 바깥 클래스의 인스턴스에 접근 할 수 있다.
 */

class Outer2(private val value: Int)
{
    fun print()
    {
        println(this.value)
    }

    inner class Inner(private val innerValue: Int)
    {
        fun print()
        {
            this@Outer2.print()
            println(this.innerValue + this@Outer2.value)
        }
    }
}

fun main(args: Array<String>)
{
    val instance: Outer2 = Outer2(610)
    val innerInstance: Outer2.Inner = instance.Inner(40)
    innerInstance.print()
}
