package com.hhr.utils;

/**
 * @author HHR
 * @date 2020/4/24 22:01
 */
public class Data {
    public static final int EMPLOYEE =10;
    public static final int PROGRAMMER =11;
    public static final int DESIGNER =12;
    public static final int ARCHITECT =13;
    public static final int PC =21;
    public static final int NOTBOOK =22;
    public static final int PRINTER =23;

    //Employee:10,id,name,age,salary,
    //Programmer:10,id,name,age,salary,
    //Designer:10,id,name,age,salary,bonus
    //Architer:10,id,name,age,salary,
    public static final String[][] EMPLOYEES={
            {"10", "1", "赵一", "22", "3000"},
            {"13", "2", "钱二", "32", "8000", "1500","3000"},
            {"11", "3", "孙三", "24", "7000"},
            {"11", "4", "李四", "23", "5000"},
            {"12", "5", "周五", "27", "4000", "6000"},
            {"11", "6", "吴六", "34", "4000"},
            {"12", "7", "郑七", "21", "4000","5200"},
            {"13", "8", "王八", "51", "4000","4000","6000"},
            {"12", "9", "何九", "41", "4000","3000"},
            {"11", "10", "张十", "31", "4000"},
            {"11", "11", "蒙十", "22", "9000"},
            {"12", "11", "胡十", "22", "9000","1200"}
    };
//设备
    public static final String[][] EQIPMENTS={
            {},
            {"22", "联想Y5",  "6000"},
            {"21", "宏基","AT-N52"},
            {"21", "戴尔", "3800-R33"},
            {"23", "激光", "佳能2900"},
            {"21", "华硕",  "K30BD-21寸"},
            {"21", "海尔", "18-511X 19"},
            {"23", "针式","爱普生20k"},
            {"22", "惠普m6","5800"},
            {"21", "联想", "ThinkCenter"},
            {"21", "华硕","KBD-A54M5"},
            {"22", "惠普m6",  "5800"},
    };



}
