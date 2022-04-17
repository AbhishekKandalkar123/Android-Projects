package com.akan.didyoufeelit;

public class Event {

    /** Title of the earthquake event */
    public final String title;

    /** Number of people who felt the earthquake and reported how strong it was */
    public final String numOfPeople;

    /** Perceived strength of the earthquake from the people's responses */
    public final String perceivedStrength;


    public Event(String eventTitle, String eventNumOfPeople, String eventPerceivedStrength) {
        title = eventTitle;
        numOfPeople = eventNumOfPeople;
        perceivedStrength = eventPerceivedStrength;
    }
}
