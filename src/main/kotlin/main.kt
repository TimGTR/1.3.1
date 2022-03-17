fun main() {

}
fun agoToText(time:Int) {
    when (time) {
        0 - 60 -> "был(а) только что"
        61 - 60*60 -> "был(а) $time ${agoInMinuteToText(time)} назад"
        60*60+1 - 24*60*60 -> "был(а) ${time/60.toInt()} ${agoInHoursToText()} назад"
        24*60*60 - 48*60*60 -> "был(а) сегодня"
        48*60*60 - 24*3*60*60 -> "был(а) вчера"
        else -> "был(а) давно"
    }
}
fun agoInMinuteToText(time: Int) {

}

fun agoInHoursToText() {

}