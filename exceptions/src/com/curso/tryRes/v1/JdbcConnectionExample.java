package com.curso.tryRes.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionExample {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 1. Cargar el driver JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establecer conexión con la base de datos
            String url = "jdbc:mysql://localhost:3306/mi_base"; // Cambia "mi_base" por tu base de datos
            String user = "root"; // Cambia por tu usuario
            String password = "1234"; // Cambia por tu contraseña
            connection = DriverManager.getConnection(url, user, password);

            System.out.println("✅ Conexión establecida correctamente.");

            // 3. Crear un Statement para ejecutar consultas
            statement = connection.createStatement();

            // 4. Ejecutar una consulta SQL (simulación de lectura)
            String query = "SELECT id, nombre FROM usuarios";
            resultSet = statement.executeQuery(query);

            // 5. Procesar el resultado
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                System.out.println("ID: " + id + " - Nombre: " + nombre);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("❌ No se encontró el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ Error en la conexión o consulta SQL: " + e.getMessage());
        } finally {
            // 6. Cerrar recursos en orden inverso
            try {
                if (resultSet != null) {
                    resultSet.close();
                    System.out.println("✅ ResultSet cerrado.");
                }
            } catch (SQLException e) {
                System.out.println("⚠️ Error al cerrar ResultSet: " + e.getMessage());
            }

            try {
                if (statement != null) {
                    statement.close();
                    System.out.println("✅ Statement cerrado.");
                }
            } catch (SQLException e) {
                System.out.println("⚠️ Error al cerrar Statement: " + e.getMessage());
            }

            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("✅ Conexión cerrada.");
                }
            } catch (SQLException e) {
                System.out.println("⚠️ Error al cerrar conexión: " + e.getMessage());
            }
        }
    }
}
