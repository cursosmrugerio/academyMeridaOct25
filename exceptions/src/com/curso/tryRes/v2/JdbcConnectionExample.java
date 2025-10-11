package com.curso.tryRes.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionExample {

    public static void main(String[] args) {

        // 1. Cargar el driver JDBC de MySQL
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ No se encontró el driver JDBC: " + e.getMessage());
            return;
        }

        // 2. Establecer conexión y usar try-with-resources
        String url = "jdbc:mysql://localhost:3306/mi_base"; // Cambia por tu BD
        String user = "root"; // Cambia por tu usuario
        String password = "1234"; // Cambia por tu contraseña

        String query = "SELECT id, nombre FROM usuarios";

        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)
        ) {

            System.out.println("✅ Conexión establecida correctamente.");

            // 3. Procesar el resultado
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                System.out.println("ID: " + id + " - Nombre: " + nombre);
            }

        } catch (SQLException e) {
            System.out.println("❌ Error en la conexión o consulta SQL: " + e.getMessage());
        }
    }
}
