/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.LmpProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laura
 */
public class LmpControllerProduto extends AbstractTableModel {
    private List lstProduto;

    public void setList(List lstProduto) {
        this.lstProduto = lstProduto;
    }
    
    public LmpProduto getBean(int rowIndex) {
        return (LmpProduto) lstProduto.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstProduto.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LmpProduto lmpProduto = (LmpProduto) lstProduto.get( rowIndex);
        if ( columnIndex == 0 ){
            return lmpProduto.getLmpIdCodigoProduto();
        } else if (columnIndex ==1) {
            return lmpProduto.getLmpNome();        
        } else if (columnIndex ==2) {
            return lmpProduto.getLmpDescricao();
        } else if (columnIndex ==3) {
            return lmpProduto.getLmpPreco();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código do Produto";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Descrição";
        } else if ( columnIndex == 3) {
            return "Preço";
        } 
        return "";
    }
}
