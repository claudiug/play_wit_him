class Address {
    var name: String = ""
        get
        set(value) {
            name = value
        }
    var city: String = ""
    var state: String? = ""

}

fun Address.nameInBoo() {
    println("some cool stuff here")
}