import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Test extends Frame {
	public TextField tfFirstName;
	public TextField tfSecondName;
	public TextField tfEmail;
 public int x=0;
	public Button btSubmit;
	public Button btExit;
	
	public Test() {

		setLayout(new FlowLayout());
		Label firstName1 = new Label("First Name");
		add(firstName1);

		tfFirstName = new TextField(5);
		add(tfFirstName);

		Label lbSecondName1 = new Label("Last Name");
		add(lbSecondName1);

		tfSecondName = new TextField(5);
		add(tfSecondName);

		tfEmail = new TextField(5);
		add(tfEmail);

		btSubmit = new Button("Submit");
		add(btSubmit);
		btSubmit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");  
		            Connection connection = DriverManager.getConnection(  
		                    "jdbc:mysql://localhost/test", "root", "");  
		          
		            //Statement statement = connection.createStatement();  
				      // Result set get the result of the SQL query
				    //  resultSet = statement
				     //     .executeQuery("select * from FEEDBACK.COMMENTS");
				    //  writeResultSet(resultSet);
					// Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					//String db_name = "JavaForm";
				//	String url = "jdbc:mysql://localhost:3306/JavaForm";
				//	String user = "root";
				//	String pass = "";
				//	Connection connection = DriverManager.getConnection(url,
				//			user, pass);
					//Statement statement = connection.createStatement();
					// String fn= tfFirstName.getText();
					// String se = tfSecondName.getText();
					// String em=tfEmail.getText();
		          
		           
					PreparedStatement stmt = connection.prepareStatement("INSERT INTO Profile(list,FirstName, LastName, Email) VALUES (?, ?, ?, ?)");
                   // stmt.setInt(1, );
					stmt.setString(1, tfFirstName.getText());
					stmt.setString(2, tfSecondName.getText());
					stmt.setString(3, tfEmail.getText());

					stmt.executeUpdate();
					  System.out.println("Working");
					// String sql =
					// "INSERT INTO profile(FirstName,LastName,Email) VALUES('tfFirstName.getText(),tfSecondName.getText(),tfEmail.getText())";
					// statement.executeUpdate(sql);
					// JOptionPane.showMessageDialog(rootPane, "value Added!");
				} catch (Exception ex) {
					// JOptionPane.showMessageDialog(this, ex.getMessage());
					System.out.println("failed");
				}

			}

	
		
					});

		btExit = new Button("EXIT");
		add(btExit);
		btExit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});

		setTitle("FORM");
		setSize(200, 300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		Test an = new Test();
	}

}