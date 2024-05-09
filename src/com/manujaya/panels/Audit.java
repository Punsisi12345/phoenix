/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.manujaya.panels;

/**
 *
 * @author Manujaya
 */
public class Audit extends javax.swing.JPanel {

    /**
     * Creates new form Audit
     */
    public Audit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        greenButton4 = new com.manujaya.components.GreenButton();
        jPanel10 = new javax.swing.JPanel();
        upperCornerRoundButton3 = new com.manujaya.components.UpperCornerRoundButton();
        upperCornerRoundButton5 = new com.manujaya.components.UpperCornerRoundButton();
        upperCornerRoundButton6 = new com.manujaya.components.UpperCornerRoundButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        rCornerTextFeild1 = new com.manujaya.components.RCornerTextFeild();
        greenButton5 = new com.manujaya.components.GreenButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        roundTextFeild1 = new com.manujaya.components.RoundTextFeild();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setPreferredSize(new java.awt.Dimension(1064, 380));
        jPanel1.setLayout(new java.awt.BorderLayout(10, 10));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "No", "Pkya", "2024.01.01", "2024.09.09", "Pkya", "Yes"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Audit Type", "Auditor", "Start Date", "End Date", "Finding Summery", "Action"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Audit Type");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Auditor");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Start Date");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("End Date");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Finding Summery");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Action");
        }

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(43, 149, 70));
        jPanel2.setPreferredSize(new java.awt.Dimension(1064, 180));

        jPanel4.setPreferredSize(new java.awt.Dimension(1064, 40));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(270, 40));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel9.setPreferredSize(new java.awt.Dimension(270, 40));
        jPanel9.setLayout(new java.awt.BorderLayout());

        greenButton4.setText("Add +");
        greenButton4.setPreferredSize(new java.awt.Dimension(100, 45));
        jPanel9.add(greenButton4, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel9, java.awt.BorderLayout.LINE_END);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.GridLayout(0, 3, 5, 0));

        upperCornerRoundButton3.setText("upperCornerRoundButton3");
        jPanel10.add(upperCornerRoundButton3);

        upperCornerRoundButton5.setText("upperCornerRoundButton5");
        jPanel10.add(upperCornerRoundButton5);

        upperCornerRoundButton6.setText("upperCornerRoundButton6");
        jPanel10.add(upperCornerRoundButton6);

        jPanel4.add(jPanel10, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 1, 3, 1));
        jPanel3.setMinimumSize(new java.awt.Dimension(1064, 40));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(400, 40));
        jPanel6.setLayout(new java.awt.BorderLayout(5, 0));

        rCornerTextFeild1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));
        rCornerTextFeild1.setText("Enter ID or Name ...");
        jPanel6.add(rCornerTextFeild1, java.awt.BorderLayout.CENTER);

        greenButton5.setBackground(new java.awt.Color(255, 255, 255));
        greenButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manujaya/img/search.png"))); // NOI18N
        greenButton5.setMaximumSize(new java.awt.Dimension(45, 45));
        greenButton5.setMinimumSize(new java.awt.Dimension(45, 45));
        greenButton5.setPreferredSize(new java.awt.Dimension(34, 34));
        jPanel6.add(greenButton5, java.awt.BorderLayout.LINE_END);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel5, java.awt.BorderLayout.LINE_START);

        jPanel3.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel7.setLayout(new java.awt.BorderLayout(5, 5));

        roundTextFeild1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        roundTextFeild1.setText("11");
        roundTextFeild1.setPreferredSize(new java.awt.Dimension(34, 34));
        roundTextFeild1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundTextFeild1ActionPerformed(evt);
            }
        });
        jPanel7.add(roundTextFeild1, java.awt.BorderLayout.LINE_START);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Auditors");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jLabel2.setIconTextGap(6);
        jLabel2.setMinimumSize(new java.awt.Dimension(30, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 40));
        jPanel7.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel11, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void roundTextFeild1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundTextFeild1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundTextFeild1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.manujaya.components.GreenButton greenButton4;
    private com.manujaya.components.GreenButton greenButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.manujaya.components.RCornerTextFeild rCornerTextFeild1;
    private com.manujaya.components.RoundTextFeild roundTextFeild1;
    private com.manujaya.components.UpperCornerRoundButton upperCornerRoundButton3;
    private com.manujaya.components.UpperCornerRoundButton upperCornerRoundButton5;
    private com.manujaya.components.UpperCornerRoundButton upperCornerRoundButton6;
    // End of variables declaration//GEN-END:variables
}