
public class Pwlhsh{
	//kwdiko pwlhth
	//kwdiko trapezikou proiontos
	private String aitiologia;
	private String pwlhths;
	private String proion;
	Pwlhsh(String pwl,String pro,String aitio){
		aitiologia=aitio;
		pwlhths=pwl;
		proion=pro;
	}
	Pwlhsh(){
		
	}
	String getaitiologia(){
		return aitiologia;
	}
	String getpwlhths(){
		return pwlhths;
	}
	String getproion(){
		return proion;
	}
	public String toString(){
		return "Kwdikos pwlhth: "+pwlhths+"\n\t\tKwdikos proiontos: "+proion+"\n\t\tAitilogia: "+aitiologia;
	}
}