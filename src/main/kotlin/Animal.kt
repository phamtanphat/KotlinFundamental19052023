open class Animal {
    // 1: Thuộc tính
    var name: String = ""
        get() = "Trong function get $field"
        set(value) {
            if (value.isNotEmpty()) {
                field = value
            }
        }
    var weight: Float = 0.0f
        get() = field
        set(value) {
            if (value != 0.0f) {
                field = value
            }
        }

    constructor(name: String, weight: Float) : super() {
        this.name = name
        this.weight = weight
    }

    // 2: Phương thức
    open fun printDetailAnimal() {
        println("Name: $name")
        println("Weight: $weight")
    }
}