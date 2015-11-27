import java.util.*

open class Invoice(val price: Int) {

    private var _date: Date = Date()
    var date: Date
        get() = _date
        set(value) {
            _date = value
        }

    constructor(price: Int, date: Date) : this(price) {
        this.date = date
    }

}