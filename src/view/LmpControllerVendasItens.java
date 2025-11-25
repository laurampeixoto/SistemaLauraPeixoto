/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LmpVendasItens;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class LmpControllerVendasItens extends AbstractTableModel {

    private List lstVendasItens;

    public void setList(List lstVendasItens) {
        this.lstVendasItens = lstVendasItens;
        
        this.fireTableDataChanged();
    }
    
    public LmpVendasItens getBean(int rowIndex) {
        return (LmpVendasItens) lstVendasItens.get(rowIndex);
    }

    public void addBean(LmpVendasItens lmpVendasItens) {
        lstVendasItens.add(lmpVendasItens);
        this.fireTableDataChanged();
    }
    
    public void removeBean(int rowIndex) {
        lstVendasItens.remove(rowIndex);
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return lstVendasItens.size();                
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LmpVendasItens lmpVendasItens = (LmpVendasItens) lstVendasItens.get( rowIndex);
        if ( columnIndex == 0 ){
            return lmpVendasItens.getLmpIdItemVendido();
        } else if (columnIndex ==1) {
            return lmpVendasItens.getLmpProduto();
        } else if (columnIndex ==2) {
            return lmpVendasItens.getLmpQuantidade();
        } else if (columnIndex ==3) {
            return lmpVendasItens.getLmpPrecoUnitario();
        }else if (columnIndex ==4) {
            return lmpVendasItens.getLmpPrecoUnitario()*lmpVendasItens.getLmpQuantidade();
        }
        return ""; 
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Produto";         
        } else if ( columnIndex == 2) {
            return "Quantidade";
        } else if ( columnIndex == 3) {
            return "Valor Unitário";
        } else if ( columnIndex == 4) {
            return "Total";
        } 
        return "";
    }
}
