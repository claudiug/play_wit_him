package models

open class Base() {}

data class User(val name: String, val email: String) {}

class UserInvoice(user: User) : Base() {}