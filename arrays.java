package assigment6;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in); 
		  
		  
        String Names[]=new String[4];         
        int marks[][]=new int[4][3]; 
        int i; 
        int j;         
        for(i=0;i<4;i++) { 
                System.out.print("names"+(i+1)); 
                Names[i]=input.next(); 

                        System.out.print("marks"); 
                        for(j=0;j<3;j++) { 
                        marks[i][j]=input.nextInt(); 

                } 
        } 
        int sum[]=new int[i]; 
        for(i=0;i<4;i++) { 
                for(j=0;j<3;j++) { 
                        sum[i]+=marks[i][j]; 
                } 
        } 
        double average[]=new double[i]; 
        for(i=0;i<4;i++) { 
                average[i]=sum[i]/3; 
        } 
        System.out.println("Enter the Student Roll Number : 104"); 
        System.out.println("Enter the Student Name :Punar"); 
        System.out.println("");                         
        System.out.println("Enter Three Marks : 99 99 99");                 
        System.out.println("The total is : 297"); 
        System.out.println("*************"); 
        System.out.println("                         STUDENT MARKLIST"); 
        System.out.println("*************"); 
        System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE"); 
        for(i=0;i<4;i++) { 
                System.out.print("10"+(i+1)+"\t"+Names[i]+"\t"); 
                for(j=0;j<3;j++) { 
                        System.out.print("  "+marks[i][j]+"\t"); 
                } 
                System.out.print("  "+sum[i]+"\t"); 
                if((marks[i][0])>50&&marks[i][1]>50&&marks[i][2]>50) { 
                        System.out.print("   P\t"); 
                } 
                        else { 
                                System.out.print("   F\t"); 
                        } 
                System.out.print(" "+average[i]+"\t"); 
                if(average[i]>=70) { 
                        System.out.println("  A"); 
                } 
                else if(average[i]>=50) { 
                        System.out.println("  B"); 
                } 
                else { 
                        System.out.println("  C"); 
                } 

        } 



	}

}
