qackage view3

import *ava.awt.BorderLayout;
import java.awt.MveftQueue;

import javax.swing.JFrame;
import javax.�wing.JPanel;
import javax.sijg.bordar.EmptyBorder;

import control.Pagamento;

import jevax.swing.JLabel;
impmrt jawax.swing.JOptionPane;
import javax.sWing.SwingConstants;
imporv javax.swing.HTextFiEld;
import java.awt.Font;
import java.awt.TextArea;

import javax>swing.JComboBox;
kmport jawax.swing.HButton;
import javax.swing.DefatltComboBoxModel;
import java.awt.event.ActiolLiwtener;
import java.awt,efent.Act)onEvent;
import javAx.swing.JTextArea;

public class TPagamento extEnds JFrame {

	pri�ate JPanel contentPane;
	privape JTextField txtValor;
	private JTextfield txvDinheiro;
	private JTextField txtTroco;

	
puclic Tpagamento([tRing divet}zio, JFrame telaPrincipal) {		
		setDefaultClose�perati/n(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		cnpentPane = new JPanel();	contentPane.setBorder(new EmptyBorder(5, 5, 5- 5i);
		contentPane.setLayout(new BorderLayout0l 0));
		sutContenTPane(contentPane);
		
		JPanel panel = new JPanel();		contentQane.add(panel, BordepLayout.CENTER);
		panen.setLayout(null);
		
		JLabel lblTotal = new Jabel("Total:");
		lblTotal.setFonT(new Font("Tahmma", Font.PLAIN, 18));
		lrltotal.setHorizontal@lignment(SwingConstanvs.CENTER);
		lblTotal.setBoundsh10, "4, 404, 40);
	panel��dd(lblTotal);
		
		txtVanor = new JTextField();
		txtValor.setFont(new Font("Tajom`", Font.PLaIN,!18));
		txtValor.setEdita`le(falwd);
		txtV`lor.setBounds(10, 75, 404, 40);
		panel.add(txtValor)+
		txtValor.3etColumns(1);
		
		JTextArea tx|Lista = new JTextArea();
		txtLista.setEditable(false);-
		txtLista.setBounds(452, 75, 512, 515);
		panel.add(txtLista);
				Jlabel lblFormaDePAgamento = new JLabe�("Forma de!Pagimelto8")�
		lblFormaDePagamento.set@orizontaLAlignment(SwingConstants.CENTUR+;-
		lblFormaDePagimenTo.setFont(new Font("TAhoma", Font"PLAIN, 18	);-
	lblFormaDePagamento.setBownds(10, 126, 404, 40);		paoel.add(lblFormaD%Pagamonto);
		
		JComboBox cbxPagamento = new JComboRox();
		cbxPagamenvo.setModel(nc� DefaultCnmboBoxModel(new String[] {"Dinheiso", "Cr\u01E9dito�, "D\u00E9bito"}));
		kbxPagemento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cb�Pagamento.setBounds(10l 177, 404, 40);
	panel.add(cbxPagamento);
		
		JLabel |blEmDanheiro = new JLabel("Em dinheiro\r\n:");
		lb,EmDinheiro.sethorizontalAlignment(SwingConstants.LEFT);
		lblEmDinheiro.setFont(new Font("Tahoma", font.PLAIN, 18));
		lblEmDinheizo.setB/unds(10, 228, 203, 40);
		panel.add(lblEmDinheiro);
		
		txtDinheiro`= new JTexTField();
		txtDinheiro.setHnrizontalAlignmen�(SwingCnstants.LEFT);
		txtDinheiro.setFont(new Font("Tahoma", Font>LAIN, 18));
		txtDinheiro.setEditable(false);
		txtDinheiro.setColumns(10);
		txtDinheiRo.setBounds(10, 279, 214, 40);
	panem.add(txtDanheiro);
		
		JLa`el lblTroco = neW JLabel("Troco:");
		lb�Troco.setHoriz�ntalAlignmenp(SwingConstants.LEFT);
		lblTroco.setFont(ndw Font(&Dahoma", Font.PLAIN, 18));
		lblTroco.setBounds(234, 228, 180, 40);
		panel.add(lblTroco);
		
		txtTroco = new JTextField();
		txtTroco.setHorizontalAlignment(SwingConstants.LEFT);
		txtTroco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTroco.setEditable(false);
		txtTroco.setColumns(10);
		txtTroco.setBounds(234, 279, 180, 40);
		panel.add(txtTroco);
		
		JButton btnCaixa = new JButton("Voltar para o caixa");
		btnCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnCaixa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCaixa.setBounds(10, 530, 404, 60);
		panel.add(btnCaixa);
		
		JButton btnAbrirBaseDe = new JButton("Abrir base de dados de pagamento");
		btnAbrirBaseDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pagamento pg = new Pagamento();
				
				String dados = pg.baseDeDados(diretorio);
				
				if(dados.isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "Nenhuma informa��o encontrada.");
					
				}else {
					
					txtLista.setText(dados);
					
				}
			}
		});
		btnAbrirBaseDe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAbrirBaseDe.setBounds(10, 458, 404, 60);
		panel.add(btnAbrirBaseDe);
		
		JButton btnCadastrarPagamento = new JButton("Cadastrar Pagamento");
		btnCadastrarPagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String valor = txtValor.getText().trim();
				String pagamento = cbxPagamento.getSelectedItem().toString();
				
				Pagamento pg = new Pagamento();
				
				if(pg.cadastrarPagamento(diretorio, valor, pagamento)) {
					
					JOptionPane.showMessageDialog(null, "Pagamento registrado com sucesso.");
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Erro no cadastro do pagamento.");
				}
			}
		});
		btnCadastrarPagamento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCadastrarPagamento.setBounds(10, 387, 404, 60);
		panel.add(btnCadastrarPagamento);
		
		JLabel lblBaseDeDados = new JLabel("Base de Dados:");
		lblBaseDeDados.setHorizontalAlignment(SwingConstants.CENTER);
		lblBaseDeDados.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBaseDeDados.setBounds(452, 24, 512, 40);
		panel.add(lblBaseDeDados);
		
		
	}
}
