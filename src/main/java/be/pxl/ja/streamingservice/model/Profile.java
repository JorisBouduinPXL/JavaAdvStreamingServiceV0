package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Profile {
    private String name;
    private LocalDate dateOfBirth; // nodig om te weten of content beschikbaar is of niet

    // methode geeft true als content geschikt is voor het profiel. (maturityRating en geboortedatum profiel)
    public boolean allowedToWatch(Content content){
        return content.getMaturityRating().getMinAge() <= getAge();
    }

    private int getAge() {
        if (dateOfBirth == null){
            return 0;
        }else {
            return (int) ChronoUnit.YEARS.between(dateOfBirth, LocalDateTime.now());
        }
    }
    

}
