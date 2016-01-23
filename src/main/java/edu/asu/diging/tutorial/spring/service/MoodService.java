package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService {

    public Mood getCurrentMood() {

        ArrayList<String> moods = new ArrayList<String>(Arrays.asList("Happy","Sad","Tired","Lazy","Good"));
        Random random = new Random();
        int index = random.nextInt(moods.size());
        return new Mood(moods.get(index));


        /*
         * Calendar calendar = Calendar.getInstance();
        int timeOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 6) {
            return new Mood("sleepy");
        } else if(timeOfDay >= 6 && timeOfDay < 12) {
            return new Mood("energetic");
        } else if(timeOfDay >= 12 && timeOfDay < 16) {
            return new Mood("lazy");
        } else if(timeOfDay >= 16 && timeOfDay < 24) {
            return new Mood("active");
        }
            return null;
          */

    }
}
