package com.unindra.component;

import com.unindra.school.app.model.response.RegionResponse;
import javax.swing.JComboBox;

/**
 *
 * @author rizmakiana
 */
public class RegionComboBox extends JComboBox<RegionResponse>{

    public void setSelectedById(String id) {
        if (id == null) return;

        for (int i = 0; i < getItemCount(); i++) {
            RegionResponse item = getItemAt(i);
            if (item != null && id.equals(item.getId())) {
                setSelectedIndex(i);
                return;
            }
        }
    }

    
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
