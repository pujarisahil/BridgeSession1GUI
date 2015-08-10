/**
 * <h1>Bridge Session 01 - GUI Quiz Program</h1>
 *
 * The startup screen that displays the instructions
 *
 * @author Victoria Shurman <vshurman@cs.purdue.edu>
 * @author Sahil Pujari <pujari@cs.purdue.edu>
 *
 * @date August 2, 2015
 *
 */

public class StartupScreen extends javax.swing.JFrame {

	/**
	 * Constructor that takes care of initializing the components when an object of the class is created.
	 */
    public StartupScreen() {
        initComponents();
    }

    /**
     * Method that initializes the components required by the GUI
     * @return void
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        //Following code takes care of setting the title
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel3.setText("CS Bridge Course 2015");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Following code takes care of setting the JButton and impementing a listener
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        //Following code displays the startup message
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("<html>Welcome to the 2015 Bridge Program. During this session,<br>" +
        				"we are going to complete a short activity with a group of 5-6<br>" +
        				"people. You must first complete this quiz with your group to<br>" + 
        				"unlock the next part of the activity.</html>");
        
        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36));
        jLabel2.setText("CS Bridge Course 2015");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel4.setText("Session 1");

        //Following code takes care of the alignment of the GUI so that components are placed at the appropriate positions
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }

    /**
     * Specifies the actions to be invoked when jButton1 is pressed
     * @param evt
     * @return void
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	String[] args = {};
    	Question1GUI.main(args);
    	dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartupScreen().setVisible(true);
            }
        });
    }

    /* Components required by the class are declared below */
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
}
