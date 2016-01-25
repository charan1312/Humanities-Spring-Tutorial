package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService implements MoodServiceInterface{
    
    private List<String> moods; 
    private List<String> reasons;
    //private Mood mood;
    private int index;
    
    public void postInit() {
        moods = new ArrayList<String>(Arrays.asList("Happy","Sad","Tired","Lazy","Good"));
        reasons = new ArrayList<String>(Arrays.asList("Caught Many Mice","Caught no Mice","Getting hard to catch a mice","Am full and sleepy","Just like that.."));
    }
    
    public Mood getCurrentMood() {
        Random random = new Random();
        this.index = random.nextInt(moods.size());
        //mood = new Mood(moods.get(index),reasons.get(index));

        return new Mood(moods.get(this.index),reasons.get(this.index));
    }
    
    public String getReason(String mood) {
        
        int index = moods.indexOf(mood);
        if (index == -1) {
            return "Please Dont Change URL Parameter..Its been Taken care";
        }
        return reasons.get(index);
    }
 
}
