package word_������Ǯ��;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WordManager {

	private ArrayList<Word> list = new ArrayList<>(); 
	
	public void insertWord(Scanner scan) {
		// �ܾ���
		System.out.println("�ܾ�:");
		String word = scan.next();
		System.out.println("�ǹ�:");
		String mean = scan.next();
		
		Word w = new Word(word, mean);
		list.add(w);
		System.out.println("��ϿϷ�");
	}

	public void searchWord(Scanner scan) {
		// �ܾ� �˻�
		System.out.println("�˻��ܾ�:");
		String w = scan.next();
		for(Word tmp : list) {
			if(tmp.getWord().equals(w)) {
				System.out.println("--�˻����--");
				System.out.println(tmp);
				return;
			}
		}
		System.out.println("�˻� ����� �����ϴ�.");
	}

	public void modifyWord(Scanner scan) {
		// �ܾ� ���� : �ǹ̸� ����
		System.out.println("�����ܾ�:");
		String w = scan.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(w)) {
				System.out.println("�ǹ��Է�:");
				String m = scan.next();
				//list.get(i).setMean(m);
				//�ܾ ���� �����ؾ��� �� ��
				Word word = new Word(w,m);
				list.set(i, word);
			}
		}
		System.out.println("�˻� ����� �����ϴ�.");
		
	}

	public void printWord() {
		// �ܾ� ��ü ���
		System.out.println("--�ܾ���--");
		for(Word tmp : list) {
			System.out.println(tmp);
		}
		
	}

	public void filePrint() throws IOException {
		// ���Ϸ� ���
			FileWriter fw = new FileWriter("word.text");
			BufferedWriter bw = new BufferedWriter(fw);
			
			StringBuffer sb = new StringBuffer();
			
			String data = "";
			int cnt = 0; //����Ʈ�� index
			
			while(cnt <list.size()) {
				sb.append(list.get(cnt).toString());
				sb.append("\r\n"); //�ٹٲ�
				cnt++;
			}
			data = sb.toString();
			System.out.println(data);
			fw.write(data);
			fw.close();
	}

}
