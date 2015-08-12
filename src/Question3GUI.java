import java.awt.event.ActionEvent;

/**
 * <h1>Bridge Session 01 - GUI Quiz Program</h1>
 *
 * Displays the third question.
 *
 * @author Victoria Shurman <vshurman@cs.purdue.edu>
 * @author Sahil Pujari <pujari@cs.purdue.edu>
 *
 * @date August 2, 2015
 *
 */

public class Question3GUI extends javax.swing.JFrame {

	/**
	 * Constructor that takes care of initializing the components when an object
	 * of the class is created.
	 */
	public Question3GUI() {
		initComponents();
	}

	/**
	 * Method that initializes the components required by the GUI
	 * 
	 * @return void
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		jLabel4 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel1 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jRadioButton3 = new javax.swing.JRadioButton();
		jRadioButton4 = new javax.swing.JRadioButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24));
		jLabel4.setText("Session 1");

		jLabel1.setFont(new java.awt.Font("Arial", 1, 24));
		jLabel1.setText("<html>Question 3 : You have a right triangle. The length<br>"
				+ "of one leg is 5 inches and the length of the other<br>leg is 12 "
				+ "inches. What is the length of the hypotenuse?</html>");

		// Defines the actions to be invoked if option 1 is selected
		jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 24));
		jRadioButton1.setText("8 inches");
		jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton1ActionPerformed(evt);
			}
		});

		// Defines the actions to be invoked if option 2 is selected
		jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 24));
		jRadioButton2.setText("15 inches");
		jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});

		// Defines the actions to be invoked if option 3 is selected
		jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 24));
		jRadioButton3.setText("13 inches");
		jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton3ActionPerformed(evt);
			}
		});

		// Defines the actions to be invoked if option 4 is selected
		jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 24));
		jRadioButton4.setText("24 inches");
		jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton4ActionPerformed(evt);
			}
		});

		jButton1.setText("Next >>");

		// Defines actions to be invoked if the Next button is clicked
		jButton2.setText("<< Previous");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		// Defines actions to be invoked if the Previous button is clicked
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36));
		jLabel3.setText("CS Bridge Course 2015");

		// Following code takes care of the alignment of the GUI so that
		// components are placed at the appropriate positions
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jSeparator1,
						javax.swing.GroupLayout.Alignment.TRAILING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jButton2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										107,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(48, 48, 48)
								.addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										107,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(251, 251, 251))
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		jLabel1))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(76, 76,
																		76)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jRadioButton2)
																				.addComponent(
																						jRadioButton1)
																				.addComponent(
																						jRadioButton3)
																				.addComponent(
																						jRadioButton4)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(153,
																		153,
																		153)
																.addComponent(
																		jLabel3))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(341,
																		341,
																		341)
																.addComponent(
																		jLabel4)))
								.addContainerGap(113, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel3)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel4)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										13, Short.MAX_VALUE)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										2,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(39, 39, 39)
								.addComponent(jLabel1)
								.addGap(18, 18, 18)
								.addComponent(jRadioButton1)
								.addGap(18, 18, 18)
								.addComponent(jRadioButton2)
								.addGap(18, 18, 18)
								.addComponent(jRadioButton3)
								.addGap(18, 18, 18)
								.addComponent(jRadioButton4)
								.addGap(52, 52, 52)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jButton1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														59,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														59,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(45, 45, 45)));

		pack();
	}

	/**
	 * Specifies the actions to be invoked when jRadioButton1 is pressed
	 * 
	 * @param evt
	 * @return void
	 */
	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Question1GUI.pass[2] = false;
	}

	/**
	 * Specifies the actions to be invoked when jRadioButton2 is pressed
	 * 
	 * @param evt
	 * @return void
	 */
	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		Question1GUI.pass[2] = false;
	}

	/**
	 * Specifies the actions to be invoked when jRadioButton3 is pressed
	 * 
	 * @param evt
	 * @return void
	 */
	private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		Question1GUI.pass[2] = true;
	}

	/**
	 * Specifies the actions to be invoked when jRadioButton4 is pressed
	 * 
	 * @param evt
	 * @return void
	 */
	private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		Question1GUI.pass[2] = false;
	}

	/**
	 * Specifies the actions to be invoked when jButton2 is pressed
	 * 
	 * @param evt
	 * @return void
	 */
	protected void jButton2ActionPerformed(ActionEvent evt) {
		String[] args = {};
		Question2GUI.main(args);
		dispose();

	}

	/**
	 * Specifies the actions to be invoked when jButton1 is pressed
	 * 
	 * @param evt
	 * @return void
	 */
	protected void jButton1ActionPerformed(ActionEvent evt) {
		String[] args = {};
		if (jRadioButton1.isSelected() || jRadioButton2.isSelected()
				|| jRadioButton3.isSelected() || jRadioButton4.isSelected()) {
			Question4GUI.main(args);
			dispose();
		}

	}

	public static void main(String args[]) {
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Question3GUI().setVisible(true);
			}
		});
	}

	/* Components required by the class are declared below */
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JRadioButton jRadioButton3;
	private javax.swing.JRadioButton jRadioButton4;
	private javax.swing.JSeparator jSeparator1;
}
