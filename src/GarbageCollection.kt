/* 가비지 컬렉션(GarbageCollection)
   힙영역은 매우 넓어서, 객체의 위치를 기억하고 있는 참조 변수가 모두 사라져버리면
   마치 사막(힙)한가운데에 볼펜(객체)를 떨어뜨린 것과 같은 상황이 된다.
   객체는 분명 힙 영역 어딘가에 존재하지만 위치를 모르기 때문에 다시는 찾을 수 없다.
   이렇게 미아가 된 객체는 메모리 공간이 부족해질 정도까지 쌓이면 가비지 컬렉션(GarbageCollection)이라고 하는 기능에 의해 소멸한다.
 */
fun main(args: Array<String>)
{
    var result = ""
    var i = 1

    while (i <= 100)
    {
        result += "$i "
        i += 1
    }

    println(result)

}
