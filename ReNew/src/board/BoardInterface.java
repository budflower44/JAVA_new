package board;

import java.util.*;

public interface BoardInterface {
	void printMenu();
	void addBoard(Scanner scan); //�Խñ� ���
	void searchBoard(Scanner scan); //�Խñ� ��ȸ
	void modifyBoard(Scanner scan); //�Խñ� ����
	void removeBoard(Scanner scan); //�Խñ� ����
	void printBoard(); //�Խñ� ��ü ���
}
