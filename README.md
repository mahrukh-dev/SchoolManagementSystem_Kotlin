# SchoolManagementSystem_Kotlin

# Classes
1. Person
   - private var _name: String
   - var name: String
   - private var _age:Int
   - var age:Int
2. Student
   - private var _studentId: Int
   - var studentId: Int
   - private var _grade: Int
   - var grade: Int
   - private var _enrolledClass : MutableList<Course>
   - var enrolledClass : MutableList<Course>
3. Teacher
    - private var _teacherId: Int
    - var teacherId: Int
    - private var _subject: String
    - var subject: String
4. Course
    - private var _courseId: Int
    - var courseId: Int
    - private var _courseName: String
    - var courseName: String 
    - private var _teacher: Teacher
    - var teacher: Teacher
    - private var _maxCapacity: Int
    - var maxCapacity: Int
    - private var _enrolledStudents: MutableList<Student>
    - var enrolledStudents: MutableList<Student>
5. School
    - val students: MutableList<Student>
    - val courses: MutableList<Course>
    - val teachers: MutableList<Teacher>
6. SMS
    - fun showMainMenu()
    - fun handleUserInput(choice: Int)
    - private fun viewStudents()
    - private fun viewCourses()
    - private fun viewTeachers()
    - private fun enrollStudentInCourse()
    - private fun withdrawStudentFromCourse()
    - private fun addStudent()
    - private fun addTeacher()
    - private fun addCourse()
    - private fun removeStudent()
    - private fun removeTeacher()
    - private fun removeCourse()
