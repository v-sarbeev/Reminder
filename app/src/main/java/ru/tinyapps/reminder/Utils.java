package ru.tinyapps.reminder;

import java.text.SimpleDateFormat;

/**
 * Created by me on 09.09.16.
 */

public class Utils {

    public static String geetDate(long date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        return dateFormat.format(date);
    }

    public static String getTime(long time) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH.mm");
        return timeFormat.format(time);
    }
}
