package com.atm.bean;

import com.atm.db.DBConn;
import com.atm.model.Account;

import java.sql.*;

public class AccountBean {

    DBConn dbConn = new DBConn();

    public Account login(String accountNumber, String pinNumber) {

        String SQL = "SELECT * from account where account_number = ? and pin = ?";
        Account account = new Account();

        try {

        Connection conn = dbConn.connect();

            try {

                PreparedStatement statement = conn.prepareStatement(SQL);
                statement.setInt(1, Integer.parseInt(accountNumber));
                statement.setInt(2, Integer.parseInt(pinNumber));

                ResultSet rs = statement.executeQuery();

                if (rs.next()) {
                    account.setPin(rs.getInt("pin"));
                    account.setAccountNumber(rs.getInt("account_number"));
                    account.setBalance(rs.getDouble("balance"));
                    account.setClientName(rs.getString("client_name"));
                    account.setId(rs.getByte("id"));
                }


            } catch (Exception e) {
                e.printStackTrace();
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;
    }

    public void withdraw() {

    }

    public void deposit() {

    }

}
