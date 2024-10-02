package ClassWork17.bank_accout.model;

public class BankAppl {
    public static void main(String[] args) {

   BankAccout accout001 = new BankAccout(101L,"Jonn Smith","Bank 1",1,100);
     accout001.display();

   //toString sam ne pechataet,nuschen sout
        System.out.println(accout001);

   BankAccout accout002 = new BankAccout(102L,"Piter Smith","Bank 1",1,0);
   accout002.display();
        System.out.println(accout002);

   BankAccout accout003 = new BankAccout(103L,"Bank 1",1,1000000);
   accout003.display();
        System.out.println(accout003);

 // vloschenie deneg
 accout001.deposit(500);
 accout001.display();

 accout002.deposit(200);
 accout002.display();
        System.out.println("----------------");

 // snimaem denigi
   accout001.withdraw(500);
   accout001.display();
   accout001.withdraw(200);
   accout001.display();
   accout001.withdraw(100);
   accout001.display();

    }//main ende

}//klass ende
