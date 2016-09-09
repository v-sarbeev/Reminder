package ru.tinyapps.reminder.fragment;


import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.concurrent.TimeUnit;

import ru.tinyapps.reminder.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SplashFragment extends Fragment {

    public static final String TAG = "myTag";

    public SplashFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        SplashTask splashTask = new SplashTask();
        Log.d(TAG, "Splash task created");
        splashTask.execute();

        return inflater.inflate(R.layout.fragment_splash, container, false);
    }

    class SplashTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Log.d(TAG, "Start sleeping");
                TimeUnit.SECONDS.sleep(2);
                Log.d(TAG, "Stop sleeping");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (getActivity() != null) {
                Log.d(TAG, "Poping fragment stack");
                getActivity().getFragmentManager().popBackStack();
                Log.d(TAG, "Splash poped");
            }
            return null;
        }
    }
}
