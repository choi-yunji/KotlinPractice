/*
    /** Prints the given [message] and the line separator to the standard output stream. */
    @kotlin.internal.InlineOnly
    public actual inline fun println(message: Any?) {
        System.out.println(message)
    }

    /** Prints the given [message] and the line separator to the standard output stream. */
    @kotlin.internal.InlineOnly
    public inline fun println(message: Int) {
        System.out.println(message)
    }

    매개변수 타입만 다를뿐 함수의 이름은 모두 println 인 것을 확인할 수 있다.
    코틀린에서는 함수 시그니처가 다르기만 하면  함수이름의 중복을 허용한다.
    이렇게 이름이 같은 함수를 여러개 선언하는 것을 함수 오버로딩이라고 한다.
 */

/* 시그니처
    함수 시그니처(Function Signature)란 함수의 고유한 특징을 나타내는것으로, 매개변수의 개수와 타입,
    반환타입에 대한 정보를 뜻한다.

 */








