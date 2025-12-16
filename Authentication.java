public class Authentication{
    public boolean validate(int inputid,int inputpin,UserAccount acc){
        return acc.userid==inputid && acc.pin==inputpin;
    }
}