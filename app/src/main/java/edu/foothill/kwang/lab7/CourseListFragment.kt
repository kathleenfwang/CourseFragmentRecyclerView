package edu.foothill.kwang.lab7

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

private const val TAG = "Course List Fragment"
class CourseListFragment:Fragment() {
    private val courseListViewModel: CourseListViewModel by lazy {
        ViewModelProviders.of(this).get(CourseListViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"Total courses: ${courseListViewModel.courses.size}")
    }
    companion object {
        fun newInstance(): CourseListFragment {
            return CourseListFragment()
        }
    }
}