public class Policy 

{
   // Fields
   private int policy_number;
   private String provider_name;
   private String holder_first_name;
   private String holder_last_name;
   private int age;
   private String smoker_status;
   private double height;
   private double weight;
   
   /** 
      No-argument constructor sets default values for all fields
   */
   
   public Policy()
   {
   
      policy_number = 0;
      provider_name = "";
      holder_first_name = "";
      holder_last_name = "";
      age = 0;
      smoker_status = "";
      height = 0.0;
      weight = 0.0;
      
   }
   
    /** 
      Constructor sets values based on the supplied parameter values.
      
      @param policy_n The policy number.
      @param provider_n The provider name.
      @param holder_first_n The policy holder's first name.
      @param holder_last_n The policy holder's last name.
      @param a The policy holder's age.
      @param smoker_st The policy holder's smoker status.
      @param ht The policy holder's height.
      @param wt The policy holder's weight.
      
   */
   
   
   public Policy(int policy_n, String provider_n, String holder_first_n, String holder_last_n, int a, String smoker_st, double ht, double wt)
   {
      
      policy_number = policy_n;
      provider_name = provider_n;
      holder_first_name = holder_first_n;
      holder_last_name = holder_last_n;
      age = a;
      smoker_status = smoker_st;
      height = ht;
      weight = wt;
      
   }
   
   /**
      Sets the policy number.
      
      @param policy_n The policy number.
      @return void return.
   */
   
   public void setPolicyNumber(int policy_n){
      policy_number = policy_n;
   }
      
   /**
      Sets the provider name.
      
      @param provider_n The provider name.
      @return void return.
   */
   
   public void setProviderName(String provider_n){
      provider_name = provider_n;
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
      Gets the policy number.
      
      @return Returns the policy number.
   */
   
   public int getPolicyNumber(){
      return policy_number;
   }
         
   /**
      Gets the provider name.
      
      @return Returns the provider name.
   */
   
   public String getProviderName(){
      return provider_name;
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
      
   public double getPolicyPrice() {
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
   
}