import kotlin_examples.design_patterns.builder.Student

fun main(){
    val studentBuilder: Student.StudentBuilder = Student.getBuilder();
    val student1 = studentBuilder.setName("Nikhil 1").setAge(27).build()
    val student2 = studentBuilder.setName("Nikhil 2").setAge(28).build()
    println(student1)
    println(student2)
}