package operators

import Building
/*  Nullable 한 참조 변수의 프로퍼티와 멤버함수에 접근하려면 . 대신 ?.연산자를 반드시 사용해야한다.
    ?.은 null 값에 안전한 연산자
    참조변수?.프로퍼티
    참조변수가 null 이면 참조변수?.프로퍼티 표현식이 null 값을 갖게 된다.
    멤버함수의 경우 참조변수가 null 일 때 멤버함수를 호출하지 않으며, 참조 변수?.멤버함수() 표현식은 null 이 된다.
    참조 변수?.멤버 함수()
 */

fun main(args:Array<String>){
    var obj:Building? = null
    obj?.print()
    obj?.name = "건물"

    obj = Building()
    obj?.name = "서울월드컵경기장"
    obj.date = "2001년 11월 10일"
    obj.area = 21_6712
    obj?.print()
}
