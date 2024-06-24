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
      int smokerCount = 0;
   
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
            
            Policy policy = new Policy(policy_number, provider_name);
            PolicyHolder policy_h = new PolicyHolder(holder_first_name, holder_last_name, age, smoker_status, height, weight);
            policy.setPolicyHolder(policy_h);
            policies.add(policy);
            
            if (inputFile.hasNext()) 
               inputFile.nextLine();
         }
         
      }
      for (Policy policy: policies) 
      {
         System.out.println(policy);
         System.out.println(policy.getPolicyHolder());
         
         if (policy.getPolicyHolder().getSmokeStatus().equalsIgnoreCase("smoker"))
         {
            smokerCount += 1;
         }
      }
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + (policies.size() - smokerCount));      
      System.out.println("The number of policy holders is: " + Policy.getPolicyCount());
   }
}