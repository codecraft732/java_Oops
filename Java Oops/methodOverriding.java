//method overriding means change  body same method name but value change
class Bank{
public void RateOfInterest(){
    System.out.println("bank rate of interest is 7%");
}
}
class SBI extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("SBI rate of interest is 6%");
    }
}
class PNB extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("PNB rate of interest is 2%");
    }
}
public class methodOverriding {
    public static void main(String[] args){
        Bank objBank=new Bank();
        objBank.RateOfInterest();
        SBI objSBI=new SBI();
        objSBI.RateOfInterest();
        PNB objPnb=new PNB();
        objPnb.RateOfInterest();
    }
}
