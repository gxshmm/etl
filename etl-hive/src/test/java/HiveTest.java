/**
 * BBD Service Inc
 * All Rrights Reserved@2017
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

import static java.util.stream.Collectors.*;

/**
 *
 * @author moumao
 * @version $Id: HiveTest.java, v 0.1 2017/11/3 10:51 moumao Exp $$
 */
public class HiveTest {
    private static final Logger log = LoggerFactory.getLogger(HiveTest.class);

    private Connection connection;
    private Statement statement;

    @Before
    public void before() throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.hive.jdbc.HiveDriver");
        connection=DriverManager.getConnection("jdbc:hive2://172.16.2.201:10000/bbd","root","");
        statement=connection.createStatement();
    }


    @Test
    public void test() throws SQLException {
        ResultSet resultSet = statement.executeQuery("show tables");
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
        //
    }
    @After
    public void after() throws SQLException {
        //
        statement.close();
        connection.close();
        //
    }
}
