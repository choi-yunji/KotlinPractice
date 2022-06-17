fun main(args: Array<String>)
{
    val building = Building()
    building.name = "A 오피스텔"
    building.date = "2017-12-13"
    building.area = 120 * 8

    building.print() // 멤버함수는 참조변수.멤버 함수()의 형태로 호출한다.
}
/** 객체의 개념에 대해 소개할때 객체는 동작(Behavior)도 갖는다고 했었다.
 * 멤버 함수가 바로 객체의 동작 역할을 한다.
 */


