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

}
