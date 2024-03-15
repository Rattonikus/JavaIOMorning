package io.view;

import javax.swing.JFileChooser;

public class DataPanel
{
	
	private String getPath(String choice)
	{
		String path = ".";
		
		int result = -99;
		
		JFileChooser fileChooser = new JFileChooser();
		
		if (choice.equals("save"));
		{
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			result = fileChooser.showSaveDialog(this);
			if (result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getCurrentDirectory().getAbsolutePath();
			}
		}
		else
		{
			//result = fileChooser.showSaveDialog(this);
			if (result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getSelectedFile().getAbsolutePath();
			}
		}
		
		return path; 
	}

}
