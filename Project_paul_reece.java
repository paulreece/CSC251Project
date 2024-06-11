import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;  

public class Project_paul_reece
{
   public static void main(String[] args) throws IOException

   {
      int policy_number;
      String provider_name;
      String holder_first_name;
      String holder_last_name;
      int age;
      String smoker_status;
      double height;
      double weight;
      ArrayList<Policy> policies = new ArrayList<Policy>();
   
      try (Scanner inputFile = new Scanner(new File("PolicyInformation.txt"))) 
      {
         
         while (inputFile.hasNext())
         {
            policy_number = Integer.parseInt(inputFile.nextLine());
            provider_name = inputFile.nextLine();
            holder_first_name = inputFile.nextLine();
            holder_last_name = inputFile.nextLine();
            age = Integer.parseInt(inputFile.nextLine());
            smoker_status = inputFile.nextLine();
            height = Integer.parseInt(inputFile.nextLine());
            weight = Integer.parseInt(inputFile.nextLine());
            
            Policy policy = new Policy(policy_number, provider_name, holder_first_name, holder_last_name, age, smoker_status, height, weight);
            policies.add(policy);
            
            if (inputFile.hasNext()) 
               inputFile.nextLine();
         }
         
      }
   
      // System.out.println("Please enter the Policy Number:");
//       
//    
//       System.out.println("Please enter the Provider Name:");
//       
//       scnr.nextLine();
//    
//       System.out.println("Please enter the Policyholder’s First Name:");
//       
//       scnr.nextLine();
//       
//       System.out.println("Please enter the Policyholder’s Last Name:");
//       
//       scnr.nextLine();
//     
//       System.out.println("Please enter the Policyholder’s Age:");
//       
//     
//       System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker):");
//       
//       scnr.nextLine();
//     
//       System.out.println("Please enter the Policyholder’s Height (in inches):");
//       
//     
//       System.out.println("Please enter the Policyholder’s Weight (in pounds):");
//       
//    
//       
//       
//       System.out.println("Policy Number: " + policy.getPolicyNumber());
//       System.out.println("Provider Name: " + policy.getProviderName());
//       System.out.println("Policyholder’s First Name: " + policy.getHolderFirst());
//       System.out.println("Policyholder’s Last Name: " + policy.getHolderLast());
//       System.out.println("Policyholder’s Age: " + policy.getAge());
//       System.out.println("Policyholder’s Smoking Status: " + policy.getSmokeStatus());
//       System.out.println("Policyholder’s Height: " + policy.getHeight()+ " inches");
//       System.out.println("Policyholder’s Weight: " + policy.getWeight()+ " pounds");
//       System.out.printf("Policyholder’s BMI: %,.2f\n", policy.getBMI());
//       System.out.printf("Policy Price: $ %,.2f\n",policy.getPolicyPrice());
   }
}