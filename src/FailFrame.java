import java.awt.event.ActionEvent;

/**
 * <h1>Bridge Session 01 - GUI Quiz Program</h1>
 *
 * Displays the frame that corresponds to a bad attempt of the quiz.
 *
 * @author Victoria Shurman <vshurman@cs.purdue.edu>
 * @author Sahil Pujari <pujari@cs.purdue.edu>
 *
 * @date August 2, 2015
 *
 */

public class FailFrame extends javax.swing.JFrame {

	/**
	 * Constructor for a FailFrame. Calls {@link #initComponents()} to
	 * initialize the Frame.
	 */
	public FailFrame() {
		initComponents();
	}

	/**
	 * Initializes the components required by the GUI.
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		jLabel4 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jButton2 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24));
		jLabel4.setText("Session 1");

		jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
		jButton2.setText("Start Over");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36));
		jLabel3.setText("CS Bridge Course 2015");

		jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
		jLabel2.setText("Sorry, you did not pass the quiz. Click below to take the quiz again.");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jSeparator1,
						javax.swing.GroupLayout.Alignment.TRAILING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
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
																		jLabel4))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(52, 52,
																		52)
																.addComponent(
																		jLabel2))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(297,
																		297,
																		297)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		212,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(48, Short.MAX_VALUE)));
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
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										2,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(92, 92, 92)
								.addComponent(jLabel2)
								.addGap(118, 118, 118)
								.addComponent(jButton2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										59,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(172, 172, 172)));

		pack();
	}

	/**
	 * Create and display the form
	 * @param args
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FailFrame().setVisible(true);
			}
		});

	}

	/**
	 * Specifies actions to take if jButton2 is pressed.
	 * 
	 * @param evt The event to evaluate
	 */
	private void jButton2ActionPerformed(ActionEvent evt) {
		String[] args = {};
		Question1GUI.main(args);
		dispose();

	}

	/* Components required by the class are declared below */
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JSeparator jSeparator1;
}
