package it.panda.chapter2.time;

import java.util.Calendar;

public class HelpDesk {

    private final Calendar calendar = Calendar.getInstance();
    public final static int EOB_HOUR = 17;

    public boolean willHandleIssue() {
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (Calendar.SUNDAY == dayOfWeek || Calendar.SATURDAY == dayOfWeek) {
            return false;
        }
        if (Calendar.FRIDAY == dayOfWeek) {
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            if (hour > EOB_HOUR) {
                return false;
            }
        }
        return true;
    }
}
