public class Daneio extends TrapezikoProion {
    private float amount;
    private float interestrate;
    Daneio(String code,String number,String vatnumber,float amount,float interestrate){
        super(code,number,vatnumber);
        this.amount=amount;
        this.interestrate=interestrate;
    }
    Daneio(){

    }
    public void setamount(float am){
        amount=am;
    }
    public void setpososto(float p){
        interestrate=p;
    }
	public String getType(){
		return "Loan";
	}
    public double getmaxyearamount(){
        return amount;
    }
    public double getamount(){
        return amount;
    }
    public double getpososto(){
        return interestrate;
    }
    public String toString(){
        return super.toString()+"\n\t\tPoso: "+amount+"\n\t\tEpitokio: "+interestrate;
    }
}
