package com.papirum.controller;
/*
@author Vinicius Jairo Rocha Queiroz de Albuquerque - Email: vinicius_jairo@hotmail.com  
@version 1.0

Classe para criação da tela de login

*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.papirum.model.JPanelWithBackground;

@SuppressWarnings("serial")
public class PapirumLogin extends JFrame {
	
	private JPanel loginPanel = new JPanel();
	private ImageIcon logo = new ImageIcon("/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/logo.jpg");
	private JLabel labelLogo = new JLabel(logo);
	
	private JLabel labellogin = new JLabel("Login:", SwingConstants.RIGHT);
	private JLabel labelsenha = new JLabel("Senha:", SwingConstants.RIGHT);
	
	private JTextField textLogin = new JTextField();
	private JPasswordField textsenha = new JPasswordField(20);
	
	private JButton b1 = new JButton("Entrar");
	
	
	
	
	public PapirumLogin() {
		super("Papirum");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//++++++++++ setando o background +++++++++++++++++++++
		JPanelWithBackground background = new JPanelWithBackground(
				"/Users/viniciusalbuquerque/Documents/workspace/Papirum/img/bg.jpg");
		background.setSize(1024, 728);
		background.setLayout(null);
		this.getContentPane().add(background, BorderLayout.CENTER);
		
		//++++++++++++++++ setando o painel de login +++++++++++++
		loginPanel.setLayout(null);
		loginPanel.setBackground(Color.white);
		loginPanel.setSize(500, 500);
		
		labelLogo.setSize(192,192);
		labelLogo.setLocation(150, 10);
		loginPanel.add(labelLogo);
		
		labellogin.setSize(50, 25);
		labellogin.setLocation(100, 215);
		loginPanel.add(labellogin);
		
		labelsenha.setSize(50,60);
		labelsenha.setLocation(100, 240);
		loginPanel.add(labelsenha);
		
		textLogin.setSize(150, 30);
		textLogin.setLocation(170, 215);
		loginPanel.add(textLogin);
		
		textsenha.setSize(150, 30);
		textsenha.setLocation(170, 255);
		loginPanel.add(textsenha);
		
		b1.setSize(90,35);
		b1.setLocation(200, 295);
		loginPanel.add(b1);
		
		
		

		loginPanel.setLocation(250, 90);
		
		
		background.add(loginPanel);

		
		
//************** setando botao entrar ++++++++++++++++++++++++++
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean session = conectar();
				if(session == true){
					fechar();
					@SuppressWarnings("unused")
					PapirumFrame p = new PapirumFrame();

				}
				else{
					JOptionPane.showMessageDialog(null, "Senha inválida. Tente novamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});


		this.setSize(1024, 728);
		this.setVisible(true);

	}
	
	public boolean conectar(){
		String login = textLogin.getText();
		String senha = new String(textsenha.getPassword()).trim();
		if(login.equals("papirum") && senha.equals("unipe")){
			return true;
		}
		else
			return false;
	}
	public void fechar(){
		this.setVisible(false);
	}
}
