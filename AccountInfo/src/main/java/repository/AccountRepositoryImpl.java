package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class AccountRepositoryImpl implements AccountRepository {
    private static final String DB_URL = "jdbc:oracle:thin:@192.168.119.119:1521:db";
    private static final String DB_USERNAME = "scott";
    private static final String DB_PASSWORD = "tiger";
    
    private String getRandomNumber() {
        Random random = new Random();
        return Integer.toString(random.nextInt(9000));
    }
    
    public AccountRepositoryImpl() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void createAccount(String memberId, String accountPassword, String nickname, int accountType) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String sql = "INSERT INTO account_info_woori (account_number, member_id, bank_code, branch_code, account_password, balance, nickname, account_type, account_status, reg_date) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
           
            String accountNumber = "001" + "-" + getRandomNumber() + "-" + getRandomNumber();
            String bankCode = "우리";
            String branchCode = "001";
            // accountStatus 1이 정상 계좌
            int accountStatus = 1; 
            try (PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1, accountNumber);
                stmt.setString(2, memberId);
                stmt.setString(3, bankCode);
                stmt.setString(4, branchCode);
                stmt.setString(5, accountPassword);
                stmt.setInt(6, 0);
                stmt.setString(7, nickname);
                stmt.setInt(8, accountType);
                stmt.setInt(9, accountStatus);
                stmt.executeUpdate();
            }catch (SQLException e) {
                // Handle any potential database errors
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // Handle any potential database errors
            e.printStackTrace();
        }
    }
    
    
}
