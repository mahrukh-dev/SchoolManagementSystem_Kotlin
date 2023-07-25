package Classes

class SMS(_name: String) {
    val school: School = School()
    val name: String = _name
        fun showMainMenu() {
            println("=== School Management System ===")
            println("1. View Students")
            println("2. View Courses")
            println("3. View Teachers")
            println("4. Enroll Student in a Course")
            println("5. Withdraw Student from a Course")
            println("6. Add Student")
            println("7. Add Teacher")
            println("8. Add Course")
            println("9. Remove Student")
            println("10. Remove Teacher")
            println("11. Remove Course")
            println("12. Exit")
            println("Please enter your choice (1-12):")
        }

        fun handleUserInput(choice: Int) {
            when (choice) {
                1 -> viewStudents()
                2 -> viewCourses()
                3 -> viewTeachers()
                4 -> enrollStudentInCourse()
                5 -> withdrawStudentFromCourse()
                6 -> addStudent()
                7 -> addTeacher()
                8 -> addCourse()
                9 -> removeStudent()
                10 -> removeTeacher()
                11 -> removeCourse()
                12 -> println("Exiting...")
                else -> println("Invalid choice. Please enter a number between 1 and 12.")
            }
        }
        private fun viewStudents() {
        }
        private fun viewCourses() {
        }
        private fun viewTeachers() {
        }
        private fun enrollStudentInCourse() {
        }

        private fun withdrawStudentFromCourse() {
        }

        private fun addStudent() {
        }

        private fun addTeacher() {
        }

        private fun addCourse() {
        }

        private fun removeStudent() {
        }

        private fun removeTeacher() {
        }

        private fun removeCourse() {
        }
    }