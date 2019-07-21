package design.patterns.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类：容器构件
 * 
 * @author Administrator
 *
 */
public class Folder implements FileInterface {

	private List<FileInterface> fileList = new ArrayList<FileInterface>();

	private String name;

	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void add(FileInterface f) {
		fileList.add(f);
	}

	@Override
	public void remode(FileInterface f) {
		fileList.remove(f);
	}

	@Override
	public FileInterface getChild(int i) {
		return fileList.get(i);
	}

	@Override
	public void killVirus() {
		System.out.println("****对文件夹'" + name + "'进行杀毒");
		for (FileInterface obj : fileList) {
			obj.killVirus();
		}

	}

}
