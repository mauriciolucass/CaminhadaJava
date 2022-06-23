package telas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class TelaTime extends JDialog {
	
	JPanel jPanel = new JPanel(new GridBagLayout());
	private JLabel descricaoHoras = new JLabel("minha thread ");
	private JTextField  marcaTempo = new JTextField();
	
	private  JLabel descricaoHoras2 = new JLabel("minha thread 2");
	private JTextField marcaTempo2 = new JTextField();
	
	 private JButton jButton = new JButton("Start");
	 private JButton jButton2 = new JButton("Stop");
	 
	 private Runnable thread = new Runnable() {
		
		@Override
		public void run() {
			
			while(true) {
				marcaTempo.setText(new SimpleDateFormat("dd/MM/yyyy/mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	 private Runnable thread2 = new Runnable() {
			
			@Override
			public void run() {
				
				while(true) {
					marcaTempo2.setText(new SimpleDateFormat("dd/MM/yyyy/mm.ss").format(Calendar.getInstance().getTime()));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
	
	
	private Thread thread1Time;
	private Thread thread2Time;
	
	public TelaTime() {
		
		setTitle("tela time ");
		setSize(new Dimension(300,300 ));
		setLocationRelativeTo(null);
		setResizable(true);
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		descricaoHoras.setPreferredSize(new DimensionUIResource(250, 30));
		jPanel.add(descricaoHoras , gridBagConstraints);
		
		marcaTempo.setPreferredSize(new DimensionUIResource(250, 30));
		gridBagConstraints.gridy++;
		marcaTempo.setEditable(false);
		jPanel.add(marcaTempo , gridBagConstraints);
		
		descricaoHoras2.setPreferredSize(new DimensionUIResource(250, 30));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHoras2, gridBagConstraints);
		
		marcaTempo2.setPreferredSize(new Dimension(250, 30));
		gridBagConstraints.gridy++;
		marcaTempo2.setEditable(false);
		jPanel.add(marcaTempo2, gridBagConstraints);
		
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton,gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time = new Thread(thread);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
				
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();
				
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			}
		});
		

		
		jButton2.setEnabled(false);
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
	}
	
	
	
	

}
