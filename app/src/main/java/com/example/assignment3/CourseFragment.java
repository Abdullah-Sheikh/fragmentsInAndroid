package com.example.assignment3;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment3.models.Course;

import java.util.ArrayList;

public class CourseFragment extends Fragment {

    private LinearLayout Theme_layer ;

    private ImageView sun_moonImg;
    private View beforeImg , afterImg;
    public static final int STARTUP_DELAY = 300;
    public static final int ANIM_ITEM_DURATION = 1000;
    public static final int ITEM_DELAY = 300;
    TextView text_input_end;

    ArrayList<Course> courses = new ArrayList<>();




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        View v = inflater.inflate(R.layout.fragment_course,container,false);

        courses.add(new Course("Computer Science"));
        courses.add(new Course("Biology"));
        courses.add(new Course("Science & Arts "));
        courses.add(new Course("Physics"));
        courses.add(new Course("Mathematics"));
        courses.add(new Course("Chemistry"));


        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.courses_recyclerView);
        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        // call the constructor of CustomAdapter to send the reference and data to Adapter
        CourseAdapter customAdapter = new CourseAdapter(getContext(),courses);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView



        return v;
    }




}