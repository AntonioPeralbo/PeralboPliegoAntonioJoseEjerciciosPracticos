package com.mycompany.ejerciciodia7num1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EjercicioDia7Num1 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/universidad ";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            String sql = "SELECT * FROM estudiantes";
            ResultSet resultado = statement.executeQuery(sql);

            
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                double calificacion = resultado.getDouble("calificacion");

                System.out.println("ID " + id + " Nombre " + nombre + " Edad " + edad + " Calificacion " + calificacion);
            }

           
            String nuevoEstudiante = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES ('Almudena', 19, 5)";
            int filasAfectadas = statement.executeUpdate(nuevoEstudiante);
            

           
            ResultSet resultado2 = statement.executeQuery(sql);
            while (resultado2.next()) {
                int id = resultado2.getInt("id");
                String nombre = resultado2.getString("nombre");
                int edad = resultado2.getInt("edad");
                double calificacion = resultado2.getDouble("calificacion");

                System.out.println("\nID " + id + " Nombre " + nombre + " Edad " + edad + " Calificacion " + calificacion);
            }

            
            resultado.close();
            resultado2.close();
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
