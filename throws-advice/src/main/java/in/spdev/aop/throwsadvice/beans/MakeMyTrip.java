package in.spdev.aop.throwsadvice.beans;

public class MakeMyTrip {
    public String bookTicket(String randomNumber){
        if(randomNumber.length() > 15){
            return "ok we will give u an update";
        }else{
            throw new RuntimeException("nah!!");
        }
    }
}
