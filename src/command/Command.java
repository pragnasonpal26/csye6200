package command;

/**
 * COmmand Design Pattern
 * @author sonpal.p
 *
 */

public abstract class Command {
	
	protected StringBuffer doc=null;
	
	//COnstructor
	public Command(StringBuffer doc)
	{
		this.doc=doc;
	}
	abstract public void execute();
	abstract public void undo();
}
