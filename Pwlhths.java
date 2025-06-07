
public class Pwlhths{
	private String kwd;
	private String epwnymo;
	private String onoma;
	private String AFM;
	//Daneio daneio= new Daneio();
	Pwlhths(String kwd,String epwnymo,String onoma,String AFM){
		this.kwd=kwd;
		this.epwnymo=epwnymo;
		this.onoma=onoma;
		this.AFM=AFM;
		//this.daneio=daneio;
	}//kataskeyasths
	Pwlhths(){
	}//kataskeyasths
	String getkwdiko(){
		return kwd;
	}
	String getepwnymo(){
		return epwnymo;
	}
	String getonoma(){
		return onoma;
	}
	String getAFM(){
		return AFM;
	}
	public String toString(){
		return "  Kwdikos: "+kwd+"\n\t\tEpwnumo: "+epwnymo+"\n\t\tOnoma: "+onoma+"\n\t\tAFM: "+AFM;
	}
}//class pwlhtes