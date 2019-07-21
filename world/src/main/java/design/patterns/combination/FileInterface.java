package design.patterns.combination;

/**
 * 抽象文件类\接口：抽象构件  
 * 
 * @author Administrator
 *
 */
public interface FileInterface {

	void add(FileInterface f);

	void remode(FileInterface f);

	FileInterface getChild(int i);

	void killVirus();

}
