package kotlin_examples.design_patterns.singleton

class Student private constructor() {

    companion object {
        @Volatile
        private var instance: Student? = null

        fun getInstance() = instance ?: synchronized(this) {
                instance ?: Student().also { instance = it }
            }

    }

}