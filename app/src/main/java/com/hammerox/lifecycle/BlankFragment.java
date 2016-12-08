package com.hammerox.lifecycle;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    FragmentResponse callback;

    interface FragmentResponse {
        void replaceFragments();
    }

    public BlankFragment() {
        // Required empty public constructor
        log("Fragment - CONSTRUCTOR ");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callback = (FragmentResponse) context;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        log("Fragment - onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("Fragment - onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        log("Fragment - onCreateView");
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.replaceFragments();
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        log("Fragment - onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        log("Fragment - onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        log("Fragment - onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        log("Fragment - onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        log("Fragment - onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        log("Fragment - onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        log("Fragment - onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        log("Fragment - onDetach");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        log("Fragment - onSaveInstanceState");
    }



    private void log(String message) {
        Log.d("logtag", message);
    }
}
