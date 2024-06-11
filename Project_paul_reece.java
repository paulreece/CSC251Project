import java.util.Scanner;

public class Project_paul_reece
{
   public static void main(String[] args) {
      int policy_number;
      String provider_name;
      String holder_first_name;
      String holder_last_name;
      int age;
      String smoker_status;
      double height;
      double weight;
   
      Scanner scnr = new Scanner(System.in);
   
      System.out.println("Please enter the Policy Number:");
      policy_number = scnr.nextInt();
   
      System.out.println("Please enter the Provider Name:");
      provider_name = scnr.next();
      scnr.nextLine();
   
      System.out.println("Please enter the Policyholder’s First Name:");
      holder_first_name = scnr.next();
      scnr.nextLine();
      
      System.out.println("Please enter the Policyholder’s Last Name:");
      holder_last_name = scnr.next();
      scnr.nextLine();
    
      System.out.println("Please enter the Policyholder’s Age:");
      age = scnr.nextInt();
    
      System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker):");
      smoker_status = scnr.next();
      scnr.nextLine();
    
      System.out.println("Please enter the Policyholder’s Height (in inches):");
      height = scnr.nextDouble();
    
      System.out.println("Please enter the Policyholder’s Weight (in pounds):");
      weight = scnr.nextDouble();
   
      Policy policy = new Policy(policy_number, provider_name, holder_first_name, holder_last_name, age, smoker_status, height, weight);
      
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder’s First Name: " + policy.getHolderFirst());
      System.out.println("Policyholder’s Last Name: " + policy.getHolderLast());
      System.out.println("Policyholder’s Age: " + policy.getAge());
      System.out.println("Policyholder’s Smoking Status: " + policy.getSmokeStatus());
      System.out.println("Policyholder’s Height: " + policy.getHeight()+ " inches");
      System.out.println("Policyholder’s Weight: " + policy.getWeight()+ " pounds");
      System.out.printf("Policyholder’s BMI: %,.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $ %,.2f\n",policy.getPolicyPrice());
   }
}