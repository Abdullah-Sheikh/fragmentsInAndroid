package com.example.assignment3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment3.Adapter.StudentAdapter;
import com.example.assignment3.models.Student;

import java.util.ArrayList;

public class StudentFragment extends  Fragment {

    ArrayList<Student> students = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_student,container,false);

        students.add(new Student("Hassan","Section A"));
        students.add(new Student("Bilal","Section A"));
        students.add(new Student("Muhammad","Section B"));
        students.add(new Student("Ayesha","Section C"));
        students.add(new Student("Ahmer","Section C"));
        students.add(new Student("Tariq","Section B"));
        students.add(new Student("Haris","Section A"));

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.students_recyclerView);
        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        // call the constructor of CustomAdapter to send the reference and data to Adapter
        StudentAdapter customAdapter = new StudentAdapter(getContext(),students);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
        return v;
    }
}

