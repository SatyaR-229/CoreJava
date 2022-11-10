package org.example.database;

import java.sql.*;

public class DaoLayer {
  static  Connection con = null;
public static Connection getConnection()
{

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","nsense");
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    return con;
}

public static   int  insertData(int id,String studentName,String lastName,String address,String city)
{
    PreparedStatement preparedStatement =null;
    Connection con=null;


   int i=0 ;
    String query="insert into student_detail values(?,?,?,?,?)";
    try {
        con = getConnection();
       preparedStatement = con.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2,studentName);
        preparedStatement.setString(3,lastName);
        preparedStatement.setString(4,address);
        preparedStatement.setString(5,city);

        i  = preparedStatement.executeUpdate();



    }
    catch (SQLException ex)
    {
        ex.printStackTrace();
    }
    finally {
        try {
            con.close();
        }
        catch (SQLException ex)
        {

        }
    }

return i;

}

public static void showRecord()
{PreparedStatement preparedStatement;
    try
    {
       preparedStatement = DaoLayer.getConnection().prepareStatement("select * from student_detail");
       ResultSet rs = preparedStatement.executeQuery();
       while (rs.next())
       {
           System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5));
       }
    }catch (SQLException ex)
    {
        ex.printStackTrace();
    }
}

public static void DeleteOperation()
{
    try {
        PreparedStatement preparedStatement = DaoLayer.getConnection().prepareStatement("delete from student_detail where Student_id=?");
        preparedStatement.setInt(1,1200);
        int i = preparedStatement.executeUpdate();
    }
    catch (SQLException ex)
    {
        ex.printStackTrace();
    }

}
}
