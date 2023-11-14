/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package painting;

import java.awt.Color;
import java.awt.Point;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import shapes.Triangle;


/**
 *
 * @author yasmi
 */
public class NewTriangle extends javax.swing.JFrame implements Node, AddingWindows{
     private Node parent;
    private Color fillingColor= Color.BLACK;
    private Color color= Color.BLACK;
    private  Triangle triangle;
    private JComboBox shapesBox;
    private MyPanel myPanel;
    /**
     * Creates new form NewTriangle
     */
     public NewTriangle(){
        
    }
    public NewTriangle(JComboBox shapesBox, MyPanel myPanel) {
        initComponents();
        this.shapesBox = shapesBox;
        this.myPanel = myPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        x3TextField = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        fillColor = new java.awt.Button();
        label4 = new java.awt.Label();
        y3TextField = new javax.swing.JTextField();
        borderColor = new java.awt.Button();
        createTriangle = new java.awt.Button();
        y2TextField = new javax.swing.JTextField();
        x1TextField = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        x2TextField = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        y1TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("New triangle");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("X1");

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Y2");

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("X3");

        fillColor.setBackground(new java.awt.Color(0, 0, 0));
        fillColor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        fillColor.setForeground(new java.awt.Color(255, 255, 255));
        fillColor.setLabel("fill color");
        fillColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillColorActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setText("Y3");

        borderColor.setBackground(new java.awt.Color(51, 51, 51));
        borderColor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        borderColor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        borderColor.setForeground(new java.awt.Color(255, 255, 255));
        borderColor.setLabel("border color");
        borderColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borderColorActionPerformed(evt);
            }
        });

        createTriangle.setBackground(new java.awt.Color(0, 0, 0));
        createTriangle.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        createTriangle.setForeground(new java.awt.Color(255, 255, 255));
        createTriangle.setLabel("create triangle");
        createTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTriangleActionPerformed(evt);
            }
        });

        x1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1TextFieldActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setName(""); // NOI18N
        label5.setText("X2");

        x2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2TextFieldActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label6.setName(""); // NOI18N
        label6.setText("Y1");

        y1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y1TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fillColor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borderColor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x3TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y2TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x1TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y3TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y1TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(createTriangle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(x1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(x2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(x3TextField))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fillColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borderColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillColorActionPerformed
        // TODO add your handling code here:
        fillingColor = JColorChooser.showDialog(null, "Choose fill color", Color.BLACK);
    }//GEN-LAST:event_fillColorActionPerformed

    private void borderColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borderColorActionPerformed
        // TODO add your handling code here:
        color = JColorChooser.showDialog(null, "Choose border color", Color.BLACK);
    }//GEN-LAST:event_borderColorActionPerformed

    private void createTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTriangleActionPerformed
        // TODO add your handling code here:
        if(validation(jTextFields())){
            this.setVisible(false);
            ((JFrame)getParentNode()).setVisible(true);
            int[]arr = getTextFields();
            Point p1 = new Point(arr[0], arr[1]);
            Point p2 = new Point(arr[2],arr[3]);
            Point p3 = new Point(arr[4],arr[5]);
            triangle= new Triangle(++MiniPaint.counter, p1,p2,p3);
            triangle.setColor(color);
            triangle.setFillColor(fillingColor);
            myPanel.addShape(triangle);
            shapesBox.addItem(triangle);
          //  triangle.draw(myPanel.getGraphics());
            myPanel.refresh(myPanel.getGraphics());

        }
        
    }//GEN-LAST:event_createTriangleActionPerformed

    private void x1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x1TextFieldActionPerformed

    private void x2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x2TextFieldActionPerformed

    private void y1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y1TextFieldActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         clearTextField();
        this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewTriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTriangle().setVisible(true);
            }
        });
    }
     
          @Override
        public boolean validation(JTextField[] textFields){
        for (JTextField textField : textFields) {
            if (isValid(textField) == false) {
                return false;
            }
        }
         return true;
        }
   @Override
        public  JTextField[] jTextFields(){
            JTextField[] arr = new JTextField[6];
            arr[0]= x1TextField;
            arr[1]= y2TextField;
            arr[2]= x2TextField;
            arr[3] =y2TextField;
            arr[4]= x3TextField;
            arr[5] =y3TextField;
            
            return arr;
        }  
          
    @Override
        public boolean isValid(JTextField textField){ //handle floating point
        String number = textField.getText();
        if(number.isBlank()){ //empty
            textField.setText("Enter Data");
            return false;
        }
        if(number.contains("-")){
            textField.setText("+ve Data");
            return false; //-ve number
        }
         for (int i = 0; i < number.length(); i++){
             if (Character.isDigit((number.charAt(i))) == false){
                 textField.setText("non numeric");
                   return false;
             }
         } //when one non numeric value is found, return false
         
             return true;
    }
     @Override
        public String[] textFields(){
            String[ ] str = new String[6];
            str[0]= x1TextField.getText();
            str[1]= y1TextField.getText();
            str[2]= x2TextField.getText();
            str[3]= y2TextField.getText();
            str[4]= x3TextField.getText();
            str[5]= y3TextField.getText();
            
           return str;
        } 
        
         @Override
    public int[] getTextFields() {
        String[]str = textFields();
        int[] arr = new int[6];
        for(int i = 0; i<textFields().length;i++){
            arr[i]= Integer.parseInt(str[i]);
        }
        
       return arr;
    }
        @Override
    public void clearTextField(){
        x1TextField.setText("");
        y1TextField.setText("");
        x2TextField.setText("");
        y2TextField.setText("");
        x3TextField.setText("");
        y3TextField.setText("");
    }


     @Override
    public Node getParentNode() {
        return parent;
    }
    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button borderColor;
    private java.awt.Button createTriangle;
    private java.awt.Button fillColor;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTextField x1TextField;
    private javax.swing.JTextField x2TextField;
    private javax.swing.JTextField x3TextField;
    private javax.swing.JTextField y1TextField;
    private javax.swing.JTextField y2TextField;
    private javax.swing.JTextField y3TextField;
    // End of variables declaration//GEN-END:variables
}
