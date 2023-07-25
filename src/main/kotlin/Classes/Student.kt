package Classes

class Student(name: String, age: Int, id: Int, gradee: Int, classList: MutableList<Course>): Person(name, age) {
    private var _studentId: Int = id
    var studentId: Int
        get() {return _studentId}
        set(value) {_studentId = value}

    private var _grade: Int = gradee
    var grade: Int
        get() {return _grade}
        set(value) {_grade = value}

    private var _enrolledClass = classList
    var enrolledClass : MutableList<Course>
        get() {return _enrolledClass}
        set(value) {_enrolledClass = value}

    init{
        grade = gradee
        studentId = id
        enrolledClass = classList
    }
}