/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.LmpClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laura
 */
public class LmpControllerClientes extends AbstractTableModel {
    private List lstClientes;

    public void setList(List lstClientes) {
        this.lstClientes = lstClientes;
    }
    
    public LmpClientes getBean(int rowIndex) {
        return (LmpClientes) lstClientes.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstClientes.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LmpClientes lmpClientes = (LmpClientes) lstClientes.get( rowIndex);
        if ( columnIndex == 0 ){
            return lmpClientes.getLmpIdCodigo();
        } else if (columnIndex ==1) {
            return lmpClientes.getLmpNome();        
        } else if (columnIndex ==2) {
            return lmpClientes.getLmpEmail();
        } else if (columnIndex ==3) {
            return lmpClientes.getLmpCpf();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Email";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
}
