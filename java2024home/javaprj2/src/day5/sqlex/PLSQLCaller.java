package day5.sqlex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class PLSQLCaller {
    public static void main(String[] args) {
        // 데이터베이스 연결 정보 설정
        String url = "jdbc:oracle:thin:@localhost:1521:testdb";
        String username = "scott";
        String password = "tiger";

        // PL/SQL 호출을 위한 SQL 문
        // 프로시저 호출
        String plsql = "{ call ojc3(?, ?) }";

        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 데이터베이스 연결
            Connection connection = DriverManager.getConnection(url, username, password);

            // CallableStatement 생성 및 PL/SQL 호출
            CallableStatement callableStatement = connection.prepareCall(plsql);
            callableStatement.setString(1, "101");
            callableStatement.setString(2, "6500");
            callableStatement.execute();

            // 자원 정리
            callableStatement.close();
            connection.close();

            System.out.println("PL/SQL 호출이 성공적으로 완료되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
