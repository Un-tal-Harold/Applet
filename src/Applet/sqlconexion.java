package Applet;

import java.sql.*;

public class sqlconexion {

    Connection SQLconection;

    public sqlconexion() {
        String URL = "jdbc:mysql://aws.connect.psdb.cloud/ia-project?sslMode=VERIFY_IDENTITY";//si algo es el host
        String USER = "9p1fozegnvejc4n2h6k4";
        String CLAVE = "pscale_pw_MYxNlwN8XhdMtpLKdMut05zKRymSC1ryqP8ZK8bX4Ij";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            SQLconection = DriverManager.getConnection(URL, USER, CLAVE);
            System.out.print("SI se pudo conectar con la base de datos");
        }catch(Exception e){
            System.out.print(e);
        }
    }
    public Connection getConectarDB(){
        return SQLconection;
    }
}
