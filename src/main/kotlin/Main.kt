import kotlin.random.Random

fun main(args: Array<String>) {
    var num: Int = 0

    var boo = false
    while (boo != true) {
        num = Random.nextInt(1000, 10000)
        boo = true
        var numStr: String = num.toString()

        for (i in 0 until 4) {
            for (j in 0 until 4) {
                if (i != j && numStr[i] == numStr[j]) {
                    boo = false
                }
            }
        }
    }

    var numUser: Int = 0
    var korovi = 0
    var biki = 0
    while (num != numUser) {
        numUser = readln().toInt()

        var numStr: String = num.toString()
        var numUserStr: String = numUser.toString()

        for (i in 0 until 4) {
            for (j in 0 until 4) {
                if (numUserStr[i] == numStr[j]) {
                    if (i == j) {
                        biki++
                    } else {
                        korovi++
                    }
                }
            }
        }

        if (num != numUser) {
            println("Коровы: " + korovi)
            println("Быки: " + biki)
            println()
            korovi = 0
            biki = 0
        }
    }
}