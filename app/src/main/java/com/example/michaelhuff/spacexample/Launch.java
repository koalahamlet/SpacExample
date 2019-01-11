package com.example.michaelhuff.spacexample;

public class Launch {

    int flight_number;
    String mission_name;
    String launch_year;
    Links links;

    public int getFlight_number() {
        return flight_number;
    }

    public String getMission_name() {
        return mission_name;
    }

    public String getLaunch_year() {
        return launch_year;
    }

    public Links getLinks() {
        return links;
    }

    public class Links {

        String mission_patch;

        public String getMission_patch() {
            return mission_patch;
        }
    }



}
