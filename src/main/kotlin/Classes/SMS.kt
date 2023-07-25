package Classes

class SMS(var school: School) {
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
            println("=== List of Students ===")
            for (student in school.students) {
                println("Name: ${student.name}, Age: ${student.age}, Student ID: ${student.studentId}, Grade: ${student.grade}")
            }
        }
        private fun viewCourses() {
            println("=== List of Courses ===")
            for (course in school.courses) {
                println("CourseID: ${course.courseId}, CourseName: ${course.courseName}, Course Teacher: ${course.teacher.teacherId}, Max: ${course.maxCapacity}")
                println("List of enrolled students")
                for (std in course.enrolledStudents){
                    println("Name: ${std.name}, Age: ${std.age}, Student ID: ${std.studentId}, Grade: ${std.grade}")
                }
            }
        }
        private fun viewTeachers() {
            println("=== List of Teachers ===")
            for (teacher in school.teachers) {
                println("TeacherID: ${teacher.teacherId}, Teacher Name: ${teacher.name}, Age: ${teacher.age}, Subject: ${teacher.subject}")
            }
        }
        private fun enrollStudentInCourse() {
            println("Enter Student ID:")
            val studentId = readLine()?.toInt() ?: return
            val student = school.students.find { it.studentId == studentId }

            println("Enter Course ID:")
            val courseId = readLine()?.toInt() ?: return
            val course = school.courses.find { it.courseId == courseId }

            if (student != null && course != null) {
                if (course.enrolledStudents.size < course.maxCapacity) {
                    course.enrolledStudents.add(student)
                    student.enrolledClass.add(course)
                    println("Enrollment successful.")
                } else {
                    println("Course is full. Enrollment failed.")
                }
            } else {
                println("Invalid Student ID or Course ID.")
            }
        }

        private fun withdrawStudentFromCourse() {
            println("Enter Student ID:")
            val studentId = readLine()?.toInt() ?: return
            val student = school.students.find { it.studentId == studentId }

            println("Enter Course ID:")
            val courseId = readLine()?.toInt() ?: return
            val course = school.courses.find { it.courseId == courseId }

            if (student != null && course != null) {
                if (course.enrolledStudents.size < course.maxCapacity) {
                    course.enrolledStudents.remove(student)
                    student.enrolledClass.remove(course)
                    println("Withdraw successful.")
                } else {
                    println("Withdraw failed.")
                }
            } else {
                println("Invalid Student ID or Course ID.")
            }
        }

        private fun addStudent() {
            println("Enter Student ID:")
            val id = readLine()?.toIntOrNull()
            println("Enter Student Name:")
            val name = readLine()?.toString()
            println("Enter Student Age:")
            val age = readLine()?.toIntOrNull()
            println("Enter Student Grade:")
            val grade = readLine()?.toIntOrNull()

            if (name == null || age == null || id == null || grade == null) {
                println("Addition unsuccessful")
            } else {
                val courseList = mutableListOf<Course>()
                val student = Student(name, age, id, grade, courseList)
                school.students.add(student)
                println("Student added successfully.")
            }
        }

        private fun addTeacher() {
            println("Enter Teacher ID:")
            val id = readLine()?.toIntOrNull()
            println("Enter Teacher Name:")
            val name = readLine()?.toString()
            println("Enter Teacher Age:")
            val age = readLine()?.toIntOrNull()
            println("Enter Subject:")
            val subject = readLine()?.toString()

            if (name == null || age == null || id == null || subject == null) {
                println("Addition unsuccessful")
            } else {
                val teacher = Teacher(name, age, id, subject)
                school.teachers.add(teacher)
                println("Teacher added successfully.")
            }
        }

        private fun addCourse() {
            println("Enter Course ID:")
            val id = readLine()?.toIntOrNull()
            println("Enter Course Name:")
            val cname = readLine()?.toString()
            println("Enter Teacher ID:")
            val tid = readLine()?.toIntOrNull()
            var teacher: Teacher? = school.teachers.find { it.teacherId == tid }
            println("Enter Max Capacity:")
            val max = readLine()?.toIntOrNull()

            if (id == null || cname == null || teacher == null || max == null) {
                println("Addition unsuccessful")
            } else {
                val stdList = mutableListOf<Student>()
                val course = Course(id, cname, teacher, max, stdList)
                school.courses.add(course)
                println("Course added successfully.")
            }
        }

        private fun removeStudent() {

            println("Enter Student ID to remove:")
            val studentId = readLine()?.toInt() ?: return
            val student = school.students.find { it.studentId == studentId }

            if (student != null) {
                school.students.remove(student)
                student.enrolledClass.forEach { it.enrolledStudents.remove(student) }
                println("Student removed successfully.")
            } else {
                println("Student with given ID not found.")
            }
        }

        private fun removeTeacher() {
            println("Enter Teacher ID to remove:")
            val teacherId = readLine()?.toInt() ?: return
            val teacher = school.teachers.find { it.teacherId == teacherId }

            if (teacher != null) {
                school.teachers.remove(teacher)
                println("Teacher removed successfully.")
            } else {
                println("Teacher with given ID not found.")
            }
        }

        private fun removeCourse() {
            println("Enter Course ID to remove:")
            val courseId = readLine()?.toInt() ?: return
            val course = school.courses.find { it.courseId == courseId }

            if (course != null) {
                school.courses.remove(course)
                course.enrolledStudents.forEach { it.enrolledClass.remove(course)}
                println("Course removed successfully.")
            } else {
                println("Course with given ID not found.")
            }
        }
    }