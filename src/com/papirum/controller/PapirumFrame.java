package com.papirum.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

import com.papirum.model.JPanelWithBackground;
import com.papirum.model.TextAreaFigura;
import com.papirum.model.ToolBarFigura;

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

	private JLabel countLabel;
	
	private JLabel labelcontador = new JLabel("Número de linhas") ;


	private Icon icone1;
	private Icon icone2;
	private Icon icone3;
	private Icon icone4;
	private Icon icone5;
	private Icon icone6;
	private Icon icone7;
	private Icon icone8;
	private Icon icone9;
	private Icon icone10;
	
	private Icon icone11;
	
	private Icon icone12;
	private Icon icone13;
	
	private Icon icone14;
	private Icon icone15;
	private Icon icone16;
	private Icon icone17;
	private Icon icone18;




	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;

	private JButton b8;
	private JButton b9;
	private JButton b10;
	
	private JButton b11;
	
	private JButton b12;
	private JButton b13;
	
	private JButton b14;
	private JButton b15;
	private JButton b16;
	private JButton b17;
	private JButton b18;


	
	

	private JToolBar bar;
	private JToolBar bar2;

	private JScrollPane jsp;
	
	private int tamanhofont = 20; 
	
	private boolean bold = false;
	private boolean italic = false;
	private boolean underlined = false;
	
	//private TextLineNumber contadorLinhas = new TextLineNumber(taTexto);

	public PapirumFrame() {

		super("Papirum");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanelWithBackground background = new JPanelWithBackground(
				"/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/bg.jpg");
		background.setSize(1024, 728);
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

		// ++++++++++++++++++ area de bloco de notas para escrita +++++++++++++

		taTexto = new TextAreaFigura(new File("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/ca.png"));
		Font font = new Font("Arial", Font.PLAIN, 20);
		taTexto.setFont(font);
		taTexto.setText("\n         ");
		taTexto.setLineWrap(true);
		// noWrapPanel.setSize(744, 700); para colocar a quebra de linha em um
		// jtextpane
		// noWrapPanel.add(taTexto); para colocar a quebra de linha em um
		// jtextpane

		// +++++++++++++++++++ código para colocar o scroll +++++++++++++++++++

		jsp = new JScrollPane(taTexto);

		// jsp.setViewportView(taTexto); para colocar a quebra de linha em um
		// jtextpane

		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setSize(744, 700);
		jsp.setLocation(290, 50);
	    //jsp.setRowHeaderView(contadorLinhas); tentar fazer o contador de linhas


		// código para criacao do toolbar

		bar = new ToolBarFigura(new File("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/bg.jpg"));
		bar2 = new JToolBar();
		icone1 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/2.png");
		icone2 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/4.png");
		icone3 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/3.png");
		icone4 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/1.png");
		icone5 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/6.png");
		icone6 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/7.png");
		icone7 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/5.png");
		icone8 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/8.png");
		icone9 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/9.png");
		icone10 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/10.png");
		icone11 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/11.png");
		icone12 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/12.png");
		icone13 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/13.png");

		icone14 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/red.png");
		icone15 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/green.png");
		icone16 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/yellow.png");
		icone17 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/blue.png");
		icone18 = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/black.png");


		
		b1 = new JButton(icone1);
		b2 = new JButton(icone2);
		b3 = new JButton(icone3);
		b4 = new JButton(icone4);
		b5 = new JButton(icone5);
		b6 = new JButton(icone6);
		b7 = new JButton(icone7);
		b8 = new JButton(icone8);
		b9 = new JButton(icone9);
		b10 = new JButton(icone10);
		b11 = new JButton(icone11);
		b12 = new JButton(icone12);
		b13 = new JButton(icone13);
		
		b14 = new JButton(icone14);
		b15 = new JButton(icone15);
		b16 = new JButton(icone16);
		b17 = new JButton(icone17);
		b18 = new JButton(icone18);


		countLabel = new JLabel(Integer.toString(taTexto.getLineCount()));

		// area para adicionar os componentes

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
		bar.addSeparator();
		bar.add(b5);
		bar.add(b6);
		bar.add(b7);
		bar.addSeparator();
		bar.add(b8);
		bar.add(b9);
		bar.add(b10);
		bar.addSeparator();
		bar.add(b11);
		bar.addSeparator();
		bar.add(b12);
		bar.add(b13);
		bar.addSeparator();
		bar.add(b14);
		bar.add(b15);
		bar.add(b16);
		bar.add(b17);
		bar.add(b18);




		

		// Jtoolbar da parte de baixo. 
		bar2.add(labelcontador);
		bar2.addSeparator();
		bar2.add(countLabel);
		bar2.addSeparator();
		// ++++++++++++++++++ fazer as funções dos botoes ++++++++++++++++++

		// botao salvar
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					pegar();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		// botao abrir
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					abrir();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		// botao bold
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				negrito(bold);

			}
		});
		// botao italico
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				italico(italic);

			}
		});

		// botao underline
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				sublinhado(underlined);

			}
		});
		
		//botao copiar
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				copiar();

			}
		});
		//botao colar
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				colar();

			}
		});
		//botao cortar
		b10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cortar();

			}
		});
		//botao imprimir
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Imprimindo", "Impressão", JOptionPane.INFORMATION_MESSAGE);

			}
		});
		
		//botao contador de linhas
		b11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				countLabel.setText(Integer.toString(taTexto.getLineCount()));
			}
		});
		
		//botao aumentar fonte
		b12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				aumentar();
			}
		});
		
		//botao diminuir fonte
		b13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				diminuir();
			}
		});
		
		//botao vermelho
		b14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				red();
			}
		});
		//botao verde
		b15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				green();
			}
		});
		//botao amarelo
		b16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				yellow();
			}
		});
		//botao azul
		b17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				blue();
			}
		});
		//botao preto
		b18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				black();
			}
		});
		
		
		
		
		// arrumar o tamanho do jtextarea

		background.setLayout(null);
		// background.add(taTexto);
		background.add(jsp, BorderLayout.CENTER);

		this.getContentPane().add(bar, BorderLayout.NORTH);
		this.getContentPane().add(bar2, BorderLayout.SOUTH);

		// this.getContentPane().add(taTexto, BorderLayout.CENTER);
		this.getContentPane().add(background, BorderLayout.CENTER);
		//this.setLocationRelativeTo(null);
		// this.getContentPane().add(jsp);
		this.setSize(1524, 810);
		this.setVisible(true);

		// funcao para colocar o jtoolbar visivel quando o mouse passa
		/*
		 * bar.addMouseListener(new MouseAdapter() { public void
		 * mouseEntered(MouseEvent e) { bar.setVisible(true); }
		 * 
		 * public void mouseExited(MouseEvent e) { bar.setVisible(false); } });
		 * 
		 * 
		 */
	}

	public void fechar() {
		this.setVisible(false);
	}

	public void pegar() throws FileNotFoundException {
		String a = taTexto.getText();

		JFileChooser chooser;
		chooser = new JFileChooser();
		String caminho = "";
		File file = null;
		int retorno = chooser.showSaveDialog(null); // showSaveDialog retorna um
													// inteiro , e ele ira
													// determinar que o chooser
													// será para salvar.
		if (retorno == JFileChooser.APPROVE_OPTION) {
			caminho = chooser.getSelectedFile().getAbsolutePath();
		}
		if (!caminho.equals("")) {
			file = new File(caminho + ".txt");
			try {

				if (!file.exists()) {
					// cria um arquivo (vazio)
					file.createNewFile();
				}
				// escreve no arquivo
				FileWriter fw = new FileWriter(file, true);

				BufferedWriter bw = new BufferedWriter(fw);

				bw.write(a);

				bw.newLine();

				bw.close();
				fw.close();
				JOptionPane.showMessageDialog(null, "Documento salvo", "Salvar como", JOptionPane.INFORMATION_MESSAGE);

			} catch (IOException ex) {
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Documento não foi salvo", "Aviso",
						JOptionPane.INFORMATION_MESSAGE);

			}
		}

		else {
			throw new FileNotFoundException(); // isso é para qdo vc clicar em
												// cancelar, ele nao vai ter
												// selecionado nada e o caminho
												// será nulo.

		}
	}

	public void negrito(boolean b) {
		if(b == false){
		Font font = new Font("Arial", Font.BOLD, 20);

		taTexto.setFont(font);
		this.bold = true;
		}else{
			Font font = new Font("Arial", Font.PLAIN, 20);

			taTexto.setFont(font);
			this.bold = false;

			
		}

	}

	public void italico(boolean i) {
		if(i == false){
		Font font = new Font("Arial", Font.ITALIC, 20);

		taTexto.setFont(font);
		this.italic = true;
		}else{
			Font font = new Font("Arial", Font.PLAIN, 20);

			taTexto.setFont(font);
			this.italic = false;
			
		}
	}

	public void sublinhado(boolean u) {
		if(u== false){
		Map<TextAttribute, Integer> fontAttributes = new HashMap<TextAttribute, Integer>();
		fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Font font = new Font("Arial", Font.PLAIN, 20).deriveFont(fontAttributes);

		taTexto.setFont(font);
		this.underlined = true;
		}else{
			Font font = new Font("Arial", Font.PLAIN, 20);

			taTexto.setFont(font);
			this.underlined = false;
		}

	}
	
	public void red(){
		taTexto.setForeground(Color.RED);
	}
	
	public void blue(){
		taTexto.setForeground(Color.blue);
	}
	public void yellow(){
		taTexto.setForeground(Color.YELLOW);
	}
	public void green(){
		taTexto.setForeground(Color.GREEN);
	}
	public void black(){
		taTexto.setForeground(Color.BLACK);
	}
	
		
	public void cortar() {
		taTexto.cut();

	}
	public void colar() {
		taTexto.paste();

	}
	
	public void copiar() {
		taTexto.copy();

	}
	
	public void aumentar() {
		this.tamanhofont ++;
		Font font = new Font("Arial", Font.PLAIN, tamanhofont);

		taTexto.setFont(font);
	}
	
	public void diminuir() {
		this.tamanhofont --;
		Font font = new Font("Arial", Font.PLAIN, tamanhofont);

		taTexto.setFont(font);

	}
	

	public void abrir() throws FileNotFoundException {
		JFileChooser chooser;
		chooser = new JFileChooser();
		String caminho = "";
		File file = null;
		int retorno = chooser.showOpenDialog(null); // showSaveDialog retorna um
													// inteiro , e ele ira
													// determinar que o chooser
													// será para salvar.
		if (retorno == JFileChooser.APPROVE_OPTION) {
			caminho = chooser.getSelectedFile().getAbsolutePath();
		}
		if (!caminho.equals("")) {
			file = new File(caminho);
			FileReader fis = null;
			String texto = "";

			try {
				fis = new FileReader(file);
				int content;
				while ((content = fis.read()) != -1) {
					texto += (char) content;
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fis != null) {
						fis.close();
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			taTexto.setText(texto);
			System.out.println(texto);
		}

		// else {
		// throw new FileNotFoundException();

		// }

	}

}
