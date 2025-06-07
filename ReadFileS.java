import java.util.*;
import java.io.*;

public class ReadFileS {
    public ArrayList <Pwlhsh> sales = new ArrayList<Pwlhsh>();
    public void ReadFile(){
        BufferedReader reader = null;
        String line;
        try{
            reader = new BufferedReader(new FileReader(new File("SALES_LIST.txt")));
            line = reader.readLine();
            line = reader.readLine();
            line = reader.readLine();
            String pwl=""; 
			String p="";
            String a="";
            while(line!=null){
                if(line.toUpperCase().trim().equals("SALES")){
                    line = reader.readLine();
                    if(line.trim().equals("{")){
                        line = reader.readLine();
                        boolean flagpwl=false;
                        boolean flagp=false;
						boolean flaga=false;
                        while(!(line.trim().startsWith("}"))){
                                if(line!=null){
                                    if(line.toUpperCase().trim().startsWith("SALESMAN_CODE")){
                                        flagpwl=true;
                                        pwl=line.trim().substring(14).trim();
                                    }
                                    if(line.toUpperCase().trim().startsWith("BANKITEM_TYPE") ){
                                        flagp=true;
                                        p=line.trim().substring(14).trim();

                                    }
									if(line.toUpperCase().trim().startsWith("BANKITEM_CODE") ){
                                        flaga=true;
                                        a=line.trim().substring(14).trim();

                                    }
                                }
                                line = reader.readLine();    
                        }
                        //opoio flag exei mhnei false 8a arxikopoihsoume katallhlo paidio
                        if(flagpwl==false){
                            pwl="000";
                        }
                        if(flagp==false){
                            p="000"; 
                        }
                        if(flaga==false){
                            a="000";

                        }
                        Pwlhsh pwlhsh= new Pwlhsh(pwl,p,a);
                        sales.add(pwlhsh);
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
		System.out.println(sales);
		//for (Pwlhsh p:sales)
			//System.out.println(p);
	} // PrintList
}