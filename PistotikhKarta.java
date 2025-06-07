public class PistotikhKarta extends TrapezikoProion {
    private float pososto;
    private float maxamount;
    private float maxyearamount;
    PistotikhKarta(String code,String number,String vatnumber,float pososto,float maxamount,float maxyearamount){
        super(code,number,vatnumber);
        this.pososto=pososto;
        this.maxamount=maxamount;
        this.maxyearamount=maxyearamount;
    }
    PistotikhKarta(){

    }
    public void setmaxamount(float am){
        maxamount=am;
    }
    public void setmaxyearamount(float m){
        maxyearamount=m;
    }
    public void setpososto(float p){
        pososto=p;
    }
	public String getType(){
		return "Card";
	}
    public double getpososto(){
        return pososto;
    }
    public double getamount(){
        return maxamount;
    }
    public double getmaxyearamount(){
        return maxyearamount;
    }
    public String toString(){
        return super.toString()+"\n\t\tPososto: "+pososto+"\n\t\tMegisto poso: "+maxamount+"\n\t\tMegisto ethsio poso: "+maxyearamount;
    }
}
