package com.unindra;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.unindra.view.LoginView;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

	public static void main(String[] args) throws UnsupportedLookAndFeelException {
            
            UIManager.setLookAndFeel(new FlatMacLightLaf());
	
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated( true );
            LoginView view = new LoginView();
            view.setVisible(true);
            
	}

}
