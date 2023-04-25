package oop2;

public class User {
    String name;
    String from;
    String birth;

    public User(String name,String from,String birth) {
        this.name = name;
        this.from= from;
        this.birth =birth;
    }

    @Override
    public boolean equals(Object o){
        var user = (User)o;
        if(user.name.equals(this.name) && user.from.equals(this.from) && user.birth.equals(this.birth)){
            return true;
        }else {
            return false;

        }
    }

    @Override
    public String toString(){
        return ("名前："+this.name+","+"出身地："+this.from+","+"生年月日"+this.birth);
    }



}
