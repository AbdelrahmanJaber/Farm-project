
import java.awt.BorderLayout;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Msys
 */
public class phome extends javax.swing.JPanel {
    //connecting
    private static  Frlogin pointer;
    public static void fun(Frlogin r){
    pointer =r;
    }
    //end connecting
    
    public phome() {
        initComponents();
     //   pointer =new Frlogin();
     lebhome.setForeground(Color.BLUE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lebhome = new javax.swing.JLabel();
        leborder = new javax.swing.JLabel();
        lebbuy = new javax.swing.JLabel();
        lebsale = new javax.swing.JLabel();
        lebemployee = new javax.swing.JLabel();
        lebtime = new javax.swing.JLabel();
        lebout = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));
        setToolTipText("");

        lebhome.setBackground(new java.awt.Color(255, 51, 0));
        lebhome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lebhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/house (1).png"))); // NOI18N
        lebhome.setText("الصفحة الرئيسية");
        lebhome.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lebhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lebhomeMousePressed(evt);
            }
        });

        leborder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        leborder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/order.png"))); // NOI18N
        leborder.setText("الطلبيات");
        leborder.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        leborder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                leborderMousePressed(evt);
            }
        });

        lebbuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lebbuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shopping-cart.png"))); // NOI18N
        lebbuy.setText("المشتريات");
        lebbuy.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lebbuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lebbuyMousePressed(evt);
            }
        });

        lebsale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lebsale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/money.png"))); // NOI18N
        lebsale.setText("المبيعات");
        lebsale.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lebsale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lebsaleMousePressed(evt);
            }
        });

        lebemployee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lebemployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/employee.png"))); // NOI18N
        lebemployee.setText("الموظفين");
        lebemployee.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lebemployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lebemployeeMousePressed(evt);
            }
        });

        lebtime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lebtime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/stopwatch.png"))); // NOI18N
        lebtime.setText("اوقات الري");
        lebtime.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lebtime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lebtimeMousePressed(evt);
            }
        });

        lebout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lebout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit-door.png"))); // NOI18N
        lebout.setText("خروج");
        lebout.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lebout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                leboutMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lebout)
                    .addComponent(lebtime)
                    .addComponent(lebemployee)
                    .addComponent(lebsale)
                    .addComponent(lebbuy)
                    .addComponent(leborder)
                    .addComponent(lebhome))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lebhome)
                .addGap(32, 32, 32)
                .addComponent(leborder)
                .addGap(39, 39, 39)
                .addComponent(lebbuy)
                .addGap(38, 38, 38)
                .addComponent(lebsale)
                .addGap(38, 38, 38)
                .addComponent(lebemployee)
                .addGap(39, 39, 39)
                .addComponent(lebtime)
                .addGap(37, 37, 37)
                .addComponent(lebout)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lebhomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lebhomeMousePressed
pointer.all.o.setVisible(false);pointer.all.b.setVisible(false);pointer.all.s.setVisible(false);
pointer.all.e.setVisible(false);pointer.all.t.setVisible(false);pointer.all.f.setVisible(true);
        pointer.all.add(pointer.all.f,BorderLayout.CENTER);
       lebhome.setForeground(Color.BLUE);
       leborder.setForeground(Color.black);
       lebsale.setForeground(Color.black);
       lebbuy.setForeground(Color.black);
       lebtime.setForeground(Color.black);
       lebemployee.setForeground(Color.black);
       
    }//GEN-LAST:event_lebhomeMousePressed

    private void leborderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leborderMousePressed
pointer.all.f.setVisible(false);pointer.all.b.setVisible(false);pointer.all.s.setVisible(false);
pointer.all.e.setVisible(false);pointer.all.t.setVisible(false);pointer.all.o.setVisible(true);
 pointer.all.add(pointer.all.o,BorderLayout.CENTER);
        lebhome.setForeground(Color.black);
       leborder.setForeground(Color.BLUE);
       lebsale.setForeground(Color.black);
       lebbuy.setForeground(Color.black);
       lebtime.setForeground(Color.black);
       lebemployee.setForeground(Color.black);
    }//GEN-LAST:event_leborderMousePressed

    private void lebbuyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lebbuyMousePressed
     pointer.all.o.setVisible(false);pointer.all.f.setVisible(false);pointer.all.s.setVisible(false);
pointer.all.e.setVisible(false);pointer.all.t.setVisible(false);pointer.all.b.setVisible(true);
        pointer.all.add(pointer.all.b,BorderLayout.CENTER);
      lebhome.setForeground(Color.black);
       leborder.setForeground(Color.black);
       lebsale.setForeground(Color.black);
       lebbuy.setForeground(Color.BLUE);
       lebtime.setForeground(Color.black);
       lebemployee.setForeground(Color.black);
    }//GEN-LAST:event_lebbuyMousePressed

    private void lebsaleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lebsaleMousePressed
      pointer.all.o.setVisible(false);pointer.all.b.setVisible(false);pointer.all.f.setVisible(false);
pointer.all.e.setVisible(false);pointer.all.t.setVisible(false);pointer.all.s.setVisible(true);
        pointer.all.add(pointer.all.s,BorderLayout.CENTER);
       lebhome.setForeground(Color.black);
       leborder.setForeground(Color.black);
       lebsale.setForeground(Color.BLUE);
       lebbuy.setForeground(Color.black);
       lebtime.setForeground(Color.black);
       lebemployee.setForeground(Color.black);
    }//GEN-LAST:event_lebsaleMousePressed

    private void lebemployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lebemployeeMousePressed
   pointer.all.o.setVisible(false);pointer.all.b.setVisible(false);pointer.all.s.setVisible(false);
pointer.all.f.setVisible(false);pointer.all.t.setVisible(false);pointer.all.e.setVisible(true);
        pointer.all.add(pointer.all.e,BorderLayout.CENTER);
        lebhome.setForeground(Color.black);
       leborder.setForeground(Color.black);
       lebsale.setForeground(Color.black);
       lebbuy.setForeground(Color.black);
       lebtime.setForeground(Color.black);
       lebemployee.setForeground(Color.BLUE);
    }//GEN-LAST:event_lebemployeeMousePressed

    private void lebtimeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lebtimeMousePressed
 pointer.all.o.setVisible(false);pointer.all.b.setVisible(false);pointer.all.s.setVisible(false);
pointer.all.e.setVisible(false);pointer.all.f.setVisible(false);pointer.all.t.setVisible(true);
        pointer.all.add(pointer.all.t,BorderLayout.CENTER);
     lebhome.setForeground(Color.black);
       leborder.setForeground(Color.black);
       lebsale.setForeground(Color.black);
       lebbuy.setForeground(Color.black);
       lebtime.setForeground(Color.blue);
       lebemployee.setForeground(Color.black);
    }//GEN-LAST:event_lebtimeMousePressed

    private void leboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leboutMousePressed
       
        pointer.all.dispose();
      pointer.setVisible(true);
      
   
        
    }//GEN-LAST:event_leboutMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lebbuy;
    private javax.swing.JLabel lebemployee;
    private javax.swing.JLabel lebhome;
    private javax.swing.JLabel leborder;
    private javax.swing.JLabel lebout;
    private javax.swing.JLabel lebsale;
    private javax.swing.JLabel lebtime;
    // End of variables declaration//GEN-END:variables
}
