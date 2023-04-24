package opp;

public class SmartPhone {
    String model;
    String os;
    Account account;
    AddressBook[] addressBooks;
    String[] apps;


    public SmartPhone( String model, String os){
        this.model = model;
        this.os =os;
    }

    private void setAccount(Account account){
        this.account = account;
    }

    public void displayDeviceInfo(){
        System.out.println("os:"+os);
        System.out.println("model:"+model);
    }

    public void displayMyAccount(){
        System.out.println(account.getAccountInfo());
    }

    private boolean addAddressBook(AddressBook[] addressBooks){
        boolean judge =false ;
        int i =0;
        for( i =0; i<addressBooks.length-1; i++) {
            if (addressBooks[i] == null) {
                judge = true;
                break;
            }
        }

        if(judge ==true){
            this.=addressBooks ;
            return true;
      }
      }


}




}
