/*
    산술연산자(ArithmeticOperator)
    기호    사용 예     결과값
    +       a+b      a와 b를 더한 값
    -       a-b      a에서 b를 뺀 값
    *       a*b      a와 b를 곱한 값
    /       a/b      a를 b로 나눈 값
    %       a%b      a를 b로 나눈 나머지
 */



fun main(args:Array<String>): Unit {

    val num:Int = 15 - 4 * 3
    val num2:Int = 65 % 7
    //Double 타입은 실수를 저장할 수 있는 타입, Double/Int 이든 Int/Double 이든 결과타입은 항상 Double 이며
    //10.0/5 와 같이 계산 결과에 소수점이 남지 않는다 해도 무조건 결과타입은 Double 이다.
    val num3:Double = 7.5/5 + 22.25
    // num 과 num2 가 Int 타입이므로 Int 타입끼리 산술연산을 하면 무조건 Int 타입의 결과가 나오기 때문에
    // 계산 결과에 소수점이 존재한다 해도 절대 보존되지 않는다.
    val num4:Double = num/num2 + 0.7
    /*
        num4가 올바른 계산 결과가 나오도록 하려면?
        1. val num: Double = 15.0 - 4 * 3
        // Double 타입의 변수에는 Double 타입인 표현식만 저장가능하므로 리터럴 중 하나만 Double 타입으로
            만들어주면 연산이 진행되면서 자연스럽게 표현식이 Double 타입으로 수렴하게 됨
        2. val num4: Double = num.toDouble()/num2 + 0.7
        // Int 타입의 표현식뒤에 .toDouble() 을 붙이면 해당 표현식의 타입이 Double 타입으로 포장된다.
            /*
                코틀린에서 Int 타입을 Double 타입으로 변환할 때 캐스팅이 아닌 toDouble()을 사용하는 이유
                Int 와 Double 은 서로 상속관계가 아니기 떄문에 캐스팅으로 형변환을 할 수 없다.
                그래서 toDouble() 이라는 메서드를 이용해 Int 타입을 Double 타입으로 변환한다.
             */
     */

    println(num)
    println(num2)
    println(num3)
    println(num4)

}