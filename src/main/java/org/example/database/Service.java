package org.example.database;

import java.sql.PreparedStatement;

public class Service {
    public static void main(String[] args) {
    int i =   DaoLayer.insertData(1200, "Satyavan", "Rajbhar", "Subhash Nagar Pokharan Road No. 2", "Thane");
if(i>0)
{
    System.out.println("Data is successuflly inserted");
}
else
    System.out.println("some error occured");

DaoLayer.showRecord();

DaoLayer.DeleteOperation();

DaoLayer.showRecord();
    }

}
