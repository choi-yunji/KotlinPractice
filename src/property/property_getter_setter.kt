package property

/**  프로퍼티는 실제로 값이 저장되는 공간(Filed), 저장된 값을 읽으려고 할 때 호출되는 함수(Getter)
 * 값을 저장하려고 할 때 호출되는 함수(Setter)로 이루어져 있다.
 * val 프로퍼티는 초기 값이 주어지면 더 이상 값을 변경(Set) 할 수 없다.
 * 그래서 val 프로퍼티에는 Getter 만 존재한다. val 프로퍼티의 Setter 를 정의 하려고 하면 오류가 발생한다.
 */

class Person {
    var age:Int = 0
    get() {
        return field
    }
    set(value) {
        field = if(value >= 0) value else 0
    }
}
/* 디폴트 Getter/Setter
   Getter 와 Setter 를 별도로 정의하지 않으면 다음과 같이 디폴트 Getter/Setter 가 자동으로 정의된다.
   class Person{
   var age:Int = 0
   get(){
       return field
   }
   set(value){
       field = value
   }
}
    그래서 프로퍼티의 기본동작은 프로퍼티 속 변수의 값을 단순히 읽고 쓰는 동작이 된다.
    디폴트 Getter/Setter 의 유용성
    프로퍼티에 디폴트 Getter/Setter 가 포함되어 있기 때문에 더 이상 자바처럼 Getter/Setter 를 마구 만들 필요가 없다
    단 Getter/Setter 의 동작을 커스터마이징 하고 싶다면 별도로 정의해주어야한다.
 */