package javaapplication24;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Ventana extends JFrame implements ActionListener{
    BorderLayout Borde;
    JScrollPane Edicion;
    JTextArea Texto;
    JMenuBar Menu;
    JMenu File;
    JMenu Edit;
    JMenuItem New;
    JMenuItem Open;
    JMenuItem Save;
    JMenuItem Salir;
    JSeparator Line;
    JMenuItem Cut;
    JMenuItem Paste;
    
    JFileChooser Dialogo;
    FileReader In;
    FileWriter Out;
    File Documento;
    
    public void Init(){
        Borde=new BorderLayout();
        Texto=new JTextArea();
        Edicion=new JScrollPane(Texto);
        Menu= new JMenuBar();
        File=new JMenu("Archivo");
        Edit=new JMenu ("Edicion");
        New=new JMenuItem ("Nuevo");
        Open=new JMenuItem ("Abrir");
        Save=new JMenuItem ("Salvar");
        Salir=new JMenuItem ("Salir");
        Line= new JSeparator();
        Cut=new JMenuItem ("Cortar");
        Paste=new JMenuItem("Pegar");
        Dialogo=new JFileChooser();
        
        
        Salir.addActionListener(this);
        Cut.addActionListener(this);
        Paste.addActionListener(this);
        Save.addActionListener(this);
        
        setLayout(Borde);
        add(Edicion, BorderLayout.CENTER);
        File.add(New);
        File.add(Open);
        File.add(Save);
        File.add(Line);
        File.add(Salir);
        Edit.add(Cut);
        Edit.add(Paste);
        Edit.add(Paste);
        Menu.add(File);
        Menu.add(Edit);
        add(Menu,BorderLayout.NORTH);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
  if (e.getSource()==Salir)
      Salir();
  else if (e.getSource()==Cut){
      Cortar();
  }
  else if (e.getSource()==Paste){
      Pegar();
  }
  else if (e.getSource()==Save){
      Save();
  }
    }
    public void Salir(){
        dispose();
    }
    
    public void Cortar(){
        Texto.cut();
        
    }
    public void Pegar(){
        Texto.paste();
    }
    
    public void Guardar(){
        Dialogo.showSaveDialog(this);
        Documento=Dialogo.getSelectedFile();
        if (Documento!=null){
            try{
                Out=new FileWriter(Documento.getPath());
                Out.write(Texto.getText());
                Out.close();
            }
            catch (IOException ex ){
             System.out.println("Error de Escritura");   
            }
        }
    }
    
}
