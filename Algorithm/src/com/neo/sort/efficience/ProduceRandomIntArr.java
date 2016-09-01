package com.neo.sort.efficience;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 产生随机数，并保存在数组中
 * @author lile
 * @date   2016年8月31日  
 * @time   下午7:44:55
 */
public class ProduceRandomIntArr {
	/**
	 * 
	 * @return 随机数数组
	 */
	public int[] productRandomArray() {
		int []array = null ;
		try {
			File file = new File("random.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			//int random = (int) (Math.random()*100);
			int randoms[] = new int[100000];
			for(int i = 0; i<100000; i++){
				randoms[i] = (int)(Math.random()*10000);
				fw.write(randoms[i]);
			}
			fw.close();
			FileReader fr = new FileReader("random.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String []arrayStr = line.split(" ");
			array = new int[arrayStr.length];
			for(int i = 0; i<arrayStr.length - 1; i++){
				array[i] = Integer.parseInt(arrayStr[i]);
			}
			br.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return array;
		
	}
}
