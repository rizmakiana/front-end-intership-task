package com.unindra.component;

import com.unindra.model.response.RegionResponse;
import javax.swing.JComboBox;

/**
 *
 * @author rizmakiana
 */
public class RegionComboBox extends JComboBox<RegionResponse>{
    
    public RegionComboBox() {
        super();
    }

    // Bisa tambahin helper biar gampang
    public void setItems(java.util.List<RegionResponse> items) {
        this.removeAllItems();
        for (RegionResponse r : items) {
            this.addItem(r);
        }
    }

    public RegionResponse getSelectedRegion() {
        return (RegionResponse) this.getSelectedItem();
    }

}
