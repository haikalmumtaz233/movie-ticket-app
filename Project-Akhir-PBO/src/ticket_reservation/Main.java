/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticket_reservation;

import ticket_reservation.views.screen.home_screen;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import ticket_reservation.models.user;

/**
 *
 * @author Lenovo
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiket_reservation", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        new home_screen().setVisible(true);
    }
}
