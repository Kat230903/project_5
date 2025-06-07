import java.util.*;
import java.io.*;
class mainApp{
	public static void main(String [] args){
		HashMap <Integer,Pwlhths> listapwlhtwn = new HashMap <Integer,Pwlhths>();
		HashMap <Integer,TrapezikoProion> listaproiontwn = new HashMap <Integer,TrapezikoProion>();
		HashMap <Integer,Pwlhsh> listapwlhsewn = new HashMap <Integer,Pwlhsh>();
		HashMap <Integer,Kinhsh> listakinhsewn = new HashMap <Integer,Kinhsh>();
		HashMap <Integer,TrapezikoProion> listakartwn = new HashMap <Integer,TrapezikoProion>();
		HashMap <String,Double> listapromhtheiwn =new HashMap <String,Double>();
		
		// Arxikopoihseis Pwlhtwn
		Pwlhths pwlhths1= new Pwlhths("13","Palaiologou","Aikaterinh","452");
		listapwlhtwn.put(1,pwlhths1);
		Pwlhths pwlhths2=new Pwlhths("14","Berdufi","Daniela","465");
		listapwlhtwn.put(2,pwlhths2);
		Pwlhths pwlhths3=new Pwlhths("15","Ntzioka","Evaggelia","478");
		listapwlhtwn.put(3,pwlhths3);
		
		
		//Arxikopoihseis trapezikwn proiontwn
		Daneio daneio1=new Daneio("34","352","vat1",40f,0.01f);
		listaproiontwn.put(1,daneio1);
		Daneio daneio2=new Daneio("35","400","vat2",10f,0.01f);
		listaproiontwn.put(2,daneio2);
		Daneio daneio3=new Daneio("36","184","vat3",20f,0.01f);
		listaproiontwn.put(3,daneio3);
		PistotikhKarta karta1=new PistotikhKarta("37","938","vat4",0.1f,3000.0f,10000f);
		listaproiontwn.put(4,karta1);
		PistotikhKarta karta2=new PistotikhKarta("38","837","vat5",0.1f,2000.0f,50876.0f);
		listaproiontwn.put(5,karta2);
		PistotikhKarta karta3=new PistotikhKarta("39","398","vat6",0.1f,5000.0f,600002.0f);
		listaproiontwn.put(6,karta3);
		
		
		//Arxikopoihsh Pwlhsewn
		Pwlhsh pwlhsh1=new Pwlhsh("13","34","aitio1");
		listapwlhsewn.put(1,pwlhsh1);
		Pwlhsh pwlhsh2=new Pwlhsh("14","35","aitio2");
		listapwlhsewn.put(2,pwlhsh2);
		Pwlhsh pwlhsh3=new Pwlhsh("15","36","aitio3");
		listapwlhsewn.put(3,pwlhsh3);
		Pwlhsh pwlhsh4=new Pwlhsh("13","37","aitio4");
		listapwlhsewn.put(4,pwlhsh4);
		Pwlhsh pwlhsh5=new Pwlhsh("13","38","aitio5");
		listapwlhsewn.put(5,pwlhsh5);
		
		
		//Arxikopoihsh kinhsewn
		Kinhsh kinhsh1=new Kinhsh(5342f,"aitio kinhshs1","37");
		listakinhsewn.put(1,kinhsh1);
		Kinhsh kinhsh2=new Kinhsh(542f,"aitio kinhshs2","37");
		listakinhsewn.put(2,kinhsh2);
		Kinhsh kinhsh3=new Kinhsh(650f,"aitio kinshs3","37");
		listakinhsewn.put(3,kinhsh3);
		Kinhsh kinhsh4=new Kinhsh(672f,"aitio kinhshs4","37");
		listakinhsewn.put(4,kinhsh4);
		Kinhsh kinhsh5=new Kinhsh(300f,"aitio kinhshs5","38");
		listakinhsewn.put(5,kinhsh5);
		Kinhsh kinhsh6=new Kinhsh(4005f,"aitio kinhshs6","38");
		listakinhsewn.put(6,kinhsh6);
		Kinhsh kinhsh7=new Kinhsh(300f,"aitio kinhshs7","38");
		listakinhsewn.put(7,kinhsh7);
		Kinhsh kinhsh8=new Kinhsh(3009f,"aitio kinhshs8","38");
		listakinhsewn.put(8,kinhsh8);
		Kinhsh kinhsh9=new Kinhsh(1000f,"aitio kinhshs9","39");
		listakinhsewn.put(9,kinhsh9);
		Kinhsh kinhsh10=new Kinhsh(1050f,"aitio kinhshs10","39");
		listakinhsewn.put(10,kinhsh10);
		Kinhsh kinhsh11=new Kinhsh(6000f,"aitio kinhshs11","39");
		listakinhsewn.put(11,kinhsh11);
		Kinhsh kinhsh12=new Kinhsh(500f,"aitio kinhshs12","39");
		listakinhsewn.put(12,kinhsh12);
		
		
		
		//sulogh tomh gia pwlhtes
		HashMap <String,Integer> listatomh = new HashMap <String,Integer>();
		listatomh.put("452",1);
		listatomh.put("465",2);
		listatomh.put("478",3);
		Scanner input = new Scanner(System.in);

		
		//sylogh tomh gia trapezika proionta
		HashMap <String,Integer> listatomhproion = new HashMap <String,Integer>();
		listatomhproion.put("34",1);
		listatomhproion.put("35",2);
		listatomhproion.put("36",3);
		listatomhproion.put("37",4);
		listatomhproion.put("38",5);
		listatomhproion.put("39",6);
		int choice;
		int countp=3;
		int countpr=6;
		int countnew=0;
		int countkinhsh=12;
		int countpwl=5;
		ReadFileT app = new ReadFileT ();
		app.ReadFile();
		
		ReadFileB app2 = new ReadFileB ();
		app2.ReadFile();
		
		ReadFileP app3=new ReadFileP();
		app3.ReadFile();
		
		ReadFileS app4=new ReadFileS();
		app4.ReadFile();
		
		
		for(;;){
			do{
				System.out.println("1. Eisagwgh neou pvlhth");
				System.out.println("2. Eisagwgh neou trapezikou proiontos");
				System.out.println("3. Eisagwgh neas pvlhshs trapezikou proiontos");
				System.out.println("4. Eisagwgh neas kinhshs pistotikhs kartas");
				System.out.println("5. Emfanish twn daneiwn");
				System.out.println("6. Ypologismos ths promh8eias enos pvlhth");
				System.out.println("7.Emfanish twn kinhsewn pistwtikwn kartwn pou sxetizontai me enan pwlhth");
				System.out.println("8. Ypologismos promh8eias olwn twn polhtwn ths trapezas");
				System.out.println("9. Emfanish tou telikou posou promh8eias olwn twn pvlhtwn");
				System.out.println("10.Eggrafh arxeiwn");
				System.out.println("11. E3odos.");
				System.out.println("Epele3e kati apo to menou");
				choice=input.nextInt();
				switch(choice){
					case 1:
					    System.out.println("Dwse to AFM tou pwlhth.");
                        String afm=input.next();
                        if(listatomh.containsKey(afm)==true){
							System.out.println("O pwlhths uparxei hdh.");
						    System.out.println("");
                        }else{
                            System.out.println("Dwse kwdiko tou pwlhth.");
                            String kwdikos=input.next();
                            System.out.println("Dwse epwnumo tou pwlhth.");
                            String epwnumo=input.next();
                            System.out.println("Dwse onoma tou pwlhth.");
                            String onoma=input.next();
                            Pwlhths ob1= new Pwlhths(kwdikos,epwnumo,onoma,afm);
                            countp+=1;
                            listapwlhtwn.put(countp,ob1);
						    listatomh.put(afm,countp);
                        }
					    break;
					case 2:
				        System.out.println("Dwse kwdiko trapezikou proiontos.");
					    String kwdikosproion=input.next();
					    if(listatomhproion.containsKey(kwdikosproion)==true){
							System.out.println("To trapeziko proion uparxei hdh.");
						    System.out.println("");
					    }else{
							System.out.println("Epele3e eidos trapezikou proiontos daneio h pistotikh karta plhktrologontas 1 h 2 antoixa.");
						    int answer=input.nextInt();
							while(answer!=1 && answer!=2){
								System.out.println("La8os Epele3e eidos trapezikou proiontos daneio h pistotikh karta plhktrologontas 1 h 2 antoixa.");
								int a=input.nextInt();
								answer=a;
							}
						    if(answer==1){
								System.out.println("Dwse ari8mo trapezikou proiontos.");
							    String ari8mos=input.next();
							    System.out.println("Dwse afm tou pelath.");
							    String afmpelath=input.next();
							    System.out.println("Dwse to poso daneiou.");
							    float poso=input.nextFloat();
							    System.out.println("Dwse to ethsio epitokio daneiou.");
							    float epitokio=input.nextFloat();
							    Daneio ob2=new Daneio(kwdikosproion,ari8mos,afmpelath,poso,epitokio);
							    countpr+=1;
							    listaproiontwn.put(countpr,ob2);
							    listatomhproion.put(kwdikosproion,countpr);
						    }else if(answer==2){
							    System.out.println("Dwse ari8mo trapezikou proiontos.");
							    String ari8mos=input.next();
							    System.out.println("Dwse afm tou pelath.");
							    String afmpelath=input.next();
							    System.out.println("Dwse pososto promh8eias.");
							    float pososto=input.nextFloat();
							    System.out.println("Dwse megisto posokinhshs.");
							    float megposo=input.nextFloat();
							    System.out.println("Dwse megisto ethsio poso.");
							    float megethsio=input.nextFloat();
							    PistotikhKarta ob3=new PistotikhKarta(kwdikosproion,ari8mos,afmpelath,pososto,megposo,megethsio);
							    countpr+=1;
							    listaproiontwn.put(countpr,ob3);
							    listatomhproion.put(kwdikosproion,countpr);
						    }
					    }
					    break;
					case 3:
					    System.out.println("Epelexe anamesa stous pwlhtes. Dialexe to key tou pwlhth pou thes.");
                        for (int i : listapwlhtwn.keySet()) {
						    System.out.println("key: " + i + " pwlhths: " + listapwlhtwn.get(i));
					    }
                        int kp = input.nextInt();
						while(kp<=0 || kp>countp){
							System.out.println("La8os key epele3e anamesa stous pwlhtes. Dialexe to key tou pwlhth pou thes.");
							kp=input.nextInt();
						}
						String kwdikospwlhth=listapwlhtwn.get(kp).getkwdiko();
                        System.out.println("Epele3e to key anamesa sta trapezika proionta. Dialexe to key tou trapezikou proiontos pou thes.");
					    for (int i : listaproiontwn.keySet()) {
						    System.out.println("key: " + i + " proion: " + listaproiontwn.get(i));
					    }
                        int pr = input.nextInt();
						while(pr<=0 || pr>countpr){
							System.out.println("La8os epele3e to key anamesa sta trapezika proionta. Dialexe to key tou trapezikou proiontos pou thes.");
							pr=input.nextInt();
						}
						String kwdikosproiontos=listaproiontwn.get(pr).getcode();
	                    System.out.println("Dwse tin aitiologia pwlhshs.");
                        String aitiologia = input.next();
						Pwlhsh pwlhsh=new Pwlhsh(kwdikospwlhth,kwdikosproiontos,aitiologia);
						countpwl +=1;
                        listapwlhsewn.put(countpwl,pwlhsh);
				        break;
				    case 4:
					    for (int i : listaproiontwn.keySet()) {
							if (listaproiontwn.get(i).getClass().equals(karta1.getClass())){
								countnew+=1;
							    listakartwn.put(countnew,listaproiontwn.get(i));
						    }
					    }
					    for(int i: listakartwn.keySet()){
							System.out.println("key: " + i + " karta: " + listakartwn.get(i));
					    }
					    System.out.println("Epele3e mia pistotikh karta. Diale3e to key ths kartas pou thes.");
					    int an=input.nextInt();
						while(an<=0 || an>countnew){
							System.out.println("La8os epele3e mia pistotikh karta. Diale3e to key ths kartas pou thes.");
							an=input.nextInt();
						}
					    System.out.println("Dose ajia kinhshs.");
					    float poso=input.nextFloat();
					    double sumposo=0.0;
					    String cod=listakartwn.get(an).getcode();
					    for(int i :listakinhsewn.keySet()){
							if(listakartwn.get(an).getcode()==listakinhsewn.get(i).getkwdikos()){
								sumposo=sumposo+listakinhsewn.get(i).getajia();
						    }
					    }
					    if (listakartwn.get(an).getamount()<poso | sumposo>listakartwn.get(an).getmaxyearamount()){
							System.out.println("Exei ginei la8os eite h ajia einai megalhterh apo to megisto poso ths kartas eite to sunoliko poso ths kartas einai megalhtero apo to megisto ethsio poso rhs kartas.");
							break;
					    }else{
							System.out.println("Dwse aitiologia.");
						    String aitio=input.next();
						    Kinhsh ob5=new Kinhsh(poso,aitio,cod);
						    countkinhsh+=1;
						    listakinhsewn.put(countkinhsh,ob5);
					    }
				        break;
				    case 5:
				        for(int i:listaproiontwn.keySet()){
							if(listaproiontwn.get(i).getClass().equals(daneio1.getClass())){//na to ftaijv me to get class
								System.out.println(listaproiontwn.get(i));
						    }
					    }
				        break;
				    case 6:
					    System.out.println("Epele3e enan pwlhth gia ton upologismo promh8eias.");
					    for (int i : listapwlhtwn.keySet()) {
							System.out.println("key: " + i + " pwlhths: " + listapwlhtwn.get(i));
					    }
					    int ans=input.nextInt();
					    //pairnw kwdiko pwlhth
					    String k=listapwlhtwn.get(ans).getkwdiko();
					    double sumk=0.0;
					    double sum=0.0;
					    double sumtokoi=0.0;
					    for (int i : listapwlhsewn.keySet()) {
							if(listapwlhsewn.get(i).getpwlhths()==k ){
								//pairnw kwdikos proiontos
							    String kwdpr=listapwlhsewn.get(i).getproion();
							    //pairnw ay3onta ari8mo proiontos
							    int au3proion=listatomhproion.get(kwdpr);
							    if(listaproiontwn.get(au3proion).getClass().equals(daneio1.getClass())){
									sum=sum+listaproiontwn.get(au3proion).getamount();
								    sumtokoi=sumtokoi+listaproiontwn.get(au3proion).getamount()*listaproiontwn.get(au3proion).getpososto();
							    }
							    if(listaproiontwn.get(au3proion).getClass().equals(karta1.getClass()))	{
									double sumkinhsh=0.0;
								    for (int j : listakinhsewn.keySet()) {
										if(listakinhsewn.get(j).getkwdikos()==kwdpr){
											sumkinhsh=sumkinhsh+listakinhsewn.get(j).getajia();	
									    }
								    }
								    sumk=sumk+sumkinhsh*listaproiontwn.get(au3proion).getpososto();
								    System.out.printf("%s %s %s %,.2f%n","Promh8eia kartas me kwdiko",kwdpr,"einai ",sumkinhsh);
								
							    }
						    }
					    }
					    double p;
					    if (sum<=500000){
							p=sum*0.01;
					    }else if(sum<=2000000){
						    p=500000*0.01+(sum-500000)*0.02;
					    }else{
						    p=500000*0.01+1500000*0.02+(sum-2000000)*0.025;
					    }
					    if(p>sumtokoi){
						    p=sumtokoi;
					    }
					    System.out.printf("%s: %,.2f%n","Promh8eia ana pistotikh karta",sumk);
					    //emfanish posou ka8e daneiou tou pelhth jexwrista
					    for(int pwl:listapwlhsewn.keySet()){
							String kwdpr=listapwlhsewn.get(pwl).getproion();
						    int au3proion=listatomhproion.get(kwdpr);
						    if(listapwlhsewn.get(pwl).getpwlhths()==k){
								if(listaproiontwn.get(au3proion).getClass().equals(daneio1.getClass())){
									System.out.printf("%s %s %s %,.2f%n","Poso daneiou me kwdiko ",kwdpr,"einai ",listaproiontwn.get(au3proion).getamount());
							    }
						    }
					    }
					    System.out.printf("%s: %,.2f%n","Promh8eia apo ta daneia",p);
					    System.out.printf("%s: %,.2f%n","Synolikh promh8eia",p+sumk);
						listapromhtheiwn.put(k,p+sumk);
				        break;
				    case 7:
					    System.out.println("Epelexe anamesa stous pwlhtes. Dialexe to key tou pwlhth pou thes.");
                        for (int i : listapwlhtwn.keySet()) {
						    System.out.println("key: " + i + " pwlhths:" + listapwlhtwn.get(i));
					    }
                        int kp2 = input.nextInt();
						while(kp2<=0 || kp2>countp){
							System.out.println("Den yparxei pwlhths me afto to key. Epele3e jana anamesa stous pwlhtes. Dialexe to key tou pwlhth pou thes.");
							kp2=input.nextInt();
						}
						String kwdikospwlhth2=listapwlhtwn.get(kp2).getkwdiko();
						
						int kinisispwl = 0;
						for (Pwlhsh pw : listapwlhsewn.values()){
							if (pw.getpwlhths().equals(kwdikospwlhth2)){
								for (Kinhsh kin : listakinhsewn.values()){
									if (kin.getkwdikos().equals(pw.getproion())){
										System.out.println(kin);
										kinisispwl++;
									}
								}
							}
						}
						if (kinisispwl !=0){
							System.out.println("Aftes itan oles oi kinhseis twn kartwn pou sxetizontai me ton pwlhth me key " + kp2 + ".");
						} else{
							System.out.println("Den yparxoun kinhseis kartwn pou na sxetizontai me ton pwlhth me key " + kp2 + "...");
						}
				        break;
				    case 8:
					    double synoloprom=0.0;
						boolean flag;
						for(int i:listapwlhtwn.keySet()){
							flag=false;
							for(String j:listapromhtheiwn.keySet()){
								if(listapwlhtwn.get(i).getkwdiko()==j){
									flag=true;
								}
							}
							if(flag==false){
								String k1=listapwlhtwn.get(i).getkwdiko();
					            double sumk1=0.0;
					            double sum1=0.0;
					            double sumtokoi1=0.0;
					            for (int w : listapwlhsewn.keySet()) {
									if(listapwlhsewn.get(w).getpwlhths()==listapwlhtwn.get(i).getkwdiko() ){
										//pairnw kwdikos proiontos
							            String kwdpr1=listapwlhsewn.get(w).getproion();
							            //pairnw ay3onta ari8mo proiontos
							            int au3proion1=listatomhproion.get(kwdpr1);
							            if(listaproiontwn.get(au3proion1).getClass().equals(daneio1.getClass())){
											sum1=sum1+listaproiontwn.get(au3proion1).getamount();
										    sumtokoi1=sumtokoi1+listaproiontwn.get(au3proion1).getamount()*listaproiontwn.get(au3proion1).getpososto();
							            }
							            if(listaproiontwn.get(au3proion1).getClass().equals(karta1.getClass()))	{
											double sumkinhsh1=0.0;
								            for (int h : listakinhsewn.keySet()) {
												if(listakinhsewn.get(h).getkwdikos()==kwdpr1){
													sumkinhsh1=sumkinhsh1+listakinhsewn.get(h).getajia();	
									            }
								            }
								            sumk1=sumk1+sumkinhsh1*listaproiontwn.get(au3proion1).getpososto();
								        }
									}	
						        }
								double p1;
					            if (sum1<=500000){
									p1=sum1*0.01;
					            }else if(sum1<=2000000){
						            p1=500000*0.01+(sum1-500000)*0.02;
					            }else{
						            p1=500000*0.01+1500000*0.02+(sum1-2000000)*0.025;
					            }
					            if(p1>sumtokoi1){
									p1=sumtokoi1;
					            }
								listapromhtheiwn.put(listapwlhtwn.get(i).getkwdiko(),p1+sumk1);
							}
						}
						for(double i:listapromhtheiwn.values()){
							synoloprom+=i;
						}
						System.out.println("Oi promhteies olwn twn pwlhtwn ypologisthkan");
						break;
				    case 9:
					    double sumsyn=0.0;
					    if(listapromhtheiwn.size()==listapwlhtwn.size()){
							for(int i:listapwlhtwn.keySet()){
								System.out.println("Kwdikos pwlhth :"+listapwlhtwn.get(i).getkwdiko()+"\nEpwnymo pwlhth :"+listapwlhtwn.get(i).getepwnymo()+"\nOnoma pwlhth :"
							+listapwlhtwn.get(i).getonoma()+"\nPromhtheia pwlhth :"+listapromhtheiwn.get(listapwlhtwn.get(i).getkwdiko()));
							}
							for(double i:listapromhtheiwn.values()){
								sumsyn+=i;
							}
							System.out.println("Oi promhteies olwn twn pwlhtwn einai :"+sumsyn);
						}else{
							boolean flag1;
						    for(int i:listapwlhtwn.keySet()){
								flag1=false;
							    for(String j:listapromhtheiwn.keySet()){
									if(listapwlhtwn.get(i).getkwdiko()==j){
										flag1=true;
								    }
							    }
							    if(flag1==false){
									String k1=listapwlhtwn.get(i).getkwdiko();
					                double sumk1=0.0;
					                double sum1=0.0;
					                double sumtokoi1=0.0;
					                for (int w : listapwlhsewn.keySet()) {
										if(listapwlhsewn.get(w).getpwlhths()==listapwlhtwn.get(i).getkwdiko() ){
											//pairnw kwdikos proiontos
							                String kwdpr1=listapwlhsewn.get(w).getproion();
							                //pairnw ay3onta ari8mo proiontos
							                int au3proion1=listatomhproion.get(kwdpr1);
							                if(listaproiontwn.get(au3proion1).getClass().equals(daneio1.getClass())){
												sum1=sum1+listaproiontwn.get(au3proion1).getamount();
										        sumtokoi1=sumtokoi1+listaproiontwn.get(au3proion1).getamount()*listaproiontwn.get(au3proion1).getpososto();
							                }
							                if(listaproiontwn.get(au3proion1).getClass().equals(karta1.getClass()))	{
												double sumkinhsh1=0.0;
								                for (int h : listakinhsewn.keySet()) {
													if(listakinhsewn.get(h).getkwdikos()==kwdpr1){
														sumkinhsh1=sumkinhsh1+listakinhsewn.get(h).getajia();	
									                }
								                }
								                sumk1=sumk1+sumkinhsh1*listaproiontwn.get(au3proion1).getpososto();
								            }
									    }	
						            }
								    double p1;
					                if (sum1<=500000){
										p1=sum1*0.01;
					                }else if(sum1<=2000000){
						                p1=500000*0.01+(sum1-500000)*0.02;
					                }else{
						                p1=500000*0.01+1500000*0.02+(sum1-2000000)*0.025;
					                }
					                if(p1>sumtokoi1){
									    p1=sumtokoi1;
					                }
								    listapromhtheiwn.put(listapwlhtwn.get(i).getkwdiko(),p1+sumk1);
							    }
						    }
							for(int i:listapwlhtwn.keySet()){
								System.out.println("Kwdikos pwlhth :"+listapwlhtwn.get(i).getkwdiko()+"\nEpwnymo pwlhth :"+listapwlhtwn.get(i).getepwnymo()+"\nOnoma pwlhth :"
							    +listapwlhtwn.get(i).getonoma()+"\nPromhtheia pwlhth :"+listapromhtheiwn.get(listapwlhtwn.get(i).getkwdiko()));
						    }
						    for(double i:listapromhtheiwn.values()){
							    sumsyn+=i;
						    }
						    System.out.println("Oi promhteies olwn twn pwlhtwn einai :"+sumsyn);
						}						
				        break;
				    case 10:
						FileWriter writer=null;
						boolean flag2=false;
						boolean flag3=false;
						boolean flag4=false;
						boolean flag5=false;
						FileWriter writer1=null;
						FileWriter writer2=null;
						FileWriter writer3=null;
						try{
							System.out.println("Writing file BANKITEM_LIST.txt");
							writer = new FileWriter(new File("BANKITEM_LIST.txt"));
							for (TrapezikoProion product:listaproiontwn.values() )
								if (product instanceof PistotikhKarta) {
									if(flag2==false){
										flag2=true;
										writer.write("BANKITEM_LIST"+"\n"+"{"+"\n");
									}
									writer.write ("\t"+"BANKITEM "+"\n"+"\t"+"{"+"\n"+"\t"+"\t"+"TYPE "+ product.getType()
									+ "\n"+"\t"+"\t"+"CODE "+ product.getcode()
									+ "\n"+"\t"+"\t"+"DECSR "+"\""+"Card"+product.getnumber()+"\"" 
									+ "\n"+"\t"+"\t"+"AFM "	+ product.getvatnumber()
									+ "\n"+"\t"+"\t"+"maximum amount "	+ product.getamount()
									+ "\n"+"\t"+"\t"+"rate "+ product.getpososto()
									+ "\n"+"\t"+"\t"+"maximum year amount "	+ product.getmaxyearamount()
									+ "\n"+"\t"+"}"+"\n");
								}//karta
								else if (product instanceof Daneio) {
									if(flag2==false){
										flag2=true;
										writer.write("BANKITEM_LIST"+"\n"+"{"+"\n");
									}
									writer.write ("\t"+"BANKITEM "+"\n"+"\t"+"{"+"\n"+"\t"+"\t"+"TYPE "+ product.getType()
									+ "\n"+"\t"+"\t"+"CODE "+ product.getcode()
									+ "\n"+"\t"+"\t"+"DESCR "+"\""+"Daneio"+product.getnumber()+"\""
									+ "\n"+"\t"+"\t"+"AFM "	+ product.getvatnumber()
									+ "\n"+"\t"+"\t"+"amount "	+ product.getamount()
									+ "\n"+"\t"+"\t"+"interest rate "+ product.getpososto()
									+ "\n"+"\t"+"}"+"\n");
								}//daneio
							writer.write("}");
							writer.close();
						}//try
						catch(IOException e ){
							System.err.println("Problhma sto grapsimo arxeiou.");
						}
						try{
							System.out.println("Writing file SALESMAN_LIST.txt");
							writer1 = new FileWriter(new File("SALESMAN_LIST.txt"));
							for (Pwlhths sellerr:listapwlhtwn.values() ){
								if(sellerr instanceof Pwlhths){
									if(flag3==false){
										flag3=true;
										writer1.write("SALESMAN_LIST"+"\n"+"{"+"\n");
									}
									writer1.write ("\t"+"SALESMAN "+"\n"+"\t"+"{"+"\n"+"\t"+"\t"+"CODE "+ sellerr.getkwdiko()
									+ "\n"+"\t"+"\t"+"SURNAME "+"\""+ sellerr.getepwnymo()+"\""
									+ "\n"+"\t"+"\t"+"FIRSTNAME "+"\""+sellerr.getonoma()+"\"" 
									+ "\n"+"\t"+"\t"+"AFM "	+ sellerr.getAFM()
									+ "\n"+"\t"+"}"+"\n");
								}
							}
							writer1.write("}");
							writer1.close();
						}//try
						catch(IOException e ){
							System.err.println("Problhma sto grapsimo arxeiou.");
						}
						try{
							System.out.println("Writing file SALES_LIST.txt");
							writer2 = new FileWriter(new File("SALES_LIST.txt"));
							for (Pwlhsh selll:listapwlhsewn.values() ){
								if(selll instanceof Pwlhsh){
									if(flag4==false){
										flag4=true;
										writer2.write("SALES_LIST"+"\n"+"{"+"\n");
									}
									writer2.write ("\t"+"SALES "+"\n"+"\t"+"{"+"\n"+"\t"+"\t"+"SALESMAN_CODE "+ selll.getpwlhths()
									+ "\n"+"\t"+"\t"+"BANKITEM_TYPE "+ listaproiontwn.get(listatomhproion.get(selll.getproion())).getType()
									+ "\n"+"\t"+"\t"+"BANKITEM_CODE "+selll.getproion() 
									+ "\n"+"\t"+"}"+"\n");
								}
							}	
							writer2.write("}");
							writer2.close();
						}//try
						catch(IOException e ){
							System.err.println("Problhma sto grapsimo arxeiou.");
						}
						try{
							System.out.println("Writing file TRN_LIST.txt");
							writer3 = new FileWriter(new File("TRN_LIST.txt"));
							for (Kinhsh transferr:listakinhsewn.values() )
								if(transferr instanceof Kinhsh){
									if(flag5==false){
										flag5=true;
										writer3.write("TRN_LIST"+"\n"+"{"+"\n");
									}
									writer3.write ("\t"+"TRN "+"\n"+"\t"+"{"+"\n"+"\t"+"\t"+"BANKITEM_CODE "+ transferr.getkwdikos()
									+ "\n"+"\t"+"\t"+"VAL "+ transferr.getajia()
									+ "\n"+"\t"+"\t"+"JUSTIFICATION "+"\""+transferr.getaitiologia()+"\"" 
									+ "\n"+"\t"+"}"+"\n");
								}
							writer3.write("}");
							writer3.close();
						}//try
						catch(IOException e ){
							System.err.println("Problhma sto grapsimo arxeiou.");
						}
						break;
					case 11:
						break;
				}
				System.out.println("");
			}while (choice != 11);

            break;
		}
	}
}
