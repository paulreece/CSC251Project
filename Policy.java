public class Policy 

{
   // Fields
   private int policy_number;
   private String provider_name;
   
   
   /** 
      No-argument constructor sets default values for all fields
   */
   
   public Policy()
   {
   
      policy_number = 0;
      provider_name = "";
      
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
   
   public String toString() 
   {
      String str = "Policy Number: " + policy.getPolicyNumber()) +
                  "\nProvider Name: " + policy.getProviderName()) + "\n";
   }
   
}