fun main() {
    println(agoToText(60))
    println(agoToText(3500))
    println(agoToText(3700))
    println(agoToText(7200))
    println(agoToText(86300))
    println(agoToText(172700))
    println(agoToText(259100))

}

fun agoToText(time: Int): String {
    return when {
        time < 61 -> "был(а) только что"
        time < 60 * 60 -> "был(а) ${time / 60} ${agoInMinuteToText(time)} назад"
        time < 24 * 60 * 60 -> "был(а) ${time / 60 / 60.toInt()} ${agoInHoursToText(time)} назад"
        time < 48 * 60 * 60 -> "был(а) сегодня"
        time < 24 * 3 * 60 * 60 -> "был(а) вчера"
        else -> "был(а) давно"
    }
}

fun agoInMinuteToText(time: Int): String {
    return when {
        time == 11 * 60 -> "минут"
        time * 60 % 10 == 1 -> "минуту"
        time * 60 % 10 == 2 || time * 60 % 10 == 3 || time * 60 % 10 == 4 -> "минуты"
        else -> "минут"
    }
}

fun agoInHoursToText(time: Int): String {
    return when {
        time == 60 * 60 * 11 -> "час"
        time / 60 / 60 % 10 == 1 -> "час"
        time / 60 / 60 % 10 == 2 || time / 60 / 60 % 10 == 3 || time / 60 / 60 % 10 == 4 -> "часа"
        else -> "часов"

    }
}