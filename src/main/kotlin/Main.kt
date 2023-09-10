fun main(args: Array<String>) {

    //задача1
    val age1: Double =42.0
    val age2: Double =21.0
    //задача2
    val avg1 =(age1+age2)/2
    println("средний возраст :  $avg1")
   // при проверке результат оказался не точным (31 вместо 31.5)

    //задача3
    // для age1 и age2 пишем тип double и меняем значения на вещественные (добавляем " .0")

    //задача4
    val firstName: String= "Джонатан" //конст с именем
    val lastName: String = "Джостар"  //конст с фамилией

    //задача5
    val fullName = firstName + " "+lastName
    //составляем полное имя

    // задача6
    val myDetails: String = "Привет, меня зовут $fullName"  //создаем приветствие
    println(myDetails)

    // задача7
    val date: Triple <Int, Int, Int> = Triple(6, 9, 2023)
    // создаем конст "дата" и присваиваем ей значения 06.09.2023

    // задача8
val (month, day, year) = date
    //создаем конст "месяц", "день","год" и присваиваем значения из date
    // задача9
    println("месяц:  $month")
    println("год: $year")
    // задача10
    val newMonth = 10  //меняем месяц
    val newMonthOldYear: Pair <Int, Int> = Pair (newMonth, year)  //создаем новую дату из изм месяца и неизм года
    println("новая дата: $newMonthOldYear")
}