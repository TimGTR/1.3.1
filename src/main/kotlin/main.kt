fun main() {
    val x = agoToText(3500)
    print(x)
}
fun agoToText(time:Int): String {
    return when  {
        time < 61 -> "был(а) только что"
        time < 60*60 -> "был(а) $time ${agoInMinuteToText(time)} назад"
        time < 24*60*60 -> "был(а) ${time/60.toInt()} ${agoInHoursToText()} назад"
        time < 48*60*60 -> "был(а) сегодня"
        time < 24*3*60*60 -> "был(а) вчера"
        else -> "был(а) давно"
    }
}
fun agoInMinuteToText(time: Int) {
    when {
        time == 11 * 60 -> "минут"
        time * 60 % 10 == 1 -> "минуту"
        time * 60 % 10 == 2 || time * 60 % 10 == 3 || time * 60 % 10 == 4 -> "минуты"
        else -> "минут"
    }
}

fun agoInHoursToText() {

}