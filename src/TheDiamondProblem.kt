/* 다이아몬드 문제
   상속관계 그림이 다이아몬드를 닮아서 다이아몬드 문제 라는 이름이 붙었다.

   interface Parent { fun follow(): Unit}
   interface Mother:Parent{
    override fun follow() = println("follow his mother")
   }

   interface Father:Parent{
    override fun follow() = println("follow his father")
   }

   class Child : Mother,Father{
     override fun follow(){
        println("A child decided to ")
        super.follow()
        }
     }

     follow 추상 멤버 함수를 갖는 Parent 인터페이스가 있고, Mother, Father 인터페이스에서
     follow 를 오버라이딩 하고 있다. Child 클래스는 Mother, Father 인터페이스를 모두 구현하고 있는데
     super.hello() 를 하면 Mother 의 follow 가 호출될지 Father 의 follow 가 호출될지 애매하다.
     코틀린은 이런 상황을 위해 원하는 인터페이스의 super 을 호출 할 수 있는 기능을 제공한다.
 */

interface Parent { fun follow(): Unit }

interface Mother : Parent
{
    override fun follow() = println("follow his mother")
}

interface Father : Parent
{
    override fun follow() = println("follow his father")
}

class Child : Mother, Father
{
    override fun follow()
    {
        println("A child decide to ")
        // <>로 호출할 super 멤버함수를 지정
        super<Mother>.follow()
    }
}

fun main(args: Array<String>)
{
    Child().follow()
}
