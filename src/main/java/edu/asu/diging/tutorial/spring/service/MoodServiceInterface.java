package edu.asu.diging.tutorial.spring.service;



import edu.asu.diging.tutorial.spring.domain.Mood;


public interface MoodServiceInterface {

    Mood getCurrentMood();
    
    String getReason(String mood);
    
    void postInit();

}
