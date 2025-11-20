
import java.time.LocalDateTime;

public class Transaction {
    private double amount;
    private  String type;
    private LocalDateTime timestapmp;

    public Transaction (double amount, String type){
        this.amount = amount;
        this.type = type;
        this.timestapmp = LocalDateTime.now();

    }
    public double getAmount() {
        return amount;
    }
    public String getType(){
        return type;
    }
    public LocalDateTime getTimeStamp(){
        return timestapmp;
    }

    @Override
    public String toString(){
        return "[" + timestapmp + "] + "+ type +" : " + amount;
    }

}
