import java.util.*;
import java.io.*;

public class ReadFileT {
    public ArrayList <Kinhsh> products = new ArrayList<Kinhsh>();
    public void ReadFile(){
        System.out.println("Reading file TRN_LIST.txt");
        BufferedReader reader = null;
        String line;
        try{
            reader = new BufferedReader(new FileReader(new File("TRN_LIST.txt")));
            line = reader.readLine();
            line = reader.readLine();
            line = reader.readLine();
            String k="";
            float v=0.0f;
            String j="";
            boolean flagcode=false;
            while(line!=null){
                if(line.toUpperCase().trim().equals("TRN")){
                    line = reader.readLine();
                    if(line.trim().equals("{")){
                        line = reader.readLine();
                        boolean flagajia=false;
                        boolean flagj=false;
                        while(!(line.trim().startsWith("}"))){
                                if(line!=null){
                                    if(line.toUpperCase().trim().startsWith("BANKITEM_CODE")){
                                        flagcode=true;
                                        k=line.trim().substring(14).trim();
                                    }
                                    if(line.toUpperCase().trim().startsWith("VAL")){
                                        flagajia=true;
                                        v=Float.parseFloat(line.trim().substring(4).trim());

                                    }
                                    if(line.toUpperCase().trim().startsWith("JUSTIFICATION")){
                                        flagj=true;
                                        j=line.substring(15).trim();
                                    }
                                }
                                line = reader.readLine();    
                        }
                        //opoio flag exei mhnei false 8a arxikopoihsoume katallhlo paidio
                        if(flagcode==false){
                            k="000";
                        }
                        if(flagajia==false){
                            v=0f; 
                        }
                        if(flagj==false){
                            j="000";

                        }
                        Kinhsh product = new Kinhsh(v,j,k);
                        products.add(product);
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
		for (Kinhsh p:products)
			System.out.println(p);
	} // PrintList
}
