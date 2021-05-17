package edu.foothill.kwang.lab7

import androidx.lifecycle.ViewModel

class CourseListViewModel :ViewModel() {
    val courses = mutableListOf<Course>()
    init {
        courses.add(Course("Intro CS", "CS", 1, 300, true))
        courses.add(Course("Intro Calculus", "MATH", 1,300 , true))
        courses.add(Course("Linear Algebra", "MATH", 20,50 ))
        courses.add(Course("Discreet Math", "MATH", 5,70 ))
        courses.add(Course("Advanced Calculus", "MATH", 10,50 ))
        courses.add(Course("Beginning Drawing", "Art", 1,100 , true))
        courses.add(Course("Intermediate Drawing", "Art", 2,50 ))
        courses.add(Course("Advanced Drawing", "Art", 3,30 ))
        courses.add(Course("Intro Sculpture", "Art", 10,100 ))
        courses.add(Course("Behavior Psychology", "PSYCH", 3,100 , true))
    }
}