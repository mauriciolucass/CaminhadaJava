package telas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class TelaThread extends JDialog {
	
	JPanel jPanel = new JPanel(new GridBagLayout()); // painel de componetes
	private JLabel  descricaoHora = new JLabel("Time da thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel  descricaoHora2 = new JLabel("Time da thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	
	public TelaThread() {// executa o que tiver dentro no momento da execução
		setTitle("minha tela time");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		// primeira parte concluida
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();// contolador de posições  de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.ipady = 0;
		
	    descricaoHora.setPreferredSize(new Dimension(200, 25));
	    jPanel.add(descricaoHora, gridBagConstraints);
	    
	    mostraTempo.setPreferredSize(new Dimension(200, 25));
	  //  gridBagConstraints.gridy++;
	    jPanel.add(mostraTempo, gridBagConstraints);
	    
	    
	    descricaoHora2.setPreferredSize(new Dimension(200, 25));
	  //  gridBagConstraints.gridy++;
	    jPanel.add(descricaoHora2, gridBagConstraints);
	    
	    mostraTempo2.setPreferredSize(new DimensionUIResource(200, 25));
	 //   gridBagConstraints.gridy++;
	    jPanel.add(mostraTempo2, gridBagConstraints);
		
		
		
		
		
	  add(jPanel , BorderLayout.WEST);
	// ultimo a ser executado	
	 setVisible(true);// torna a tela visivel para o usuario
	 
	}
	
	
	
	

}
