package command;

public class CmdTest {
	
	private StringBuffer textDoc=new StringBuffer();  //my test document
	
	//Constructor
	public CmdTest()
	{
		textDoc.append("Initial String");
		
		InsertTxtCmd itc=new InsertTxtCmd(textDoc,"ABC123",8);
		
		System.out.println("Before insert textDoc: " + textDoc.toString());
		itc.execute();
		itc.execute();
		System.out.println("After insert textDoc: " + textDoc.toString());
		itc.undo();
		System.out.println("After Undo textDoc: " + textDoc.toString());
		itc.undo();
		System.out.println("After Undo textDoc: " + textDoc.toString());
	}

	public static void main(String[] args) {
		CmdTest cmdTest=new CmdTest();
		//new CmdTest();   this can also work
	}

}
