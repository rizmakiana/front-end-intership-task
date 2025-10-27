package com.unindra.util;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author rizmakiana
 */
public class Formatter {
    
    public static String formatToIndonesian(String amount) {
        try {
            double value = Double.parseDouble(amount);
            NumberFormat formatter = NumberFormat.getNumberInstance(new Locale("id", "ID"));
            return formatter.format(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number: " + amount);
        }
    }
    
    public static String formatToRegularString(String amount){
        return amount.replace(".", "");
    }
    
    public static String formatToRupiah(String input) {
    try {
        // Hapus spasi dan pastikan hanya angka
        String cleaned = input.trim().replaceAll("[^\\d]", "");
        if (cleaned.isEmpty()) return "0";

        long value = Long.parseLong(cleaned);

        // Formatter locale Indonesia (tanpa simbol Rp)
        java.text.NumberFormat formatter = java.text.NumberFormat.getInstance(new java.util.Locale("id", "ID"));
        return formatter.format(value);
    } catch (NumberFormatException e) {
        return input; // Jika bukan angka, kembalikan input asli
    }
}

}
