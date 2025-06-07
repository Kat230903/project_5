
public class Kinhsh{
	//kwdikos kartas
	private float ajia;
	private String aitiologia;
	private String kwdikos;
	//private static float sum=0;
	Kinhsh(float ajia,String aitio,String kwd){
		this.ajia=ajia;
		aitiologia=aitio;
		kwdikos=kwd;
		//sum+=this.ajia;
	}
	Kinhsh(){
		
	}
	public void setkwdikos(String k){
        kwdikos=k;
    }
	public void setaitiologia(String a){
        aitiologia=a;
    }
	public void setajia(float aj){
        ajia=aj;
    }
	double getajia(){
		return ajia;
	}
	String getaitiologia(){
		return aitiologia;
	}
	String getkwdikos(){
		return kwdikos;
	}	
	public String toString(){
		return "Kwdikos kartas: "+kwdikos+"\n\t\tAjia Kinisis: "+ajia+"\n\t\tAitilogia: "+aitiologia;
	}
		
}
