package kotlin_examples.design_patterns.builder

class Student private constructor(studentBuilder: StudentBuilder) {

    private var name: String?
    private var age: Int?

    init {
        this.name = studentBuilder.name
        this.age = studentBuilder.age
    }

    companion object{
        fun getBuilder() : StudentBuilder {
            return StudentBuilder()
        }
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age)"
    }

    class StudentBuilder {

        var name: String? = null
            private set
        var age: Int? = null
            private set

        fun setName(name: String): StudentBuilder {
            this.name = name
            return this
        }
        fun setAge(age: Int): StudentBuilder {
            this.age = age
            return this
        }

        fun build(): Student {
            return Student(this)
        }
    }
}
