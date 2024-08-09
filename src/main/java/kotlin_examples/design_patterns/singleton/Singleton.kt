package kotlin_examples.design_patterns.singleton

fun main(){
    val student1 = Student.getInstance()
    val student2 = Student.getInstance()
    println(student1 == student2)
}