class Building {
    var name = "" //건물명
    var date = "" // 건축일자
    var area = 0 // 면적 (㎡)

    fun print() // 멤버함수(MemberFunction) - 클래스에 내장된 함수, 프로퍼티와 멤버함수를 아울러 간단히 멤버(Member)라고 부른다.
    {
        /** 각 프로퍼티 이름 앞에 this. 가 붙어있다. this 는 멤버함수가 호출될 때 , 어떤 객체로 부터 호출된 것인지를 나타내는 키워드 이다.
         * 즉, building.print() 와 같이 멤버함수를 호출하면 this 키워드는 building 참조변수가 가리키는 객체로 치환된다.
         */
        println("이름: " + this.name)
        println("건축일자: " + this.date)
        println("면적: ${this.area} ㎡")
    }
}