package time

import org.joda.time.LocalTime;

class TimeTeller {
    // LocalTime currentTime = new LocalTime();
    // System.out.println("The current local time is: " + currentTime);
    fun tellTime() : String {
        val currentTime: LocalTime = LocalTime()
        return "The current local time is: $currentTime"
    }
}