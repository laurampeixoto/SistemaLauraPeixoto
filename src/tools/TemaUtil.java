package tools;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import javax.swing.*;

public class TemaUtil {

    private static boolean modoEscuroAtivo = false;

   
    public static void alternarTema(Window janela) {
        if (!modoEscuroAtivo) {
            aplicarModoEscuro(janela);
            modoEscuroAtivo = true;
        } else {
            aplicarModoClaro(janela);
            modoEscuroAtivo = false;
        }
    }

  
    private static void aplicarModoEscuro(Window janela) {
        Container container = getContainer(janela);
        if (container == null) return;

        container.setBackground(new Color(15, 10, 10)); 

        for (Component comp : container.getComponents()) {
            if (comp instanceof JLabel) {
                comp.setForeground(new Color(255, 230, 235)); 
            } else if (comp instanceof JButton) {
                comp.setBackground(new Color(60, 10, 20));
                comp.setForeground(Color.WHITE);
            } else if (comp instanceof JTextField) {
                comp.setBackground(new Color(35, 20, 25)); 
                comp.setForeground(new Color(255, 230, 235));
            } else if (comp instanceof JPanel) {
                comp.setBackground(new Color(20, 15, 15)); 
            }
        }

        container.repaint();
    }


    private static void aplicarModoClaro(Window janela) {
        Container container = getContainer(janela);
        if (container == null) return;

        container.setBackground(Color.WHITE);

        for (Component comp : container.getComponents()) {
            if (comp instanceof JLabel) {
                comp.setForeground(Color.BLACK);
            } else if (comp instanceof JButton) {
                comp.setBackground(new Color(230, 230, 230));
                comp.setForeground(Color.BLACK);
            } else if (comp instanceof JTextField) {
                comp.setBackground(Color.WHITE);
                comp.setForeground(Color.BLACK);
            } else if (comp instanceof JPanel) {
                comp.setBackground(Color.WHITE);
            }
        }

        container.repaint();
    }


    private static Container getContainer(Window janela) {
        if (janela instanceof JFrame)
            return ((JFrame) janela).getContentPane();
        else if (janela instanceof JDialog)
            return ((JDialog) janela).getContentPane();
        else
            return null;
    }
}
