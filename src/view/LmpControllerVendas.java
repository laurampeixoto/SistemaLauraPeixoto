/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.LmpVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laura
 */
public class LmpControllerVendas extends AbstractTableModel {
    private List lstlmpVendas;

    public void setList(List lstlmpVendas) {
        this.lstlmpVendas = lstlmpVendas;
    }
    
    public LmpVendas getBean(int rowIndex) {
        return (LmpVendas) lstlmpVendas.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstlmpVendas.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LmpVendas lmpVendas = (LmpVendas) lstlmpVendas.get( rowIndex);
        if ( columnIndex == 0 ){
            return lmpVendas.getLmpIdnumeroVenda();
        } else if (columnIndex ==1) {
            return lmpVendas.getLmpCodigo();        
        } else if (columnIndex ==2) {
            return lmpVendas.getLmpDataVenda();
        } else if (columnIndex ==3) {
            return lmpVendas.getLmpValorTotal();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Número de Venda";
        } else if ( columnIndex == 1) {
            return "Código";         
        } else if ( columnIndex == 2) {
            return "Data de Venda";
        } else if ( columnIndex == 3) {
            return "Valor Total";
        } 
        return "";
    }
}
