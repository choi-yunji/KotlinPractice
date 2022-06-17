package ex_Class

open class Persons(val name:String, val age:Int){
    open fun print(){
        println("이름:$name")
        println("나이:$age")
    }
}

fun main(args:Array<String>){
    /** 클래스 없이 객체를 만들 떄 쓰는 object 표현식으로도 상속을 할 수 있다.
     * 객체를 만들면서 어떤 클래스를 상속하려면 클래스간에 상속하듯이 object 뒤에 : 슈퍼클래스 이름(생성자인수)를
     * 붙여주면 된다. 클래스 없이 객체를 만들면서 상속을 했으므로 이떄의 상속은 1회용이 된다.
     */
    val custom:Persons = object : Persons("Alan",23){
        override fun print(){
            println("It's a object")
        }
    }
    custom.print()
}
