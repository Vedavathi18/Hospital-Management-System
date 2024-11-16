package Receptionists;

import Admins.ReceptionistManagement;
import Main.Connector;
import Main.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Ali
 */
public class searchReceptionist extends javax.swing.JFrame {

    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public searchReceptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
        Object columns[] = {"Id", "Name", "Age", "Gender", "Email Address", "Phone Number","Status", "Joining Date","Address", "Salary"};
        defaultTableModel.setColumnIdentifiers(columns);
        SearchReceptionistTable.setModel(defaultTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rSearchField = new javax.swing.JTextField();
        SearchjPanel1 = new javax.swing.JPanel();
        SearchjLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchReceptionistTable = new javax.swing.JTable();
        DeleteReceptionistjPanel = new javax.swing.JPanel();
        DeleteReceptionistPanel = new javax.swing.JLabel();
        BackgroundImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Receptionist !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Search Receptionist");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shutdown.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back-arrow-48.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addContainerGap(31, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1262, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name of Receptionist");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        rSearchField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rSearchField.setForeground(new java.awt.Color(0, 0, 0));
        rSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSearchFieldActionPerformed(evt);
            }
        });
        rSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rSearchFieldKeyPressed(evt);
            }
        });
        getContentPane().add(rSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 460, 40));

        SearchjPanel1.setBackground(new java.awt.Color(153, 153, 153));
        SearchjPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SearchjPanel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SearchjPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchjPanel1MouseClicked(evt);
            }
        });

        SearchjLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SearchjLabel2.setForeground(new java.awt.Color(255, 255, 255));
        SearchjLabel2.setText("Search");
        SearchjLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchjLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SearchjPanel1Layout = new javax.swing.GroupLayout(SearchjPanel1);
        SearchjPanel1.setLayout(SearchjPanel1Layout);
        SearchjPanel1Layout.setHorizontalGroup(
            SearchjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchjPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(SearchjLabel2)
                .addGap(19, 19, 19))
        );
        SearchjPanel1Layout.setVerticalGroup(
            SearchjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchjPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchjLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(SearchjPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, -1, -1));

        SearchReceptionistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(SearchReceptionistTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 157, 1262, 325));

        DeleteReceptionistjPanel.setBackground(new java.awt.Color(102, 102, 102));
        DeleteReceptionistjPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        DeleteReceptionistjPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteReceptionistjPanelMouseClicked(evt);
            }
        });

        DeleteReceptionistPanel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DeleteReceptionistPanel.setForeground(new java.awt.Color(255, 255, 255));
        DeleteReceptionistPanel.setText("Delete");
        DeleteReceptionistPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteReceptionistPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DeleteReceptionistjPanelLayout = new javax.swing.GroupLayout(DeleteReceptionistjPanel);
        DeleteReceptionistjPanel.setLayout(DeleteReceptionistjPanelLayout);
        DeleteReceptionistjPanelLayout.setHorizontalGroup(
            DeleteReceptionistjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteReceptionistjPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(DeleteReceptionistPanel)
                .addGap(19, 19, 19))
        );
        DeleteReceptionistjPanelLayout.setVerticalGroup(
            DeleteReceptionistjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteReceptionistjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteReceptionistPanel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(DeleteReceptionistjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 508, -1, -1));

        BackgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hospital_Image.jpg"))); // NOI18N
        BackgroundImageLabel.setText("jLabel2");
        getContentPane().add(BackgroundImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -1, 1260, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        ReceptionistManagement rm = new ReceptionistManagement();
        rm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void rSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSearchFieldActionPerformed

    private void SearchjLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchjLabel2MouseClicked
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String searchName = rSearchField.getText();
        String sql = "select r.id, r.name, i.age, i.gender, i.email, i.phone, i.status, i.date, i.address, r.salary\n" +
        "from info i\n" +
        "inner join receptionist r\n" +
        "on r.id = i.ReceptionistId\n" +
        "where r.name = '" + searchName + "'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[12];
            while (rs.next()) {
                columnData[0] = rs.getString("id");
                columnData[1] = rs.getString("name");
                columnData[2] = rs.getInt("age");
                columnData[3] = rs.getString("gender");
                columnData[4] = rs.getString("email");
                columnData[5] = rs.getString("phone");
                columnData[6] = rs.getString("status");
                columnData[7] = rs.getString("date");
                columnData[8] = rs.getString("address");
                columnData[9] = rs.getInt("salary");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SearchjLabel2MouseClicked

    private void SearchjPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchjPanel1MouseClicked
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String searchName = rSearchField.getText();
        String sql = "select r.id, r.name, i.age, i.gender, i.email, i.phone, i.status, i.date, i.address, r.salary\n" +
        "from info i\n" +
        "inner join receptionist r\n" +
        "on r.id = i.ReceptionistId\n" +
        "where r.name = '" + searchName + "'";
        try {
            ps = connection.prepareStatement(sql);
            System.out.println("Executing Query");
            Object columnData[] = new Object[12];
            while (rs.next()) {
                columnData[0] = rs.getString("id");
                columnData[1] = rs.getString("name");
                columnData[2] = rs.getInt("age");
                columnData[3] = rs.getString("gender");
                columnData[4] = rs.getString("email");
                columnData[5] = rs.getString("phone");
                columnData[6] = rs.getString("status");
                columnData[7] = rs.getString("date");
                columnData[8] = rs.getString("address");
                columnData[9] = rs.getInt("salary");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SearchjPanel1MouseClicked

    private void rSearchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rSearchFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSearchFieldKeyPressed

    private void DeleteReceptionistPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteReceptionistPanelMouseClicked
        //delete code here
        connection = Connector.ConnectDb();
        int row = SearchReceptionistTable.getSelectedRow();
        if (row >= 0) {
            String ReceptionistId = SearchReceptionistTable.getModel().getValueAt(row, 0).toString();
            String rName = SearchReceptionistTable.getModel().getValueAt(row, 1).toString();
            String sql = "Delete from receptionist where id ='" + ReceptionistId + "'";
            try {
                ps = connection.prepareStatement(sql);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Receptionist " + rName + " has been deleted");
                defaultTableModel.getDataVector().removeAllElements();
                defaultTableModel.fireTableDataChanged();
                //loadData();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Receptionist named " + rName + " not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    }//GEN-LAST:event_DeleteReceptionistPanelMouseClicked

    private void DeleteReceptionistjPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteReceptionistjPanelMouseClicked
        //Delete code here
        connection = Connector.ConnectDb();
        int row = SearchReceptionistTable.getSelectedRow();
        if (row >= 0) {
            String ReceptionistId = SearchReceptionistTable.getModel().getValueAt(row, 0).toString();
            String rName = SearchReceptionistTable.getModel().getValueAt(row, 1).toString();
            String sql = "Delete from receptionist where id ='" + ReceptionistId + "'";
            try {
                ps = connection.prepareStatement(sql);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Receptionist " + rName + " has been deleted");
                defaultTableModel.getDataVector().removeAllElements();
                defaultTableModel.fireTableDataChanged();
                //loadData();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Receptionist named " + rName + " not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    }//GEN-LAST:event_DeleteReceptionistjPanelMouseClicked
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new searchReceptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImageLabel;
    private javax.swing.JLabel DeleteReceptionistPanel;
    private javax.swing.JPanel DeleteReceptionistjPanel;
    private javax.swing.JTable SearchReceptionistTable;
    private javax.swing.JLabel SearchjLabel2;
    private javax.swing.JPanel SearchjPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rSearchField;
    // End of variables declaration//GEN-END:variables
}