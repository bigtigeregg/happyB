package jy.happybirthdayto;

import java.util.Date;

/**
 * Created by wuyue on 9/14/15.
 */
public class PersonInfo {
    public String personname;
    public int age;
    public Date birthday;
    public String gender;
    public String note;
    public String password;
    public String paypalinfo;
    public PersonInfo(String personname, Date birthday, String password, String paypalinfo){
        this.personname = personname;
        this.birthday = birthday;
        this.password = password;
        this.paypalinfo = paypalinfo;
        gender = "Male";
        note = "";
        age = -1;
    }
}
