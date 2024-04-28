
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Msys
 */
public class FrAll extends javax.swing.JFrame {

  public  phome p;
  public pfirst f;
  public porder o;
  public pbuy b;
  public psale s;
  public pemployee e;
  public ptime t;
    public FrAll() {
        this.setLayout(new BorderLayout());
      //  initComponents();
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setVisible(true);
     f=new pfirst(); s=new psale();
      p=new phome();e=new pemployee();
      o=new porder();t=new ptime();
      b=new pbuy();
      
       this.add(p,BorderLayout.EAST);
   
     
       
    
        this.add(f,BorderLayout.CENTER);
      
        
  // this.setSize(1500, 720);
    
    this.setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
   
    
    }

    public void ad(JPanel p){
    this.add(p,BorderLayout.CENTER);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1446, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1222, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
