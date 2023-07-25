import classes.SMS
import classes.School

fun main() {

    val school = School()
    val schoolManagementSystem = SMS(school)

    while (true) {
        schoolManagementSystem.showMainMenu()
        val choice = readlnOrNull()?.toIntOrNull() ?: continue
        if (choice == 12) break
        schoolManagementSystem.handleUserInput(choice)
    }

}