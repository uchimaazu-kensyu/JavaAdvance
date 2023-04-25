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
        this.addressBooks =new AddressBook[10];
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public void displayDeviceInfo(){
        System.out.println("os:"+os);
        System.out.println("model:"+model);
    }

    public void displayMyAccount(){
        System.out.println(account.getAccountInfo());
    }

    public boolean addAddressBook(AddressBook[] tuika_addressBooks){

            this.addressBooks = tuika_addressBooks ;

            return true;



    }

    public void displayAppList(String[] apps){
        for (var e=0; e < apps.length; e++){
            System.out.println(apps[e]);
        }

    }




      }




