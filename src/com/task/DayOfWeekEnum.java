package com.task;

import java.util.Calendar;

public enum DayOfWeekEnum {
    SUNDAY(Calendar.SUNDAY),
    MONDAY(Calendar.MONDAY),
    TUESDAY(Calendar.TUESDAY),
    WEDNESDAY(Calendar.WEDNESDAY),
    THURSDAY(Calendar.THURSDAY),
    FRIDAY(Calendar.FRIDAY),
    SATURDAY(Calendar.SATURDAY);

    private int calendarDay;

    DayOfWeekEnum(int calendarDay) {
        this.calendarDay = calendarDay;
    }

    public int getCalendarDay() {
        return calendarDay;
    }

    public static DayOfWeekEnum fromString(String day) {
        try {
            return DayOfWeekEnum.valueOf(day.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
