package com.cc.ccapps.java.lifecycle;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private String TAG = FirstFragment.class.getName();

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        Log.d(TAG, "onCreateView Called " + TAG);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach Called " + TAG);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate Called " + TAG);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated Called " + TAG);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart Called " + TAG);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume Called " + TAG);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause Called " + TAG);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop Called " + TAG);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView Called " + TAG);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy Called " + TAG);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach Called " + TAG);
    }
}
