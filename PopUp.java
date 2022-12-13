// Priyanshu Shekhar
// Professor Sun 
// CS 3560 
// 13 December 2022

import javax.swing.*;

public class PopUp {

  public void infoBox(String infoMessage, String titleBar) {
    JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
  }
}
