package javaapplication25;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Ventana extends JFrame implements ActionListener{
JList ListaPrincipal;
JList ListaDestino;
JButton Trasladar;

String UnidadOrigen[]={"UPIITA", "ESEO","ESIME","ESIA"};
JScrollPane Desp1, Desp2;

public void Init(){
    setLayout(new GridLayout(1,3));
    ListaPrincipal= new JList(UnidadOrigen);
    ListaPrincipal.setVisibleRowCount(3);
    ListaPrincipal.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    ListaPrincipal.setFixedCellHeight(20);
    ListaPrincipal.setFixedCellWidth(100);
    ListaDestino=new JList();
    Trasladar=new JButton(">>");
    Desp1= new JScrollPane(ListaPrincipal);
    Desp2= new JScrollPane(ListaDestino);
    add(Desp1);
    add(Trasladar);
    add(Desp2);
    Trasladar.addActionListener(this);
    setSize(300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

}
    @Override
    public void actionPerformed(ActionEvent e) {
   if (e.getSource()==Trasladar){
       ListaDestino.setListData(ListaPrincipal.getSelectedValuesList().toArray());
   }
    
    }
}
