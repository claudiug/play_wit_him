fun main(args: Array<String>) {
    println("hello")
    println(sum(10, 90))
    println(number)
    println("number is: ${number}")
    println(whoIsBigger(10, 12))
    println(parseInt("claudiu"))
    println(getStringLen(1))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun whoIsBigger(a: Int, b: Int): Int {
    if ( a > b) {
        return a
    } else {
        return b
    }

}

val number = 10


fun parseInt(str: String): Int? = str.length

fun getStringLen(obj: Any): Int? {
    when (obj) {
        is String -> {
            return obj.length
        }
        is Int -> {
            return obj
        }
        else -> {
            return null
        }
    }
}