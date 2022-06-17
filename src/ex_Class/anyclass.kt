package ex_Class

/* Any 클래스
   어떤 클래스가 아무 클래스도 상속하지 않으면 자동으로 any 라는 클래스를 상속한다.
   모든 코틀린 클래스들은 Any 클래스를 상속한다는 것이 보장된다.
   Any 클래스에는 세가지 멤버 함수가 있다.
   open class Any {
   // == 연산자를 오버로딩하는 멤버함수
   open operator fun equals(other: Any?):Boolean
   // </> 객체 고유의 해시코드를 반환하는 멤버함수
   open fun hashCode():Int
   // 객체의 내용을 String 타입으로 변환하는 멤버함수
   open fun toString():String
   }
 */

class Building( val name:String = "", // 건물명
                val date:String = "", // 건축일자
                val area : Int = 0)   // 면적(㎡)
{
    override fun toString() =
        "이름: ${this.name}\n" +
        "건축일자: ${this.date}\n" +
        "면적: ${this.area}㎡"
}
