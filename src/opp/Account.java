package opp;

public class Account {
    String name;
    String tel;
    String email;
    String address;

    public Account(String name,String tel,String email,String address){
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    public String getAccountInfo(){
        return ("name："+this.name+"tel："+this.tel+"email："+this.email+"address："+this.address);

    }




}
