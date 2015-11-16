package com.papirum.model;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class PapirumFrame extends JFrame {
	private JMenuBar barraMenu;
	private JMenu mnArquivo;
	private JMenu mnEditar;
	private JMenu mnSobre;
	
	
	private JMenuItem miNovo;
	private JMenuItem miAbrir;
	private JMenuItem miSalvar;
	private JMenuItem miSair;
	
	private JMenuItem miBold;
	private JMenuItem miItalic;
	private JMenuItem miUnderline;
	
	private JMenuItem miWeb;

	
	
	private JTextArea taTexto;
	
	
	private Icon icone1;
	private Icon icone2;
	private Icon icone3;
	private Icon icone4;
	private Icon icone5;
	private Icon icone6;
	private Icon icone7;
	
	
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	
	
	private JToolBar bar;  

	
	
	
	public PapirumFrame() {
		super("Papirum");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		barraMenu = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		miNovo = new JMenuItem("Novo");
		miAbrir = new JMenuItem("Abrir");
		miSalvar = new JMenuItem("Salvar");
		miSair = new JMenuItem("Sair");
		miBold = new JMenuItem("Negrito");
		miItalic = new JMenuItem("Italico");
		miUnderline = new JMenuItem("Sublinhado");

		
		mnEditar = new JMenu("Editar");
		mnSobre = new JMenu("Sobre");
		
		miWeb = new JMenuItem("Visite o site");
		
		taTexto = new JTextArea();
		
		// código para criacao do toolbar
		
		bar = new JToolBar();
		
		icone1 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/2.png");
		icone2 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/4.png");
		icone3 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/3.png");
		icone4 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/1.png");
		icone5 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/6.png");
		icone6 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/7.png");
		icone7 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/5.png");

		b1 = new JButton(icone1);
		b2 = new JButton(icone2);
		b3 = new JButton(icone3);
		b4 = new JButton(icone4);
		b5 = new JButton(icone5);
		b6 = new JButton(icone6);
		b7 = new JButton(icone7);
	
		//area para adicionar os componentes

		mnArquivo.add(miNovo);
		mnArquivo.add(miAbrir);
		mnArquivo.add(miSalvar);
		mnArquivo.addSeparator();
		mnArquivo.add(miSair);
		
		mnEditar.add(miBold);
		mnEditar.add(miItalic);
		mnEditar.add(miUnderline);
		
		mnSobre.add(miWeb);
		

		barraMenu.add(mnArquivo);
		barraMenu.add(mnEditar);
		barraMenu.add(mnSobre);
		this.setJMenuBar(barraMenu);
		bar.add(b1);
		bar.add(b2);
		bar.add(b3);
		
		bar.add(b4);
		bar.add(b5);
		bar.add(b6);
		
		bar.add(b7);
		
		this.getContentPane().add(bar,BorderLayout.NORTH);
		this.getContentPane().add(taTexto, BorderLayout.CENTER);

		this.setSize(640, 480);
		this.setVisible(true);

	}
	public void fechar(){
		this.setVisible(false);
	}
}
