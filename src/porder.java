
import java.text.SimpleDateFormat;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Msys
 */
public class porder extends javax.swing.JPanel {

    private DefaultTableModel model;
    private int row=0,counter=1,
            colmprice=0,colmdreach=1,colmdorder=2,colmip=3,colmphone=4,colmname=5,colmnum=6;
    private String title []={"اسم الزبون","ID","رقم الهاتف","اسم السف","حجمه","السعر","تاريخ الطلب","تاريخ التسليم"},
            data[]={"","","","","","","","","","",""};
   private boolean b=false;
    private JComboBox box;
    public porder() {
        initComponents();
        String Q[]={"مهدي","سوقي","عالم","محمود"};
      model = (DefaultTableModel) tableorder.getModel();
      box=new JComboBox(Q);
          tableorder.setShowGrid(true);
          tableorder.setRowHeight(20);
          tableitem.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(box));
        
            tableitem.setShowGrid(true);
            AutoCompleteDecorator.decorate(box);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableorder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fieldname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldphone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        datereach = new com.toedter.calendar.JDateChooser();
        dateorder = new com.toedter.calendar.JDateChooser();
        insert = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableitem = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 255));

        tableorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "السعر الكلي", "تاريخ الوصول", "تاريخ الطلب", "رقم الطلبية(IP)", "رقم الجوال", "اسم التاجر", "رقم"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableorder.setGridColor(new java.awt.Color(255, 153, 51));
        tableorder.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableorder);
        if (tableorder.getColumnModel().getColumnCount() > 0) {
            tableorder.getColumnModel().getColumn(6).setMinWidth(30);
            tableorder.getColumnModel().getColumn(6).setPreferredWidth(30);
            tableorder.getColumnModel().getColumn(6).setMaxWidth(30);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("اسم التاجر");

        fieldname.setColumns(10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("رقم الجوال");

        fieldphone.setColumns(10);
        fieldphone.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("تاريخ الطلب");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("تاريخ الوصول");

        datereach.setBackground(new java.awt.Color(102, 102, 255));
        datereach.setDateFormatString("dd, MM, yyyy");

        dateorder.setBackground(new java.awt.Color(102, 102, 255));
        dateorder.setDateFormatString("dd, MM, yyyy");

        insert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insert.setText("اضافة");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setText("حذف");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        tableitem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "السعر الكلي", "سعر الصنف", "العدد    ", "اسم الصنف"
            }
        ));
        tableitem.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableitem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldphone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datereach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(delete)
                        .addGap(82, 82, 82)
                        .addComponent(insert)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fieldphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(dateorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(datereach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insert, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        
        SimpleDateFormat simple =new SimpleDateFormat("dd-MM-YYYY");
         
         String h1=  simple.format(dateorder.getDate());
         String h2= simple.format(datereach.getDate());
    
        if(row<tableorder.getRowCount()&&!b){
           
        model.setValueAt(counter, row, colmnum);
        model.setValueAt(this.fieldname.getText(), row, colmname);
        model.setValueAt(this.fieldphone.getText(), row, colmphone);
       
        model.setValueAt(h1, row, colmdorder);
        model.setValueAt(h2, row, colmdreach);
        row++;counter++;}
       else{
            b=true;
       String s[]={""};
       model.addRow(s);
          model.setValueAt(counter, row, colmnum);
        model.setValueAt(this.fieldname.getText(), row, colmname);
        model.setValueAt(this.fieldphone.getText(), row, colmphone);
       
        model.setValueAt(h1, row, colmdorder);
        model.setValueAt(h2, row, colmdreach);
        row++;counter++;
       }
          
        
        
        
    }//GEN-LAST:event_insertActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
     
          int t[]=tableorder.getSelectedRows();
        
       int g=0;
        
        for(int i=0;i<t.length;i++){
        model.removeRow(t[i]);
      
       g++;
      
        }
        for(int i=0;i<g;i++){
        if(counter>1){  row--;counter--;}
         String s[]={""};
       model.addRow(s);
        
        }
        int c=tableorder.getRowCount();
        
        for(int j=0;j<row;j++){
         model.setValueAt(j+1, j, colmnum);
        }
        
        
    }//GEN-LAST:event_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateorder;
    private com.toedter.calendar.JDateChooser datereach;
    private javax.swing.JButton delete;
    private javax.swing.JTextField fieldname;
    private javax.swing.JTextField fieldphone;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableitem;
    private javax.swing.JTable tableorder;
    // End of variables declaration//GEN-END:variables
}
