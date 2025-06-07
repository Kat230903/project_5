
abstract class TrapezikoProion{
    protected String code;
    protected String number;
    protected String vatnumber;
    TrapezikoProion(String code,String number,String vatnumber){
        this.code=code;
        this.number=number;
        this.vatnumber=vatnumber;
    }
    TrapezikoProion(){

    }
	abstract String getType();
    abstract double getmaxyearamount();
    abstract double getpososto();
    abstract double getamount();
    public void setcode(String c){
        code=c;
    }
    public void setnumber(String n){
        number=n;
    }
    public void setvatnumber(String vn){
        vatnumber=vn;
    }
    String getcode(){
        return code;
    }
    String getnumber(){
        return number;
    }
    String getvatnumber(){
        return vatnumber;
    }
    public String toString(){
        return "Kwdikos: "+code+"\n\t\tAri8mos: "+number+"\n\t\tAFM pelath: "+vatnumber;
    }
}