package opp;

import recordClass.Person;

public class Main {
    public static void main(String[] args) {
        var account = new Account("azu","000","gmail","okinawa");
        System.out.println(account.getAccountInfo());

        var kakuninAddressBook = new AddressBook("アドレス確認太郎","000","gmail");
        System.out.println(kakuninAddressBook.name);

        var smartPhone = new SmartPhone("iphone","ios");
        System.out.println(smartPhone.model);

        smartPhone.setAccount(account);
        System.out.println(smartPhone.account.name);


        smartPhone.displayDeviceInfo();
        smartPhone.displayMyAccount();

        AddressBook[] address = {
                new AddressBook("yasuro","000","gmail"),
                new AddressBook("honoka","000","gmail"),
                new AddressBook("yasuro","000","gmail"),
                new AddressBook("honoka","000","gmail"),
                new AddressBook("yasuro","000","gmail")

        };


        smartPhone.addAddressBook(address);


        System.out.println(smartPhone.addressBooks[0].name);
        System.out.println();
        smartPhone.displayAppList(new String[]{"amazon", "LINE", "facebook", "Twitter", "YouTube"});

        //        System.out.println(smartPhone.addAddressBook(address)[0].name);




    }
}
