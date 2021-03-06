package com.elle.analyster.presentation;

import com.elle.analyster.logic.BaseTab;
import com.elle.analyster.logic.TableFilter;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Louis W.
 * @author Carlos Igreja
 * @author Xiaoqian Fu
 * @since June 10, 2015
 * @version 0.6.3
 */
public class BatchEditWindow extends JFrame {

    // attributes
    private AnalysterWindow analysterWindow;
    private JTable table;
    private BaseTab tab;

    /**
     * CONSTRUCTOR Creates new BatchEditWindow
     *
     * @param selectedTable
     * @param analysterWindow
     */
    public BatchEditWindow(BaseTab tab) {
        initComponents();
        analysterWindow = AnalysterWindow.getInstance();
        this.tab = tab;
        table = tab.getTable();
      String[] batchEditFields = tab.getBatchEditFields();
        DefaultComboBoxModel model = new DefaultComboBoxModel(batchEditFields);
        comboBoxFieldSelect.setModel(model);

        this.setFocusTraversalKeysEnabled(true);
        setKeyboardFocusManager();
        // set the interface to the middle of the window
        this.setLocationRelativeTo(analysterWindow);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // quit button should be used

        this.setTitle("Batch Editor");
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
        comboBoxFieldSelect = new javax.swing.JComboBox();
        textFieldNewValue = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        comboBoxFieldSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "analyst", "priority", "dateAssigned", "dateDone", "notes" }));

        textFieldNewValue.setText("Please enter new value");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxFieldSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxFieldSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnConfirm)
                    .addComponent(btnClose))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * clears the text field
     *
     * @param evt
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        textFieldNewValue.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * submit changes to the database
     *
     * @param evt
     */
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        String columnName = comboBoxFieldSelect.getSelectedItem().toString();      // column name   
        String newValue = textFieldNewValue.getText();                             // new value to replace old value(s)
        int[] rows = table.getSelectedRows();                                      // selected rows
        int columnIndex;                                                           // column index
        int rowIndex;                                                              // row index
        int rowCount = table.getSelectedRowCount();                                // number of rows
        if(rowCount == 0)
        {
            //Show error message;
            JOptionPane.showMessageDialog(this,
                    "No rows selected",
                    "Error Message",
                   JOptionPane.ERROR_MESSAGE);
            closeWindow();
        }
        else
        {
        // get column index for the combobox selection
        for (columnIndex = 0; columnIndex < table.getColumnCount(); columnIndex++) {
            if (columnName.equals(table.getColumnName(columnIndex))) {
                break;
            }
        }

        // set the value to the table model
        // this also envokes the TableModelListener 
        // and adds the change to the mofified data list for the table
        for (rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            table.setValueAt(newValue, rows[rowIndex], columnIndex);
        }

        // Add any new changes to be filtered as well
        // so that the records modified do not disappear after the upload.
        TableFilter filter = tab.getFilter();

        // get the filter items for this column
        ArrayList<Object> filterItems
                = new ArrayList<>(filter.getFilterItems().get(columnIndex));

        if (!filterItems.isEmpty()) {
            if (!filterItems.contains(newValue)) {

                // add item to the array
                filterItems.add(newValue);

                // add the array to the filter items list
                filter.addFilterItems(columnIndex, filterItems);
            }
        }
        //Show error message;
            //Show error message;
            int result = JOptionPane.showConfirmDialog(this,
                    "Update "+rowCount+" rows.",
                    "Update database ",
                   JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION)
            {
                tab.uploadChanges();
                closeWindow();
            }
            else
            {
                //do nothing   
            }
        
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    /**
     * This terminates the window and returns resources
     *
     * @param evt
     */
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        closeWindow();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void closeWindow(){
        
        analysterWindow.setEnabled(true);
        this.dispose();
        
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        closeWindow();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox comboBoxFieldSelect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFieldNewValue;
    // End of variables declaration//GEN-END:variables

    private void setKeyboardFocusManager() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {

            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_D && e.isControlDown()) {
                    String columnName = comboBoxFieldSelect.getSelectedItem().toString();      // column name  
                    System.out.println("control d pressed! " + columnName);
                    if (columnName.contains("date")) {
                        if (e.getID() == 401 ) {
//                            System.out.println("a");
                            // 401 = key down, 402 = key released
                            textFieldNewValue.requestFocusInWindow();
                            textFieldNewValue.selectAll();
                            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = new Date();
                            String today = dateFormat.format(date);
                            System.out.println(today);
                            textFieldNewValue.setText(today);
                        }
                    }
                }
                return false;
            }
            
        });
    }
}
