package ru.tinyapps.reminder.adapter;

import android.app.FragmentManager;
import android.app.Fragment;
import android.support.v13.app.FragmentStatePagerAdapter;

import ru.tinyapps.reminder.fragment.CurrentTaskFragment;
import ru.tinyapps.reminder.fragment.DoneTaskFragment;

/**
 * Created by me on 08.09.16.
 */

public class TabAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public static final int CURRENT_TASK_FRAGMENT_POSITION = 0;
    public static final int DONE_TASK_FRAGMENT_POSITION = 1;

    private CurrentTaskFragment currentTaskFragment;
    private DoneTaskFragment doneTaskFragment;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
        currentTaskFragment = new CurrentTaskFragment();
        doneTaskFragment = new DoneTaskFragment();
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return currentTaskFragment;
            case 1:
                return doneTaskFragment;
            default:
                return null;
        }
    }
}
