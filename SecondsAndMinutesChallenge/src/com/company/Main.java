package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3800));
    }

    public static String getDurationString(int minutes, int seconds){
        if((minutes < 0 ) || (seconds <0 ) || (seconds > 59)){
            return "Invalid Value";
        }
        
        int totalSeconds = (minutes * 60) + seconds;
        int hours = totalSeconds / 3600;
        int displayedMinutes = minutes % 60;

        return hours + "HH " + displayedMinutes + "MM " + seconds + "SS";

    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return  "Invalid Value";
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }
}
