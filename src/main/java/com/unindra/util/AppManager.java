package com.unindra.util;

import com.unindra.model.response.TokenResponse;
import javax.swing.ImageIcon;

/**
 *
 * @author rizmakiana
 */
public class AppManager {

    private static final String urlIcon = "/assets/images/icon.png";
    
    private final static String webName = "http://localhost:8080";
    
    private static TokenResponse token;

    public static ImageIcon getImageIcon() {
        return new ImageIcon(AppManager.class.getResource(urlIcon));
    }

    public static String getWebName() {
        return webName;
    }

    public static void setToken(TokenResponse token) {
        AppManager.token = token;
    }

    public static TokenResponse getToken() {
        return token;
    }
    
}
