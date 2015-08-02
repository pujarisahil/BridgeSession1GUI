public class EndFrame extends javax.swing.JFrame {

    public EndFrame() {
    	generator = new PasswordGenerator("session1-146hints.txt");
    	generator.setPasswordAndHints();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel4.setText("Session 1");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton2.setText("Finish");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36));
        jLabel3.setText("CS Bridge Course 2015");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
        jLabel1.setText("Congratulations! You passed the quiz!");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
        jLabel2.setText("<html>After you click 'Finish' below, .zip folder and a .pdf file<br>"
        				+ "	will be generated onto your Desktop.</html>");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndFrame().setVisible(true);
            }
        });
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		//TODO generate files
    	getHintsFile();
    	getZipFile();
    	dispose();
	}

    private void getZipFile() {
    	System.out.println(generator.hints + "\n" + generator.password);
	}

	private void getHintsFile() {
		try {
			org.apache.pdfbox.pdmodel.PDDocument hintsPDF =
					(new org.apache.pdfbox.TextToPDF()).createPDFFromText(new java.io.StringReader(generator.hints));
			hintsPDF.save("hints.pdf");
			hintsPDF.close();
		} catch (java.io.IOException e) {
			System.out.println(e.getMessage());
		} catch (org.apache.pdfbox.exceptions.COSVisitorException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private class PasswordGenerator {
		
		java.util.ArrayList<String> hintsList;
		String hints;
		String password;
		
		public PasswordGenerator(String filename) {
			hintsList = new java.util.ArrayList<String>();
			hints = "";
			password = "";
			readHintsFile(filename);
		}
		
		public void readHintsFile(String filename) {
			try {
				java.io.BufferedReader read = new java.io.BufferedReader(new java.io.FileReader(filename));
				String line;
				while((line = read.readLine()) != null) {
					hintsList.add(line);
				}
			} catch (java.io.FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (java.io.IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void setPasswordAndHints() {
			java.util.Random r = new java.util.Random();
			for (int i = 0; i < 4; i++) {
				int index = r.nextInt(hintsList.size());
				String[] hint = hintsList.get(index).split(",");
				hints += hint[0] + "\n";
				password += hint[1];
				hintsList.remove(index);
			}
		}
	}

	private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private PasswordGenerator generator;
}
