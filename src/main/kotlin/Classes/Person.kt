package Classes

class Person {
    private var _name: String = ""
    var name: String
        get() {return _name}
        set(value) {_name = value}


    private var _age:Int=0 //backing field hold actual property data
    var age:Int //backing property is exposed
        get() {return _age}
        set(value) {_age = value}


}