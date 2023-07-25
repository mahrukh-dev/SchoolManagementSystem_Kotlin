package Classes

class Course(id:Int, cname: String, cTeacher: Teacher, max:  Int, std: MutableList<Student>) {

    private var _courseId: Int = id
    var courseId: Int
        get() {return _courseId}
        set(value) {_courseId = value}

    private var _courseName: String = cname
    var courseName: String
        get() {return _courseName}
        set(value) {_courseName = value}

    private var _teacher: Teacher = cTeacher
    var teacher: Teacher
        get() {return _teacher}
        set(value) {_teacher = value}

    private var _maxCapacity: Int = max
    var maxCapacity: Int
        get() {return _maxCapacity}
        set(value) {_maxCapacity = value}

    private var _enrolledStudents: MutableList<Student> = std
    var enrolledStudents: MutableList<Student>
        get() {return _enrolledStudents}
        set(value) {_enrolledStudents = value}
}