/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import java.awt.HeadlessException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author patricia
 */
public class DatenbankHandler {

    private static Connection con;
    private static PreparedStatement st;

    
//   public static Connection getConnection()/*throws SQLException*/ {
//        Connection con = null;
//        try {
//            Class.forName("foo.bah.Driver");
//            con = DriverManager.getConnection("jdc:mysql://127.0.0.1:3306/MyTimeScheduler", "Admin", "admin");
//            System.out.println("Verbindung erfolgreich");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        return con;
//    } 
        
    //Patricias Connector (nicht löschen oder bearbeiten, ich arbeite dran ) 
    /*public static Connection getConnection()/*throws SQLException {
        Connection con = null;
        try {
            Class.forName("foo.bah.Driver");
            con = DriverManager.getConnection("jdc:mysql://127.0.0.1:3306/MyTimeScheduler", "Admin", "admin");
            System.out.println("Verbindung erfolgreich");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }*/
    
    public static Connection getConnection() //Camillas Connector
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        //Class.forName("foo.bah.Driver");
        con=DriverManager.getConnection("jdc:mysql://127.0.0.1:3306/MyTimeScheduler", "Admin", "admin");
        JOptionPane.showMessageDialog(null, "Connection Successfull!");
        return con;
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error in DatenbankHandler getConnection method "+e);
            
        }
        return con;
    }
    

    /*public boolean checkifUserExists(String username, String password) throws SQLException {
        String sql = "Select * FROM _USER where username = ? AND password = ? AND DELETED = 0 ";
        ResultSet rs = null;
        con = getConnection();
        st = con.prepareStatement(sql);
        st.setString(1, username);
        st.setString(2, password);
        rs = st.executeQuery();

        if (rs.next()) {
            return true;
        }
        return false;
    }

    public boolean checkifEmailExists(String email) throws SQLException {
        String sql = "Select * FROM _USER where email = ?  AND DELETED = 0 ";
        ResultSet rs2 = null;
        con = getConnection();
        st = con.prepareStatement(sql);
        st.setString(3, email);
        rs2 = st.executeQuery(); //Returns one ResultSet object

        if (rs2.next()) {
            return true;
        }
        return false;
    }*/

    //PreparedStatement ps;

    /*    public int InsertnewAppointment(Appointment new_event){
    int insertSuccessfull= 1;
    String sql= "INSERT INTO appointment (a_eventName, a_Date, a_eventTime,a_duration, a_location, a_priority, a_reminder) VALUES (?,?,?,?,?;?;?)";
    try (Connection con = getConnection();PreparedStatement ps = con.prepareStatement(sql)){
        ps.setString(1, new_event.getName());           //name
        ps.setTimestamp(2, new_event.getDate());        //Date --> invert to Sql date
        ps.setLocalTime(3, new_event.getTime());        //time --> invert so sql time 
        ps.setInt(4, new_event.getDuration());          //duration
        ps.setString(5, new_event.getLocation());       //location
        ps.setString(6, new_event.getParticipants());   //participants
        ps.setString(7, new_event.getPriority());       //priority
        ps.setString(8, new_event.getReminder());       //reminder
        insertSuccessfull = ps.executeUpdate();   
    }   catch (SQLException ex) {
            Logger.getLogger(DatenbankHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    System.out.println("Appointment successfully added");
    return insertSuccessfull; 
    }
     */
    //String username = "pat";

    /*public void EditUser(String old_usermail, String new_usermail) {
        try {
            String sql = "Update user SET u_email = ? WHERE u_username = ? VALUES (?,?)";
            
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
    //        System.out.println(ps.setString(1, new_usermail));
            ps.setString(2, username);
            ps.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DatenbankHandler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        }*/ 

}
