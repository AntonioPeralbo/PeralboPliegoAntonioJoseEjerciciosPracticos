
package com.mycompany.ejerciciosdia7num1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class EjerciciosDia7Num1 {

    public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3306/universidad ";
       String usuario = "root";
       String password = "";
       
        try {
            
            Connection conexion = DriverManager.getConnection(url, url, password);
            Statement statement = conexion.createStatement();
            String sql = "SELECT * FROM estudiantes";
            ResultSet resultado = statement.executeQuery(sql);
            
            
            while (resultado.next()){
                
                int id =resultado.getInt("id");
                String nombre = resultado.getNString("nombre");
                int edad = resultado.getInt("edad");
                double calificacion = resultado.getDouble("calificacion");
                System.out.println("\n Id : "+ id +" Nombre "+ nombre+ " Edad: "+ edad+ "Calificacion" + calificacion );
                
                
            }
                String nuevoEstudiante = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES ('Almudena', 35, 6.5)";
                        
            resultado.close();
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        
    }
}
