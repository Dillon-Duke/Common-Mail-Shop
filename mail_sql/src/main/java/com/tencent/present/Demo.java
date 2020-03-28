package com.tencent.present;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tencent.util.DBHelper;  
  
public class Demo {  
  
    static String sql = null;  
    static DBHelper db1 = null;  
    static ResultSet ret = null;  
  
    public static void main(String[] args) {  
        sql = "select * from man";//SQL语句  
        db1 = new DBHelper(sql);//创建DBHelper对象  
        
        String sql = "CREATE TABLE REGISTRATION " +
                     "(id INTEGER not NULL, " +
                     " first VARCHAR(255), " + 
                     " last VARCHAR(255), " + 
                     " age INTEGER, " + 
                     " PRIMARY KEY ( id ))"; 

        try {  
        	db1.pst.executeUpdate(sql);
            //ret = db1.pst.executeQuery();//执行语句，得到结果集  
            /*while (ret.next()) {  
                Integer id = ret.getInt(1);
                String name = ret.getString(2);  
                System.out.println(id+"=="+name);
            }*///显示数据  
            //ret.close();  
            db1.close();//关闭连接  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  
  
}  
