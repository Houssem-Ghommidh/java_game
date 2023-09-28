import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		int ret = 0;
		int res=0;
		int nombre3=0 ;
		System.out.println("====================================");
		System.out.println("    QUI VEUT GAGNER DES MILLIONS");
		System.out.println("====================================");
		joueur personne=new joueur(1,"tahani cherif",00);
		System.out.println(personne.toString());
		// HashMap<String,String> question=new HashMap<>();
		 ArrayList<String> reponse1=new ArrayList<String>(5);
		 ArrayList<String> reponse2=new ArrayList<String>(5);
		 ArrayList<String> reponse3=new ArrayList<String>(5);
		 ArrayList<String> reponse4=new ArrayList<String>(5);
		// question.put("qu1","test 1");
		// question.put("qu2","test 2");
		// question.put("qu3","test 3");
		// question.put("qu4","test 4");
		 reponse1.add("qu1");
		 reponse1.add("rep1");
		 reponse1.add("rep2");
		 reponse1.add("rep3");
		 reponse1.add("rep4");
		 reponse2.add("qu2");
		 reponse2.add("rep1");
		 reponse2.add("rep2");
		 reponse2.add("rep3");
		 reponse2.add("rep4");
		 reponse3.add("qu3");
		 reponse3.add("rep1");
		 reponse3.add("rep2");
		 reponse3.add("rep3");
		 reponse3.add("rep4");
		 reponse4.add("qu4");
		 reponse4.add("rep1");
		 reponse4.add("rep2");
		 reponse4.add("rep3");
		 reponse4.add("rep4");
	  for(String s:reponse1)
		 {
			 System.out.println(s);
		 }
		 System.out.print("entre votre choix :");
		 int nombre = scanner.nextInt();
		 System.out.println("confirmer pour resultat 1 ,pour modifier 2,supp 3");
		 System.out.print("entre votre choix :");
		 int nombre2 = scanner.nextInt();
		 if(nombre2==1) {
		 if(nombre==2)
		 { 	 System.out.println("reponse correct");
		      personne.setMontant(800);	
		      personne.setNiveau(2);
		      ret=1;
		  }}
		 else if(nombre2==2)
		 {
			 System.out.print("entre votre choix :");
			  nombre = scanner.nextInt(); 
			  res=1;
		 }
		
		 if(res==1) {
		 System.out.println("confirmer pour resultat 1 ,pour modifier 2,supp 3");
		 System.out.print("entre votre choix :");
		 nombre2 = scanner.nextInt();
		 if(nombre2==1) {
			 if(nombre==2)
			 { 	 System.out.println("reponse correct");
			      personne.setMontant(800);	
			      personne.setNiveau(2);
			      ret=1;
			  }}}
		 if(ret==1)
		 {	System.out.println(personne.toString());
		 System.out.println("continuer 1 non 2");
		 System.out.print("entre votre choix :");
		 nombre3=scanner.nextInt();}
		 else {System.out.println("false");}
		ret=0;
		res=0;
		 if(nombre3==2)
		 { System.out.println("gagner="+personne.getMontant());}
		 
		 //////////////////////////////////////////////////////////
		 else if(nombre3==1)
		 {	System.out.println(personne.toString());
		  for(String s:reponse2)
			 {
				 System.out.println(s);
			 }
		     System.out.print("entre votre choix :");
             nombre = scanner.nextInt();
			 System.out.println("confirmer pour resultat 1 ,pour modifier 2,supp 3");
			 System.out.print("entre votre choix :");
			  nombre2 = scanner.nextInt();
			 if(nombre2==1) {
			 if(nombre==1)
			 { 	 System.out.println("reponse correct");
			      personne.setMontant(1500);	
			      personne.setNiveau(3);
			      ret=1;
			  }}
			 else if(nombre2==2)
			 {
				 System.out.print("entre votre choix :");
				  nombre = scanner.nextInt(); 
				  res=1;
			 }
			
			 if(res==1) {
			 System.out.println("confirmer pour resultat 1 ,pour modifier 2,supp 3");
			 System.out.print("entre votre choix :");
			 nombre2 = scanner.nextInt();
			 if(nombre2==1) {
				 if(nombre==1)
				 { 	 System.out.println("reponse correct");
				      personne.setMontant(1500);	
				      personne.setNiveau(3);
				      ret=1;
				  }} }
			 
			} 
		 //////////////////
		 
	 if(ret==1)
	 {	System.out.println(personne.toString());
	 System.out.println("continuer 1 non 2");
	 System.out.print("entre votre choix :");
	 nombre3=scanner.nextInt();}
	 else
	 {System.out.println("false");}
	 //////////////
	 ret=0;
		res=0;
	 if(nombre3==2)
	 { System.out.println("gagner="+personne.getMontant());}
	 //////////////////////////////////////////////////////////
	 else if(nombre3==1)
	 {	System.out.println(personne.toString());
	  for(String s:reponse3)
		 {
			 System.out.println(s);
		 }
	     System.out.print("entre votre choix :");
         nombre = scanner.nextInt();
		 System.out.println("confirmer pour resultat 1 ,pour modifier 2,supp 3");
		 System.out.print("entre votre choix :");
		  nombre2 = scanner.nextInt();
		 if(nombre2==1) {
		 if(nombre==4)
		 { 	 System.out.println("reponse correct");
		      personne.setMontant(3000);	
		      personne.setNiveau(4);
		      ret=1;
		  }}
		 else if(nombre2==2)
		 {
			 System.out.print("entre votre choix :");
			  nombre = scanner.nextInt(); 
			  res=1;
		 }
		
		 if(res==1) {
		 System.out.println("confirmer pour resultat 1 ,pour modifier 2,supp 3");
		 System.out.print("entre votre choix :");
		 nombre2 = scanner.nextInt();
		 if(nombre2==1) {
			 if(nombre==1)
			 { 	 System.out.println("reponse correct");
			      personne.setMontant(3000);	
			      personne.setNiveau(4);
			      ret=1;
			  }} }
		 
		} 
	 
 if(ret==1)
 {	System.out.println(personne.toString());
 System.out.println("continuer 1 non 2");
 System.out.print("entre votre choix :");
 nombre3=scanner.nextInt();}
 else 
 {System.out.println("false");}
 ////////////////////
 ret=0;
	res=0;
 if(nombre3==2)
 { System.out.println("gagner="+personne.getMontant());}
 //////////////////////////////////////////////////////////
 else if(nombre3==1)
 {	System.out.println(personne.toString());
  for(String s:reponse4)
	 {
		 System.out.println(s);
	 }
     System.out.print("entre votre choix :");
     nombre = scanner.nextInt();
	 System.out.println("confirmer pour resultat 1 ,pour modifier 2,supp 3");
	 System.out.print("entre votre choix :");
	  nombre2 = scanner.nextInt();
	 if(nombre2==1) {
	 if(nombre==1)
	 { 	 System.out.println("reponse correct");
	      personne.setMontant(6000);	
	      personne.setNiveau(5);
	      ret=1;
	  }}
	 else if(nombre2==2)
	 {
		 System.out.print("entre votre choix :");
		  nombre = scanner.nextInt(); 
		  res=1;
	 }
	
	 if(res==1) {
	 System.out.println("confirmer pour resultat 1 ,pour modifier 2,supp 3");
	 System.out.print("entre votre choix :");
	 nombre2 = scanner.nextInt();
	 if(nombre2==1) {
		 if(nombre==1)
		 { 	 System.out.println("reponse correct");
		      personne.setMontant(6000);	
		      personne.setNiveau(4);
		      ret=1;
		  }} }
	 
	} 
 
if(ret==1)
{	System.out.println(personne.toString());
System.out.println("continuer 1 non 2");
System.out.print("entre votre choix :");
nombre3=scanner.nextInt();}
else 
{System.out.println("false");}
}}
