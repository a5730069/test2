package javaapplication15;
 
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * Custom renderer to display a country's flag alongside its name
 *
 * @author wwww.codejava.net
 */
public class CountryRenderer extends JLabel implements ListCellRenderer<Country> {
 
    public CountryRenderer() {
        setOpaque(true);
    }
 
    @Override
    public Component getListCellRendererComponent(JList<? extends Country> list, Country country, int index,
            boolean isSelected, boolean cellHasFocus) {
 
        String code = country.getCode();
        ImageIcon imageIcon = new ImageIcon(getClass().getResource( code + ".jpg"));
 
        setIcon(imageIcon);
        setText(country.getName());
 
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
 
        return this;
    }
}