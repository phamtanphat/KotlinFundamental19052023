import demo_astraction.PizzaCheese
import demo_astraction.PizzaMeat
import demo_astraction.PizzaStore

fun main() {
    // Comment code : // => không chạy đoạn lệnh

    // 1: Khai báo biến
    // Từ khóa khai báo: var val
    // Có 2 loại biến: Immutable(val), mutable(var)
    // Cấu trúc: var tenbien = value
    // var name = "Phạm Tấn Phát"
    // val PI = 3.14

    // 2: Kiểu dữ liệu
    // Số nguyên: Int, Long (Số không có phần thập phân) => Example: -1 or 0 or 1
    // Số thực: Float, Double (Số có phần thập phân) => Example: 1.2
    // Kiểu chuỗi: String => Example: "Tèo"
    // Kiểu ký tự: Char => Example: 'a'
    // Kiểu mảng: Array
    // Kiểu đối tượng: Object
    // var age: Int = 29
    // var height: Float = 1.75f

    // 3: Toán tử
    // Biểu thức: Đoạn lệnh có giá trị trả về
    // Toán tử: + - * /
    // Toáng hạng: số
    // var number = 5
    // var number2 = number++
    // Biểu thức ++, --
    // 1: Nếu ++a
    //      Step1: Thực hiện tăng giá trị lên 1
    //      Step2: Gán giá trị vào vị trí hiện tại

    // 2: Nếu a++
    //      Step1: Gán giá trị vào vị trí hiện tại
    //      Step2: Thực hiện tăng giá trị lên 1
    // println("Number $number") // number = 6
    // println("Number2 $number2") // number2 = 5

    // 4: Câu điều kiện if else
    // var number = 5
    // var number2 = 10
    // val message = if (number > number2) {
    //    "Number lớn hơn number2"
    // } else if (number < number2) {
    //    "Number bé hơn number2"
    // } else {
    //    "Number bằng number2"
    // }

    // println(message)

    // 5: Câu điều when
    // Không cần dùng break để ngắt lệnh
    // var number = 5

    // var message = when(number) {
    //    in 1..9 -> "Là số hàng đơn vị"
    //    else -> "Không phải số hàng đơn vị"
    // }

    // 6: Mảng
    // Array
    // Tổ hợp phím gợi ý sửa lỗi: Alt + enter
    // Cách 1: Khai báo tường minh
    // val arrNames = Array(5, object : (Int) -> String {
    //    override fun invoke(p1: Int): String {
    //        return "Teo $p1"
    //     }
    // })

    // Cách 2: Dùng function arrayOf
    // val arrNames = arrayOf("Tèo", "Tí", "Tủn")
    // print(arrNames.size.toString())

    // Note: Array không thay đổi kích thước
    // Nên dùng array khi xử lý mảng đơn giản
    // Array lưu theo index (bắt đầu từ 0) và value

    // Cập nhật giá trị
    // Object like array => js
    // val arrNames = arrayOf("tèo", "Tí", "Tủn")
    // arrNames[0] = "phat"
    // print(arrNames.getOrNull(4))

    // 7: Mảng (Collection)
    // List
    // Khai báo:

    // val listName = mutableListOf<String>()
    // Thêm phần tử
    // listName.add("Tèo")
    // listName.add("Tí")
    // listName.add("Tủn")

    // Xóa phần tử
    // listName.removeAt(0)

    // Cập nhật phần tử
    // listName[0] = "Tuấn"

    // Set

    // val setNumbers = mutableSetOf<Int>()
    // setNumbers.add(1)
    // setNumbers.add(1)
    // setNumbers.add(1)

    // print(setNumbers.size)

    // Map

    // val userMaps = mutableMapOf<String, String>()
    // Thêm hoặc chỉnh sửa
    // userMaps["id"] = "1"
    // userMaps["username"] = "Teo"
    // userMaps["password"] = "123456"

    // Xóa
    // userMaps.remove("id")

    // 8: Vòng lặp for

    // a: Duyệt dữ liệu trong khoảng
    // Duyệt thuận
    // for ((index, value) in (10 until 20 step 2).withIndex()) {
    //    println("Index $index, Value $value")
    // }

    // Duyệt ngược
    // for (value in 20 downTo 1) {
    //    println(value)
    // }

    // Tạo vòng lặp 1 -> 100
    // Bài 1: In số chẳn
    // Bài 2: In số lẻ
    // Bài 3: In số chia 3 dư 1
    // Bài 4: In số chia hết cho 2 và 5

    // 9: Vòng lặp while

    // var number = 0
    // var isContinue = true
    // var numberStringNotCorrectCondition = ""
    // while (isContinue) {
    //     number = Random.nextInt(1000)
    //     if (number % 2 == 0 && number % 5 == 0) {
    //         isContinue = false
    //     } else {
    //         numberStringNotCorrectCondition += "$number , "
    //     }
    //  }
    // println(numberStringNotCorrectCondition)
    // println("Chia hết cho 2 và 5: $number")

    // val total = plus(5, 10)
    // printMessage(total.toString())

    // Bài 1: in số chẳn
    // for (element in 1..100) {
    //     if (element % 2 == 0) {
    //          print(element)
    //     }
    // }

    // Bài 2: in số lẻ
    // for (element in 1..100) {
    //     if (element % 2 == 1) {
    //         print(element)
    //     }
    // }

    // Bài 3: in số chia 3 dư 1
    // for (element in 1..100) {
    //     if (element % 3 == 1) {
    //         print(element)
    //     }
    // }

    // Bài 4: in số chính phương
    // for (element in 1..100) {
    //    if (sqrt(element.toDouble()) % 1 == 0.0) {
    //        println(element)
    //    }
    //}

    // printNumber(object : (Int) -> Boolean{
    //    override fun invoke(element: Int): Boolean {
    //        return sqrt(element.toDouble()) % 1 == 0.0
    //    }
    // })

    // Class và object
    // Khai báo object

    // val cat = Cat("Mimi", 1.2f)
    // print(cat.printDetailAnimal())
    // Validation: Kiểm tra
    // Format: định dạng
    // Tính kế thừa
    // Tính đóng gói:
    // a: Phạm vi truy cập (Access modifier)
    // b: Sử dụng getter và setter để validation cho thuộc tính
    // Tính đa hình
    // Tính trườu tượng

     val pizzaStore = PizzaStore()
     pizzaStore.orderPizza(PizzaCheese())
}

//fun printNumber(callBack: (Int) -> Boolean) {
//    for (element in 1..100) {
//        val isValidCondition = callBack(element)
//        if (isValidCondition) {
//            println(element)
//        }
//    }
//}
//
//fun printMessage(message: String) {
//    print(message)
//}
//
//fun plus(numberA: Int, numberB: Int): Int {
//    return numberA + numberB
//}


