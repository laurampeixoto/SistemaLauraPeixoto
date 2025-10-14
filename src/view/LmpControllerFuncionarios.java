/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.LmpFuncionarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laura
 */
public class LmpControllerFuncionarios extends AbstractTableModel {
    private List lstFuncionarios;

    public void setList(List lstFuncionarios) {
        this.lstFuncionarios = lstFuncionarios;
    }
    
    public LmpFuncionarios getBean(int rowIndex) {
        return (LmpFuncionarios) lstFuncionarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstFuncionarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LmpFuncionarios lmpFuncionarios = (LmpFuncionarios) lstFuncionarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return lmpFuncionarios.getLmpIdFuncionario();
        } else if (columnIndex ==1) {
            return lmpFuncionarios.getLmpNome();        
        } else if (columnIndex ==2) {
            return lmpFuncionarios.getLmpCargo();
        } else if (columnIndex ==3) {
            return lmpFuncionarios.getLmpCpf();
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
            return "Cargo";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
}
