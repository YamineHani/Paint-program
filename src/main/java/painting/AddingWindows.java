/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package painting;

import javax.swing.JTextField;



/**
 *
 * @author yasmi
 */
public interface AddingWindows {
    

    public int[] getTextFields();
    public boolean isValid(JTextField str);
    public void clearTextField();
    public String[] textFields();
    public boolean validation(JTextField[] textFields);
    public  JTextField[] jTextFields();

}


