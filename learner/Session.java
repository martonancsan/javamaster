public class Session{
    String user;
    
    // methods for session handling
    
    // create a new session for user
    public Session(String user){
        this.user = user;            
    } 
    
    // start or resume a training course
    public boolean startTraining(){
    }
    
    // start recording words
    public boolean startRecording(){
    }
    
    // create a list of words to train with based on statistics
    // words with bad statistics come up more often
    public boolean createTrainingList(){
    }
        
    // methods for statistics
    // 
    public boolean fetchStatistics(){
    }
    
    public String calcPharaseStatistics(){
    }
    
    public String calcUserStatistics(){
    }

    public String calcPharaseOverallStatistics(){
    }
    
    public String calcUserOverallStatistics(){
    }
    
    public boolean updateStatistics(){
    }
    
    // methods for dictionary creation    
    public boolean fetchDictionary(){
    }
    
    
    public boolean recordPhrase(){
    }
    
    public boolean deletePharase(){
    }
 
    // methods used during trainings
    public boolean getNextPharase(){
    }
    
    public boolean checkCorrectness(){
    }
    
    public boolean showResult(){
    }
    
    
    
    
}
