package com.example.enigma.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.enigma.Activities.WorkingActivity;
import com.example.enigma.R;

public class ScrollablePofileFragment extends Fragment {

    private ImageView hamburger;

    public ScrollablePofileFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_scrollable_profile, container, false);

        initializeViews(rootView);

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WorkingActivity.getOpenDrawerFragments().OpenDrawer();
            }
        });
        return rootView;
    }

    private void initializeViews(View rootView) {
        hamburger = (ImageView)rootView.findViewById(R.id.profile_hamburger);
    }


}
