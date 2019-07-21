package design.patterns.combination;

/**
 * Sunny的资料
 *     图像文件
 *         小龙女.jpg
 *         张无忌.gif
 *     文本文件
 *         九阴真经.txt
 *         葵花宝典.doc
 *     视频文件
 *        笑傲江湖.rmvb
 * 
 * 组合模式(Composite Pattern)：组合多个对象形成树形结构以表示具有“整体—部分”关系的层次结构。
 * 组合模式对单个对象（即叶子对象）和组合对象（即容器对象）的使用具有一致性，组合模式又可以称为
 * “整体—部分”(Part-Whole)模式，它是一种对象结构型模式。
 * 
 * @author Administrator
 *
 */
public class CombinationTest {

	public static void main(String[] args) {
		FileInterface file1, file2, file3, file4, file5, 
		folder1, folder2, folder3, folder4;

		folder1 = new Folder("Sunny的资料");
		folder2 = new Folder("图像文件");
		folder3 = new Folder("文本文件");
		folder4 = new Folder("视频文件");

		file1 = new ImageFile("小龙女.jpg");
		file2 = new ImageFile("张无忌.gif");
		file3 = new TxtFile("九阴真经.txt");
		file4 = new TxtFile("葵花宝典.doc");
		file5 = new VideoFile("笑傲江湖.rmvb");

		folder2.add(file1);
		folder2.add(file2);
		folder3.add(file3);
		folder3.add(file4);
		folder4.add(file5);
		folder1.add(folder2);
		folder1.add(folder3);
		folder1.add(folder4);

		folder1.killVirus();
	}

}
