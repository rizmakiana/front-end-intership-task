package com.unindra.util;

import javax.swing.ImageIcon;

/**
 *
 * @author rizmakiana
 */
public class AppManager {

    private static final String urlIcon = "/assets/images/icon.png";

    public static ImageIcon getImageIcon() {
        return new ImageIcon(AppManager.class.getResource(urlIcon));
    }
}
