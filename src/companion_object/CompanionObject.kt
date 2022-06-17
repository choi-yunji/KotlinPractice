package companion_object

/** 코틀린에는 static 키워드가 더 이상 존재하지 않는다.
 * 따라서 static 의 효과를 얻고싶으면 동반자 객체를 사용해야 한다.
 */

class Person private constructor()
{
    // 동반자 객체 정의 부분
    // 동반자 객체를 정의할 때는 이름 없이 companion object 라고 적는다.
    companion object
    {
        fun create(): Person
        {
            countCreated += 1
            return Person()
        }

        var countCreated = 0
            private set
    }
}

fun main(args: Array<String>)
{
    // 동반자 객체는 자신이 속한 클래스의 이름으로 접근할 수 있다.
    // Person 이라는 식별자는 Person 클래스의 동반자 객체로 인식된다.
    val a = Person.create()
    val b = Person.create()
    println(Person.countCreated)
}

/* 동반자 객체에 접근하는 또 다른 방법
   어떤 클래스안에 동반자 객체를 정해놓으면 Companion 이라는 식별자가 자동으로 생긴다.
   따라서 Person.create() 는 Person.Companion.create() 로도 호출할 수 있다.
 */