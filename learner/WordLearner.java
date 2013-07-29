// 
// import Learner package
public static DBConnection dbConnection;
public static WindowHandler windows = new WindowHandler();

public class Learner{
    Session session;

    public static void main(String argrs[]){
        
        connectDb();

        // show window to choose user
        windows.show("login");
        
        // login with existing user
        // or create new user
        switch(buttonClicked){
            case "loginUser": login("user"); break;
            case "createUser": create("user"); break;
        }
        
        // start new session        
        this.session = new Session(user);
        windows.show("main");
        
        switch(buttonClicked){
            case "training":session.startTraining(); break;
            case "recordPhrases":session.startRecording(); break;
            case "switchUser":session.closeSession(); break;
            case "exit":exitLearner(); break;
        }                     
    }    
    
    public boolean connectDb(){
    }
    
    public boolean login("user"){
    }
    
    public boolean createUser("user"){
    }
    
    public boolean startNewSession(){
    }
    
    public void exitLearner(){
    }
    

}
