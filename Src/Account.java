package bank.acc;

public abstract class Account {

int tenure;

    float principal;

    float rateOfInterest;

    public void setInterest(int age, String gender) {

             if(gender.equalsIgnoreCase("Male"))

          {

               if(age<60)

               {

                    rateOfInterest=(float) 9.8;

               }

               if(age>=60)

               {

                    rateOfInterest=10.5f;

               }

          }

          else

          {

               if(age<58)

               {

                    rateOfInterest=10.2f;

               }

               if(age>=58)

               {

                    rateOfInterest=10.8f;

               }

          }  

    }

 

    public float calculateMaturityAmount(float totalPrincipleDeposited,

               float maturityInterest) {

          return (totalPrincipleDeposited+maturityInterest);

    }

 

    public abstract float calculateInterest();

    public abstract float calculateAmountDeposited();

}

 
