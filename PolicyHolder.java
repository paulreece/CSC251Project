public class PolicyHolder 
{
   private String holder_first_name;
   private String holder_last_name;
   private int age;
   private String smoker_status;
   private double height;
   private double weight;
   
   
   /** 
      No-argument constructor sets default values for all fields
   */
   public PolicyHolder() 
   {
      holder_first_name = "";
      holder_last_name = "";
      age = 0;
      smoker_status = "";
      height = 0.0;
      weight = 0.0;
   }
   
   /** 
      Constructor sets values based on the supplied parameter values.
      
      @param holder_first_n The policy holder's first name.
      @param holder_last_n The policy holder's last name.
      @param a The policy holder's age.
      @param smoker_st The policy holder's smoker status.
      @param ht The policy holder's height.
      @param wt The policy holder's weight.
      
   */
   
   
   public PolicyHolder(String holder_first_n, String holder_last_n, int a, String smoker_st, double ht, double wt)
   {
      
      holder_first_name = holder_first_n;
      holder_last_name = holder_last_n;
      age = a;
      smoker_status = smoker_st;
      height = ht;
      weight = wt;
      
   }
   
   public PolicyHolder(PolicyHolder policy_h)
   {
      holder_first_name = policy_h.holder_first_name;
      holder_last_name = policy_h.holder_last_name;
      age = policy_h.age;
      smoker_status = policy_h.smoker_status;
      height = policy_h.height;
      weight = policy_h.weight;
   }
   /**
      Sets the policy holder's first name.
      
      @param holder_first_n The policy holder's first name.
      @return void return.
   */
   
   public void setHolderFirst(String holder_first_n){
      holder_first_name = holder_first_n;
   }
     
   /**
      Sets the policy holder's last name.
      
      @param holder_last_n The policy holder's last name.
      @return void return.
   */
       
   public void setHolderLast(String holder_last_n){
      holder_last_name = holder_last_n;
   }
          
   /**
      Sets the policy holder's age.
      
      @param a The policy holder's age.
      @return void return.
   */
              
   public void setAge(int a){
      age = a;
   }
                  
   /**
      Sets the policy holder's smoker status.
      
      @param a The policy holder's smoker status.
      @return void return.
   */
             
   public void setSmokeStatus(String smoker_st){
      smoker_status = smoker_st;
   }
                       
   /**
      Sets the policy holder's height.
      
      @param ht The policy height.
      @return void return.
   */
                     
   public void setHeight(double ht){
      height = ht;
   }
                           
   /**
      Sets the policy holder's weight.
      
      @param wt The policy weight.
      @return void return.
   */
                      
   public void setWeight(double wt){
      weight = wt;
   }
    
   /**
      Gets the policy holder's first name.
      
      @return Returns the policy holder's first name.
   */
   
   public String getHolderFirst(){
      return holder_first_name;
   }
   
   /**
      Gets the policy holder's last name.
      
      @return Returns the policy holder's last name.
   */
       
   public String getHolderLast(){
      return holder_last_name;
   }
             
   /**
      Gets the policy holder's age.
      
      @return Returns the policy holder's age.
   */
    
   public int getAge(){
      return age;
   }
                     
   /**
      Gets the policy holder's smoker status.
      
      @return Returns the policy holder's smoker status.
   */
          
   public String getSmokeStatus(){
      return smoker_status;
   }
                          
   /**
      Gets the policy holder's height.
      
      @return Returns the policy holder's height.
   */
                  
   public double getHeight(){
      return height;
   }
                             
   /**
      Gets the policy holder's weight.
      
      @return Returns the policy holder's weight.
   */
                      
   public double getWeight(){
      return weight;
   }
   /** 
      Calculates the policy holder's BMI.
      
      @return Returns the policy holder's BMI.
   */
   
   public double getBMI() {
      double BMI = (weight * 703 ) / (height * height);
      return BMI;
   }
   
   /** 
      Calculates the policy holder's policy price.
      
      @return Returns the policy holder's policy price.
   */
      
   public double getPolicyPrice() 
   {
      double base_price = 600.0;
      if (age > 50) {
         base_price += 75.0;
      }
      
      if (smoker_status.equals("smoker")){
         base_price += 100.0;
      }
      
      double BMI = getBMI();
      
      if (BMI > 35) {
         double rateCalc = (BMI - 35) * 20;
         base_price +=  rateCalc;
      }
      
      return base_price;
   }
   
   public String toString() 
   {
      String str = "Policyholder’s First Name: " + holder_first_name +
                  "\nPolicyholder’s Last Name: " + holder_last_name +
                  "\nPolicyholder’s Age: " + age +
                  "\nPolicyholder’s Smoking Status: " + smoker_status +
                  "\nPolicyholder’s Height: " + height + " inches"  +
                  "\nPolicyholder’s Weight: " + weight + " pounds" +
                  String.format("\nPolicyholder’s BMI: %,.2f", this.getBMI()) +
                  String.format("\nPolicy Price: $%,.2f\n", this.getPolicyPrice());
      return str;
      
   }
 
}