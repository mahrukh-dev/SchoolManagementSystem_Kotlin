package Classes

class Teacher(name: String, age: Int, id: Int, subj: String): Person(name, age) {
    private var _teacherId: Int = id
    var teacherId: Int
        get() {return _teacherId}
        set(value) {_teacherId = value}

    private var _subject: String = subj
    var subject: String
        get() {return _subject}
        set(value) {_subject = value}

    init{
        subject = subj
        teacherId = id
    }
}