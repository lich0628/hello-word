package design.patterns.combination;

/**
 * 文本文件类：叶子构件 
 * 
 * @author Administrator
 *
 */
public class TxtFile implements FileInterface {

	private String name;

	public TxtFile(String name) {
		this.name = name;
	}

	@Override
	public void add(FileInterface f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remode(FileInterface f) {
		// TODO Auto-generated method stub

	}

	@Override
	public FileInterface getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("----对文本文件'" + name + "'进行杀毒");
	}

}
