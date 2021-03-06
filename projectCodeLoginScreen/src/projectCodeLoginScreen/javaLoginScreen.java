/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectCodeLoginScreen;

import java.awt.Color;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author lenovoz
 */
public class javaLoginScreen extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Creates new form javaFrameLogin
     */
    public javaLoginScreen() {
        String laf = UIManager.getSystemLookAndFeelClassName();
        try {
            UIManager.setLookAndFeel(laf);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(javaLoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(javaLoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(javaLoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(javaLoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jTree2.setModel(new DefaultTreeModel(
        	new DefaultMutableTreeNode("JTree") {
        		{
        			DefaultMutableTreeNode node_1;
        			node_1 = new DefaultMutableTreeNode("colors");
        				node_1.add(new DefaultMutableTreeNode("blue"));
        				node_1.add(new DefaultMutableTreeNode("violet"));
        				node_1.add(new DefaultMutableTreeNode("red"));
        				node_1.add(new DefaultMutableTreeNode("yellow"));
        			add(node_1);
        			node_1 = new DefaultMutableTreeNode("sports");
        				node_1.add(new DefaultMutableTreeNode("basketball"));
        				node_1.add(new DefaultMutableTreeNode("soccer"));
        				node_1.add(new DefaultMutableTreeNode("football"));
        				node_1.add(new DefaultMutableTreeNode("hockey"));
        			add(node_1);
        			node_1 = new DefaultMutableTreeNode("food");
        				node_1.add(new DefaultMutableTreeNode("hot dogs"));
        				node_1.add(new DefaultMutableTreeNode("pizza"));
        				node_1.add(new DefaultMutableTreeNode("ravioli"));
        				node_1.add(new DefaultMutableTreeNode("bananas"));
        			add(node_1);
        		}
        	}
        ));
        new javaTree(jTree2, new java.io.File("C:\\Temp"));
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPopupMenu = new javax.swing.JPopupMenu();
        jTextArea = new javax.swing.JTextArea(1,13);
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App");
        setBackground(new java.awt.Color(0, 51, 51));

        jSplitPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSplitPane2.setDividerLocation(275);
        jPopupMenu.add(jTextArea);

        jSplitPane1.setDividerLocation(300);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setResizeWeight(0.5);
        jSplitPane1.setToolTipText("");
        jSplitPane1.setAutoscrolls(true);
        jSplitPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane2.setToolTipText("");

        jTree2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTree2);
        
        jToggleButton1.setBackground(Color.WHITE);
        jToggleButton2.setBackground(Color.WHITE);

        jTabbedPane2.addTab("MainFolder", jScrollPane2);

        jSplitPane1.setLeftComponent(jTabbedPane2);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jScrollPane1.setViewportView(jTree1);

        jTabbedPane1.addTab("OtherFolder", jScrollPane1);

        jSplitPane1.setRightComponent(jTabbedPane1);

        jSplitPane2.setLeftComponent(jSplitPane1);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jTabbedPane3.addTab("MainFile", jScrollPane4);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setSelectionColor(new java.awt.Color(0, 153, 51));
        jScrollPane3.setViewportView(jTextArea1);

        jTabbedPane4.addTab("OtherFile", jScrollPane3);
        
//        new ButtonTabComponent(jTabbedPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(jPanel1);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jToggleButton2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/projectCodeLoginScreen/Icons/hl.png")).getImage().getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH)));
        jToggleButton2.setFocusable(false);
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setMaximumSize(new Dimension(40, 29));
        jToggleButton2.setMinimumSize(new Dimension(40, 29));
        jToggleButton2.setPreferredSize(new Dimension(40, 29));
        jToggleButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jToggleButton1.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt){
                jToggleButton1MouseMoved(evt);
            }
            public void mouseExited(MouseEvent evt){
                jPopupMenu.setVisible(false);
            }  
        });
        jToggleButton1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/projectCodeLoginScreen/Icons/vl.png")).getImage().getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH)));
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setMaximumSize(new Dimension(40, 29));
        jToggleButton1.setMinimumSize(new Dimension(40, 29));
        jToggleButton1.setPreferredSize(new Dimension(40, 29));
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToggleButton2.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt){
                jToggleButton2MouseMoved(evt);
            }
            public void mouseExited(MouseEvent evt){
                jPopupMenu.setVisible(false);
            }  
        });
        jToolBar1.add(jToggleButton2);
        jToolBar1.add(jToggleButton1);
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jSeparator2.setOpaque(true);
        jToolBar1.add(jSeparator2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {
//        System.out.println(jToggleButton2.isSelected());
        if(jToggleButton2.isSelected()){
            jScrollPane4.getHorizontalScrollBar().setModel(jScrollPane3.getHorizontalScrollBar().getModel());
//            jToggleButton2.setText(""+"ON");
        }else{
//        	DefaultBoundedRangeModel newModel = new DefaultBoundedRangeModel(jScrollPane4.getHorizontalScrollBar().getModel().getValue(),
//        																	 jScrollPane4.getHorizontalScrollBar().getModel().getExtent(), 
//        																	 jScrollPane4.getHorizontalScrollBar().getModel().getMinimum(), 
//        																	 jScrollPane4.getHorizontalScrollBar().getModel().getMaximum());
//        	jScrollPane4.getHorizontalScrollBar().setModel(newModel);
        	
        	JScrollPane newScrollPane = new JScrollPane();
        	jScrollPane4.getHorizontalScrollBar().setModel(newScrollPane.getHorizontalScrollBar().getModel());
//            jToggleButton2.setText("OFF");
        }
        
    }     
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
      if(jToggleButton1.isSelected()){
          jScrollPane4.getVerticalScrollBar().setModel(jScrollPane3.getVerticalScrollBar().getModel());
//          jToggleButton1.setText(""+"ON");
      }else{	
      	  JScrollPane newScrollPane = new JScrollPane();
          jScrollPane4.getVerticalScrollBar().setModel(newScrollPane.getVerticalScrollBar().getModel());
//          jToggleButton1.setText("OFF");
      }
      
    }
    private void jToggleButton1MouseMoved(java.awt.event.MouseEvent evt) {                                          
//    	JPopupMenu jPopupMenu = new JPopupMenu();
        if(jToggleButton1.isShowing()) {
        	jPopupMenu.setBackground(Color.WHITE);
//            JTextArea jTextArea = new JTextArea(1,12);
            jTextArea.setText("Vertical Synchronize.");
            jTextArea.setFont(new java.awt.Font("Times New Roman", 0, 14));
//            jTextArea.setSize(jTextArea.getText().length()+2, 10);
            jTextArea.setLineWrap(true);
            jTextArea.setEditable(false);
            jPopupMenu.setLocation(MouseInfo.getPointerInfo().getLocation().x+5, MouseInfo.getPointerInfo().getLocation().y+10);
            try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            jPopupMenu.setVisible(true);   
        }
    } 
    private void jToggleButton2MouseMoved(java.awt.event.MouseEvent evt) {                                          
//    	JPopupMenu jPopupMenu = new JPopupMenu();
        if(jToggleButton1.isShowing()) {
        	jPopupMenu.setBackground(Color.WHITE);
//            JTextArea jTextArea = new JTextArea(1,12);
            jTextArea.setText("Horizontal Synchronize.");
            jTextArea.setFont(new java.awt.Font("Times New Roman", 0, 14));
//            jTextArea.setSize(jTextArea.getText().length()+2, 10);
            jTextArea.setLineWrap(true);
            jTextArea.setEditable(false);
            jPopupMenu.setLocation(MouseInfo.getPointerInfo().getLocation().x+5, MouseInfo.getPointerInfo().getLocation().y+10);
            try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            jPopupMenu.setVisible(true);   
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(javaLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(javaLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(javaLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(javaLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javaLoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTree jTree1;
    private javax.swing.JTree jTree2;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JTextArea jTextArea;
}

