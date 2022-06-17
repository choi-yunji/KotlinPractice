/** 패키지 이름은 가급적 소문자로 짓는 것을 추천
 * 패키지이름을 대문자로 적으면 클래스 이름과 혼동 할 수 있음
 */

package ex_package

// a와 b 중 더 큰 수를 반환하는 함수
fun max(a: Int, b: Int): Int =
    if (a > b) a else b

// a와 b 중 더 작은 수를 반환하는 함수
fun min(a: Int, b: Int): Int =
    if (a < b) a else b

// num의 절대값을 반환하는 함수
fun abs(num: Int): Int =
    if (num >= 0) num else -num
