/**
 * <h1>Bridge Session 01 - GUI Quiz Program</h1>
 *
 * The end frame that generates the ZIP file along with the hints PDF.
 *
 * @author Victoria Shurman <vshurman@cs.purdue.edu>
 * @author Sahil Pujari <pujari@cs.purdue.edu>
 *
 * @date August 2, 2015
 *
 */

public class EndFrame extends javax.swing.JFrame {

	/**
	 * Constructor for an EndFrame. Initializes the hints array and the
	 * components of the Frame.
	 */
	public EndFrame() {
		hintsList = new java.util.ArrayList<String>();
		hints = "";
		password = "";
		initComponents();
	}

	/**
	 * Initializes the components of the JFrame and calls to action listeners.
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		jLabel4 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24));
		jLabel4.setText("Session 1");

		// Defines the actions to be invoked if B146 is clicked
		jButton3.setFont(new java.awt.Font("Tahoma", 1, 18));
		jButton3.setText("B146");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		// Defines the actions to be invoked if B148 is clicked
		jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
		jButton2.setText("B148");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		// Defines the actions to be invoked if B158 is clicked
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
		jButton1.setText("B158");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36));
		jLabel3.setText("CS Bridge Course 2015");

		jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
		jLabel1.setText("Congratulations! You passed the quiz!");

		jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
		jLabel2.setText("<html>After you click your lab section below, an 'UnlockThis.zip' file<br> "
				+ "and a 'hints.pdf' file will be generated into your working directory.</html>");

		jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
		jLabel5.setText("<html>The zip is password protected, and the pdf contains clues<br>"
				+ "for the password. Work with your team to solve the clues.<html>");

		jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
		jLabel6.setText("<html>There are four parts to each password. The passwords are<br>"
				+ "written in camel case, with the first letter of each part<br>"
				+ "capitalized, and no white space. The password will look something<br>"
				+ "like this: PartoneParttwoPartthreePartfour.</html>");

		jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
		jLabel8.setText("<html>Some of the clues may require you to ask some of your TAs<br>"
				+ "for some information. Do what you must to unlock the zip, and<br>"
				+ "then follow the instructions inside to complete the activity.</html>");

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
								.addComponent(jButton3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										107,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(48, 48, 48)
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
																.addGap(53, 53,
																		53)
																.addComponent(
																		jLabel1))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(139,
																		139,
																		139)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jLabel5)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						jLabel6)
																				.addComponent(
																						jLabel8))))
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
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										2,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(32, 32, 32)
								.addComponent(jLabel1)
								.addGap(35, 35, 35)
								.addComponent(jLabel2)
								.addGap(18, 18, 18)
								.addComponent(jLabel5)
								.addGap(18, 18, 18)
								.addComponent(jLabel6)
								.addGap(18, 18, 18)
								.addComponent(jLabel8)
								.addGap(116, 116, 116)
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
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														59,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(45, 45, 45)));

		pack();
	}

	/**
	 * Creates and displays the form.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EndFrame().setVisible(true);
			}
		});
	}

	/**
	 * Action listener for jButton1, associated with lab section B148. Calls
	 * {@link #readCluesFile(String, String)} to read the appropriate clues,
	 * {@link #setPasswordAndHints()} to randomly generate the hints and
	 * password, {@link #getHintsFile()} to generate hints.pdf, and
	 * {@link #getZipFile()} to generate UnlockThis.zip.
	 * 
	 * @param evt
	 */
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		readCluesFile("hints3.zip", hints3Pass);
		setPasswordAndHints();
		getHintsFile();
		getZipFile();
		dispose();
	}

	/**
	 * Action listener for jButton1, associated with lab section B148. Calls
	 * {@link #readCluesFile(String, String)} to read the appropriate clues,
	 * {@link #setPasswordAndHints()} to randomly generate the hints and
	 * password, {@link #getHintsFile()} to generate hints.pdf, and
	 * {@link #getZipFile()} to generate UnlockThis.zip.
	 * 
	 * @param evt
	 */
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		readCluesFile("hints2.zip", hints2Pass);
		setPasswordAndHints();
		getHintsFile();
		getZipFile();
		dispose();
	}

	/**
	 * Action listener for jButton1, associated with lab section B148. Calls
	 * {@link #readCluesFile(String, String)} to read the appropriate clues,
	 * {@link #setPasswordAndHints()} to randomly generate the hints and
	 * password, {@link #getHintsFile()} to generate hints.pdf, and
	 * {@link #getZipFile()} to generate UnlockThis.zip.
	 * 
	 * @param evt
	 */
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		readCluesFile("hints1.zip", hints1Pass);
		setPasswordAndHints();
		getHintsFile();
		getZipFile();
		dispose();
	}

	/**
	 * Reads a file from a password protected zip file and writes to a different
	 * password protected zip file, encrypted with the randomly assigned
	 * password and named UnlockThis.zip. The file is then outpur to the current
	 * working directory.
	 */
	private void getZipFile() {
		try {
			com.alutam.ziputils.ZipEncryptOutputStream encryptOut = new com.alutam.ziputils.ZipEncryptOutputStream(
					new java.io.FileOutputStream("UnlockThis.zip"), password);
			java.util.zip.ZipOutputStream zipOut = new java.util.zip.ZipOutputStream(
					encryptOut);

			com.alutam.ziputils.ZipDecryptInputStream in = new com.alutam.ziputils.ZipDecryptInputStream(
					new java.io.FileInputStream("Session01.zip"), pdfPass);
			java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(
					in);

			java.util.zip.ZipEntry e = new java.util.zip.ZipEntry(zis
					.getNextEntry().getName());
			zipOut.putNextEntry(e);

			int b;
			while ((b = zis.read()) != -1)
				zipOut.write(b);
			zipOut.closeEntry();
			zipOut.close();
			zis.close();
		} catch (java.io.FileNotFoundException e) {
			e.printStackTrace();
			;
		} catch (java.io.IOException e) {
			e.printStackTrace();
			;
		}
	}

	/**
	 * Writes the randomly assigned list of hints to a pdf file and outputs the
	 * file, named hints.pdf, to the current working directory.
	 */
	private void getHintsFile() {
		try {
			org.apache.pdfbox.pdmodel.PDDocument hintsPDF = (new org.apache.pdfbox.TextToPDF())
					.createPDFFromText(new java.io.StringReader(hints));
			hintsPDF.save("hints.pdf");
			hintsPDF.close();
		} catch (java.io.IOException e) {
			System.out.println(e.getMessage());
		} catch (org.apache.pdfbox.exceptions.COSVisitorException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Reads a list of clues from a password protected clue file and adds each
	 * line to an ArrayList.
	 * 
	 * @param filename
	 *            The name of the file to read from
	 * @param filePassword
	 *            The password to decrypt the file
	 */
	private void readCluesFile(String filename, String filePassword) {
		try {
			com.alutam.ziputils.ZipDecryptInputStream in = new com.alutam.ziputils.ZipDecryptInputStream(
					new java.io.FileInputStream(filename), filePassword);
			java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(
					in);
			java.util.zip.ZipEntry e = zis.getNextEntry();
			java.io.StringWriter str = new java.io.StringWriter();
			int b;
			while ((b = zis.read()) != -1) {
				str.write(b);
				str.flush();
			}

			String[] clues = str.toString().split("\n");
			for (int i = 0; i < clues.length; i++)
				hintsList.add(clues[i]);
			zis.close();
		} catch (java.io.FileNotFoundException e) {
			e.printStackTrace();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Randomly selects four random clues and their associated hints from the
	 * hintsList, parses them, and assigns them to <code>hints</code> and
	 * <code>password</code>. The clues are removed from the hintsList once they
	 * are used to prevent repeats.
	 */
	private void setPasswordAndHints() {
		java.util.Random r = new java.util.Random();
		String[] hint;
		for (int i = 0; i < 4; i++) {
			int index = r.nextInt(hintsList.size());
			hint = hintsList.get(index).split(",");
			hints += hint[0] + "\n";
			password += hint[1];
			hintsList.remove(index);
		}
	}

	/* Components required by the class are declared below */
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JSeparator jSeparator1;
	private java.util.ArrayList<String> hintsList;
	private String hints;
	private String password;
	private String hints1Pass = "bnwh!d2$4lw";
	private String hints2Pass = "nttnt3$dt";
	private String hints3Pass = "p0c$m0gj#m";
	private String pdfPass = "s!@n$t1sim@tn";
}
