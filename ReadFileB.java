import java.util.*;
import java.io.*;
public class ReadFileB {
	public ArrayList <TrapezikoProion> products = new ArrayList<TrapezikoProion>();
    public void ReadFile(){
		System.out.println("Reading file BANKITEM_LIST.txt ");
        BufferedReader reader = null;
        String line;
		try{
			reader = new BufferedReader(new FileReader(new File("BANKITEM_LIST.txt")));
            line = reader.readLine();
            line = reader.readLine();
            line = reader.readLine();
            String code="";
            String descr="";
			String vatnumber="";
			float amount=0.0f;
			float interestrate=0.0f;
			float pososto=0.0f;
			float maxamount=0.0f;
			float maxyearamount=0.0f;
			String typeproion="";
			while(line!=null){
				if(line.toUpperCase().trim().equals("BANKITEM") || line.trim().equals("bankitem")){
					line = reader.readLine();
					if(line.trim().equals("{")){
						line = reader.readLine();
						boolean flagtype=false;
						boolean flagcode=false;
						boolean flagdescr=false;
						boolean flagvatnumber=false;
						boolean flagamount=false;
						boolean flaginterestrate=false;
						boolean flagpososto=false;
						boolean flagmaxamount=false;
						boolean flagmaxyearamount=false;
						while(!(line.trim().startsWith("}"))){
							if(line!=null){
								if(line.toUpperCase().trim().startsWith("TYPE")){
									flagtype=true;
									if(line.toUpperCase().trim().substring(5).trim().equals("LOAN")){
										typeproion="LOAN";
									}else{
										typeproion="CARD";
									}
								}
								if(line.toUpperCase().trim().startsWith("AMOUNT")){
									flagamount=true;
									amount=Float.parseFloat(line.trim().substring(7).trim());
								}
								if(line.toUpperCase().trim().startsWith("INTEREST RATE")){
									flaginterestrate=true;
									interestrate=Float.parseFloat(line.trim().substring(15).trim());
								}
									
								if(line.toUpperCase().trim().startsWith("MAXIMUM AMOUNT")){
									flagmaxamount=true;
									maxamount=Float.parseFloat(line.trim().substring(15).trim());
								}
								if(line.toUpperCase().trim().startsWith("MAXIMUM YEAR AMOUNT")){
									flagmaxyearamount=true;
									maxyearamount=Float.parseFloat(line.trim().substring(20).trim());
								}
								if(line.toUpperCase().trim().startsWith("RATE")){
									flagpososto=true;
									pososto=Float.parseFloat(line.trim().substring(5).trim());
								}
									
								
								if(line.toUpperCase().trim().startsWith("CODE")){
									flagcode=true;
									code=line.trim().substring(5).trim();
								}
								if(line.toUpperCase().trim().startsWith("AFM")){
									flagvatnumber=true;
									vatnumber=line.trim().substring(4).trim();
								}
								if(line.toUpperCase().trim().startsWith("DESCR")){
									flagdescr=true;
									descr=line.trim().substring(6).trim();
								}

							}
							line = reader.readLine();	
						}
						
						if(flagtype==false&&flagcode==false&&flagdescr==false){
							System.out.println("To proion den 8a lif8ei ypoyh");
						}else{
			
							if(typeproion.equals("LOAN")){
								if(flagvatnumber==false){
									vatnumber="000";
								}
								if(flaginterestrate==false){
									interestrate=0.0f;
								}
								Daneio product = new Daneio(code,descr,vatnumber,amount,interestrate);
                        		products.add(product);
							}else{
								if(flagpososto==false){
									pososto=0.0f;
								}
								if(flagmaxamount==false){
									maxamount=0.0f;
								}
								if(flagmaxyearamount==false){
									maxyearamount=0.0f;
								}
								PistotikhKarta product=new  PistotikhKarta(code,descr,vatnumber,pososto,maxamount,maxyearamount);
								products.add(product);
							}


						}

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
		for (TrapezikoProion p:products)
			System.out.println(p);
	} 
	
}
