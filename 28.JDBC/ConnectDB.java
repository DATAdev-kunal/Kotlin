import java.sql.*;
public class ConnectDB {
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:univ.db");

        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from dept");

        int dno;
        String dname;

        while(rs.next())
        {
            dno=rs.getInt("deptNo");
            dname=rs.getString("deptName");
            System.out.println(dno+" "+dname);
        }

    }
}
