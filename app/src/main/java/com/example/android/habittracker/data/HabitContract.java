package com.example.android.habittracker.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Habit Tracker app.
 */
public final class HabitContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private HabitContract() {
    }

    /**
     * Inner class that defines constant values for the habits database table.
     * Each entry in the table represents a single habit.
     */
    public static final class HabitEntry implements BaseColumns {

        /**
         * Name of database table for habits
         */
        public final static String TABLE_NAME = "habits";

        /**
         * Unique ID number for the habit (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the habit.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_HABIT_NAME = "name";

        /**
         * The duration of the activity in minute.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_HABIT_DURATION = "duration";

        /**
         * Frequency of the habit.
         * <p>
         * The only possible values are {@link #FREQ_SINGLE_TIME} or {@link #FREQ_EVERYDAY}.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_HABIT_FREQUENCY = "frequency";


        /**
         * Possible values for the frequency of the habit.
         */
        public static final int FREQ_SINGLE_TIME = 0;
        public static final int FREQ_EVERYDAY = 1;
    }

}