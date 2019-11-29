package com.example.enigma.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.enigma.Activities.LaunchingActivity;
import com.example.enigma.Activities.WorkingActivity;
import com.example.enigma.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;

public class LogoutBottomSheet extends BottomSheetDialogFragment {

    MaterialButton yesButton;
    MaterialButton noButton;

    public LogoutBottomSheet() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.bottom_sheet_logout, container, false);
        initialize(rootView);

        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LaunchingActivity.class);
                startActivity(intent);
                FirebaseAuth.getInstance().signOut();
                getActivity().finish();
            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WorkingActivity.getOpenBottomSheets().CloseLogoutBottomSheet();
            }
        });
        return rootView;
    }

    private void initialize(View rootView) {
        yesButton = rootView.findViewById(R.id.yes_logout);
        noButton = rootView.findViewById(R.id.no_logout);
    }
}
