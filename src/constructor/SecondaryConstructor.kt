package constructor

/** 생성자는 여러 개를 둘 수 있다. 기본적인 문법은 다음과 같다.
 * 주생성자
 * class 클래스 이름 constructor(매개변수){
 *  보조생성자1
 *  constructor(매개변수):this(인수)
 *  {
 *  ...
 *  }
 *  보조생성자2
 *  constructor(매개변수):this(인수)
 *  {
 * ...
 *  }
 *  ....
 * }
 * **/
// 클래스 이름 옆에 오는 생성자는 주 생성자(Primary Constructor)
class Time(val second:Int){
    init {
        println("init 블록 실행중")
    }
    // 보조 생성자 1
    // 만약 클래스에 주 생성자가 존재한다면, 주 생성자를 반드시 먼저 호출해주어야 한다.
    // this(인수)는 이 클래스가 포함된 또 다른 생성자를 호출하는 문법이다.
    constructor(minute: Int, second: Int) : this(minute * 60 + second)
    {
        println("보조 생성자 1 실행 중")
    }

    // 보조 생성자 2
    constructor(hour: Int, minute: Int, second: Int) : this(hour * 60 + minute, second)
    {
        println("보조 생성자 2 실행 중")
    }

    init
    {
        println("또 다른 init 블록 실행 중")
    }
}

fun main(args: Array<String>)
{
    println("${Time(15, 6).second} 초")
    println("${Time(6, 3, 17).second} 초")
}

