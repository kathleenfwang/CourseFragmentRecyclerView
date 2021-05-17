package edu.foothill.kwang.lab7

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val TAG = "Course List Fragment"
class CourseListFragment:Fragment() {
    private lateinit var courseRecyclerView: RecyclerView
    private val courseListViewModel: CourseListViewModel by lazy {
        ViewModelProviders.of(this).get(CourseListViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"Total courses: ${courseListViewModel.courses.size}")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_course_list,container,false)
        courseRecyclerView = view.findViewById(R.id.course_recycler_view)
        courseRecyclerView.layoutManager = LinearLayoutManager(context)
        return view
    }
    companion object {
        fun newInstance(): CourseListFragment {
            return CourseListFragment()
        }
    }
}