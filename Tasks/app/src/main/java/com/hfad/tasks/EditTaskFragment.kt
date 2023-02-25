package com.hfad.tasks

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hfad.tasks.R.*


class EditTaskFragment : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layout.fragment_edit_task, container, false)
        val textView = view.findViewById<TextView>(R.id.task_id)
        val taskId = EditTaskFragmentArgs.fromBundle(requireArguments()).taskId
        textView.text = taskId.toString()
        return view
    }
}