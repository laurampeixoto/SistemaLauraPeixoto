/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.LmpUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laura
 */
public class LmpControllerUsuarios extends AbstractTableModel {
    private List lstUsuarios;

    public void setList(List lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }
    
    public LmpUsuarios getBean(int rowIndex) {
        return (LmpUsuarios) lstUsuarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstUsuarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LmpUsuarios lmpUsuarios = (LmpUsuarios) lstUsuarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return lmpUsuarios.getLmpIdCodigo();
        } else if (columnIndex ==1) {
            return lmpUsuarios.getLmpNome();        
        } else if (columnIndex ==2) {
            return lmpUsuarios.getLmpApelido();
        } else if (columnIndex ==3) {
            return lmpUsuarios.getLmpCpf();
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
            return "Apelido";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
}
