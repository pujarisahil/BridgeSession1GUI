import java.awt.event.ActionEvent;

/**
 * <h1>Bridge Session 01 - GUI Quiz Program</h1>
 *
 * Displays the seventh question.
 *
 * @author Victoria Shurman <vshurman@cs.purdue.edu>
 * @author Sahil Pujari <pujari@cs.purdue.edu>
 *
 * @date August 2, 2015
 *
 */

public class Question7GUI extends javax.swing.JFrame {

	/**
	 * Constructor that takes care of initializing the components when an object
	 * of the class is created.
	 */
	public Question7GUI() {
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
		jRadioButton5 = new javax.swing.JRadioButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24));
		jLabel4.setText("Session 1");

		jLabel1.setFont(new java.awt.Font("Arial", 1, 24));
		jLabel1.setText("Question 7 : Who is the head of the CS department at Purdue?");

		// Defines the actions to be invoked if option 1 is selected
		jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 24));
		jRadioButton1.setText("Tim Korb");
		jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton1ActionPerformed(evt);
			}
		});

		// Defines the actions to be invoked if option 2 is selected
		jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 24));
		jRadioButton2.setText("Sahil Pujari");
		jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});

		// Defines the actions to be invoked if option 3 is selected
		jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 24));
		jRadioButton3.setText("Douglas Comer");
		jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton3ActionPerformed(evt);
			}
		});

		// Defines the actions to be invoked if option 4 is selected
		jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 24));
		jRadioButton4.setText("Sunil Prabhakar");
		jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton4ActionPerformed(evt);
			}
		});

		// Defines the actions to be invoked if option 5 is selected
		jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 24));
		jRadioButton5.setText("Buster Dunsmore");
		jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton5ActionPerformed(evt);
			}
		});

		jButton1.setText("Next >>");

		jButton2.setText("<< Previous");

		// Defines actions to be invoked if the Next button is clicked
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
																						jRadioButton4)
																				.addComponent(
																						jRadioButton5)))
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
								.addGap(18, 18, 18)
								.addComponent(jRadioButton5)
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
		Question1GUI.pass[6] = false;
	}

	/**
	 * Specifies the actions to be invoked when jRadioButton2 is pressed
	 * 
	 * @param evt
	 * @return void
	 */
	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		Question1GUI.pass[6] = false;
	}

	/**
	 * Specifies the actions to be invoked when jRadioButton3 is pressed
	 * 
	 * @param evt
	 * @return void
	 */
	private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		Question1GUI.pass[6] = false;
	}

	/**
	 * Specifies the actions to be invoked when jRadioButton4 is pressed
	 * 
	 * @param evt
	 * @return void
	 */
	private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		Question1GUI.pass[6] = true;
	}

	/**
	 * Specifies the actions to be invoked when jRadioButton5 is pressed
	 * 
	 * @param evt
	 * @return void
	 */
	private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		if (jRadioButton2.isSelected())
			jRadioButton2.doClick();
		if (jRadioButton3.isSelected())
			jRadioButton3.doClick();
		if (jRadioButton4.isSelected())
			jRadioButton4.doClick();
		if (jRadioButton1.isSelected())
			jRadioButton1.doClick();

		Question1GUI.pass[6] = false;
	}

	/**
	 * Specifies the actions to be invoked when jButton2 is pressed
	 * 
	 * @param evt
	 * @return void
	 */
	protected void jButton2ActionPerformed(ActionEvent evt) {
		String[] args = {};
		Question6GUI.main(args);
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
				|| jRadioButton3.isSelected() || jRadioButton4.isSelected()
				|| jRadioButton5.isSelected()) {
			Question8GUI.main(args);
			dispose();
		}

	}

	public static void main(String args[]) {
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Question7GUI().setVisible(true);
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
	private javax.swing.JRadioButton jRadioButton5;
	private javax.swing.JSeparator jSeparator1;
}
