/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.LmpVendasItens;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laura
 */
public class LmpControllerVendasItens extends AbstractTableModel {
    private List lstlmpVendasItens;

    public void setList(List lstlmpVendasItensItens) {
        this.lstlmpVendasItens = lstlmpVendasItens;
    }
    
    public LmpVendasItens getBean(int rowIndex) {
        return (LmpVendasItens) lstlmpVendasItens.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstlmpVendasItens.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LmpVendasItens lmpVendasItens = (LmpVendasItens) lstlmpVendasItens.get( rowIndex);
        if ( columnIndex == 0 ){
            return lmpVendasItens.getLmpIdItemVendido();
        } else if (columnIndex ==1) {
            return lmpVendasItens.getLmpProduto();        
        } else if (columnIndex ==2) {
            return lmpVendasItens.getLmpQuantidade();
        } else if (columnIndex ==3) {
            return lmpVendasItens.getLmpPrecoUnitario();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Item Vendido";
        } else if ( columnIndex == 1) {
            return "Produto";         
        } else if ( columnIndex == 2) {
            return "Quantidade";
        } else if ( columnIndex == 3) {
            return "Preço Unitário";
        } 
        return "";
    }
}
