package projectCodeLoginScreen;

import java.io.File;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class javaTree extends JTree implements Runnable{
	private static final long serialVersionUID = 1L;
	private JTree jTree;
	private File jFile;
	private String[] filePath;

	public javaTree(JTree jTree, File File) {
		this.jTree = jTree;
		this.jFile = File;
		System.out.println(jFile);
		run();
	}

	@Override
	public void run() {
		filePath = jFile.getPath().split("\\\\");
		String mainName = filePath[filePath.length - 1];
		File[] listFiles = jFile.listFiles();

		jTree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode(mainName) {
			private static final long serialVersionUID = 1L;
		{
			DefaultMutableTreeNode node_1 = null;			
			node_1 = new DefaultMutableTreeNode("colors");
				node_1.add(new DefaultMutableTreeNode("blue"));
				node_1.add(new DefaultMutableTreeNode("violet"));
				node_1.add(new DefaultMutableTreeNode("red"));
				node_1.add(new DefaultMutableTreeNode("green"));
				node_1.add(new DefaultMutableTreeNode("yellow"));
				node_1.add(new DefaultMutableTreeNode("pink"));
				node_1.add(new DefaultMutableTreeNode("black"));
			add(node_1);
			node_1 = new DefaultMutableTreeNode("sports");
				node_1.add(new DefaultMutableTreeNode("basketball"));
				node_1.add(new DefaultMutableTreeNode("soccer"));
				node_1.add(new DefaultMutableTreeNode("football"));
				node_1.add(new DefaultMutableTreeNode("hockey"));
				node_1.add(new DefaultMutableTreeNode("tennis"));
			add(node_1);
			node_1 = new DefaultMutableTreeNode("food");
				node_1.add(new DefaultMutableTreeNode("hot dogs"));
				node_1.add(new DefaultMutableTreeNode("pizza"));
				node_1.add(new DefaultMutableTreeNode("ravioli"));
				node_1.add(new DefaultMutableTreeNode("bananas"));
				node_1.add(new DefaultMutableTreeNode("meat"));
			add(node_1);
		}
		
		private void addNode() {
			System.out.println("");
		}
	}));
		
	} 
}
