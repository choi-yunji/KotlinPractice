/** 싱글톤 패턴을 대체하는 object 키워드
 * object 키워드 덕에 자바에서 작성해야만 했던 싱글톤 패턴 코드를 더 이상 쓰지않아도 되게 되었다.
 * 그저 일반 클래스를 선언하듯이, 프로그램 전체에서 단 하나만 존재하는 객체를 편하게 만들 수 있다.
 */
// 프로그램 전체에서 공유할 수 있는 하나뿐인 객체
object Person
{
    var name: String = ""
    var age: Int = 0
    fun print()
    {
        println(name)
        println(age)
    }
}

fun main(args: Array<String>)
{
    // 식별자 Person으로 객체에 바로 접근 가능
    Person.name = "Singleton"
    Person.age = 45
    Person.print()
}

// Person 은 타입 이름이기도 하기 때문에 다음코드도 가능하다.
// val person:Person = Person
