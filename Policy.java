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
      Constructor sets default values for all fields with arguments.
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
   
   // Set methods for fields
   
   public void setPolicyNumber(int policy_n){
      policy_number = policy_n;
   }
      
   public void setProviderName(String provider_n){
      provider_name = provider_n;
   }
      
   public void setHolderFirst(String holder_first_n){
      holder_first_name = holder_first_n;
   }
         
   public void setHolderLast(String holder_last_n){
      holder_last_name = holder_last_n;
   }
            
   public void setAge(int a){
      age = a;
   }
               
   public void setSmokeStatus(String smoker_st){
      smoker_status = smoker_st;
   }
                  
   public void setHeight(double ht){
      height = ht;
   }
                     
   public void setWeight(double wt){
      weight = wt;
   }
   
   // get methods for fields
      
   public int getPolicyNumber(){
      return policy_number;
   }
      
   public String getProviderName(){
      return provider_name;
   }
      
   public String getHolderFirst(){
      return holder_first_name;
   }
         
   public String getHolderLast(){
      return holder_last_name;
   }
            
   public int getAge(){
      return age;
   }
               
   public String getSmokeStatus(){
      return smoker_status;
   }
                  
   public double getHeight(){
      return height;
   }
                     
   public double getWeight(){
      return weight;
   }
   
   // Calculate holder's BMI
   
   public double getBMI() {
      double BMI = (weight * 703 ) / (height * height);
      return BMI;
   }
   
   // Calculate holder's policy price
      
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