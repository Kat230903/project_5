import java.util.*;
import java.io.*;

public class ReadFileP {
    public ArrayList <Pwlhths> salesmen = new ArrayList<Pwlhths>();
    public void ReadFile(){
        BufferedReader reader = null;
        String line;
        try{
            reader = new BufferedReader(new FileReader(new File("SALESMAN_LIST.txt")));
            line = reader.readLine();
            line = reader.readLine();
            line = reader.readLine();
            String k=""; //kwdikos
			String s="";//surname
            String f="";//firstname
            String a="";//afm
            boolean flagcode=false;
            while(line!=null){
                if(line.toUpperCase().trim().equals("SALESMAN")){
                    line = reader.readLine();
                    if(line.trim().equals("{")){
                        line = reader.readLine();
                        boolean flagafm=false;
                        boolean flagsn=false;
						boolean flagfn=false;
                        while(!(line.trim().startsWith("}"))){
                                if(line!=null){
                                    if(line.toUpperCase().trim().startsWith("CODE")){
                                        flagcode=true;
                                        k=line.trim().substring(5).trim();
                                    }
                                    if(line.toUpperCase().trim().startsWith("SURNAME") ){
                                        flagsn=true;
                                        s=line.trim().substring(8).trim();
                                    }
									if(line.toUpperCase().trim().startsWith("FIRSTNAME") ){
                                        flagfn=true;
                                        f=line.trim().substring(10).trim();
                                    }
                                    if(line.toUpperCase().trim().startsWith("AFM")){
                                        flagafm=true;
                                        a=line.trim().substring(4).trim();
                                    }
                                }
                                line = reader.readLine();    
                        }
                        //opoio flag exei mhnei false 8a arxikopoihsoume katallhlo paidio
                        if(flagcode==false){
                            k="000";
                        }
                        if(flagsn==false){
                            s="000"; 
                        }
                        if(flagfn==false){
                            f="000";

                        }
						if(flagafm==false){
                            a="000";

                        }
                        Pwlhths pwlhths= new Pwlhths(k,s,f,a);
                        salesmen.add(pwlhths);
                    }
                }
                line = reader.readLine();  
            }
            reader.close();

        }
        catch (IOException e) {
            System.out.println	("Error reading line ...");
		}
    }
    public void PrintList (){
		System.out.println("\n >>>>>>> Printing List... \n");
		for (Pwlhths p:salesmen)
			System.out.println(p);
	} // PrintList
}