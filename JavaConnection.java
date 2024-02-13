package week4.day2;

public class JavaConnection  extends MySqlConnection{
          public void connect() {
		System.out.println("Connection");
		
	}
public void disconnect() {
		System.out.println("Disconnection");
		}
public void executeUpdate() {
		System.out.println("Exectuion update");
		}
public void executeQuery() {
		System.out.println("Execute the query");
		
	}

public static void main(String[] args) {
	JavaConnection obj = new JavaConnection();
	obj.connect();
	obj.disconnect();
	obj.executeUpdate();
	obj.executeQuery();
}}