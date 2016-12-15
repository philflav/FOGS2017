package com.fogs.phil.myswipeapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple courses view.
 */
public class CoursesFragment extends Fragment {



        public static com.fogs.phil.myswipeapplication.CoursesFragment newInstance() {
            com.fogs.phil.myswipeapplication.CoursesFragment fragment = new com.fogs.phil.myswipeapplication.CoursesFragment();
            return fragment;
        }

        public CoursesFragment(){
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.course1, container, false);

            return rootView;
        }
    }
