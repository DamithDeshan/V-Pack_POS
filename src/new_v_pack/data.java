
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package new_v_pack;



import java.sql.*;

import java.text.*;

/**
 *
 * @author Rajapaksha
 */

public class data {
    
    public static java.sql.Connection dbConnection() {
        java.sql.Connection con;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/v_pack_DB", "root", "");
            //System.out.println("Database Connected");
            return con;

        } catch (ClassNotFoundException | java.sql.SQLException x) {
            //System.out.println("Database not Connected...!");
            return null;
        }
    }
    
    public static String getDate(){
        java.util.Date date = new java.util.Date();
        SimpleDateFormat thisday = new SimpleDateFormat("DD-MM-YYYY");
        return thisday.format(date);
    }
    
    public String getTime(){
        java.util.Date date = new java.util.Date();
        SimpleDateFormat thistime = new SimpleDateFormat(" hh:mm:ss a");
        return thistime.format(date);
    }
    
    public static void main(String args[]) throws InterruptedException{
        
        
        dbConnection();
   }
    
    public static String getUserRole(String User_name){
        String UserRole = null;
        try{
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("select UserRole from systemlogin where UserName = \"" + User_name+ "\"");
            if (rs.next()){
                UserRole = (rs.getString("UserRole"));
                //System.out.println(UserRole);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return UserRole;
    }
}


