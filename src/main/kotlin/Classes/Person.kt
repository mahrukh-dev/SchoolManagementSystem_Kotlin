package Classes

open class Person(namee: String, agee: Int) {
    private var _name: String = namee
    var name: String
        get() {return _name}
        set(value) {_name = value}


    private var _age:Int = agee //backing field hold actual property data
    var age:Int //backing property is exposed
        get() {return _age}
        set(value) {_age = value}

    init{
        this.age = agee
        this.name = namee
    }

}