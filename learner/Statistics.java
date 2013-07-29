// class to handle the creation of statistics

public class Statistics{

    public boolean fetchStatistics(){
        userStatistics[] = "select good, fail from overall_statistics where userid"
        phraseStatistics[] = "select good, fail from word_statistics where wordid, userid"
    }
    
    public String calcPharaseStatistics(){
        overallStatistics = userStatistics[good] / (userStatistics[good] + userStatistics[bad]);
        sessionStatistics = userSessionStatistics[good] / (userSessionStatistics[good] + userSessionStatistics[bad]);    
    }
    
    public String calcUserStatistics(){
        overallStatistics = userStatistics[good] / (userStatistics[good] + userStatistics[bad]);
        sessionStatistics = userSessionStatistics[good] / (userSessionStatistics[good] + userSessionStatistics[bad]);
    }

    public boolean updateStatistics(){
        update good, fail set good = UserStatistics["good"], bad = UserStatistics["good"] where uid 
        update good, fail set good = PhraseStatistics["good"], bad = phraseStatistics["bad"] where phraseid
    }   
}
