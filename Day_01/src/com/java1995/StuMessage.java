package com.java1995;

/*
 * ѧ��ϵͳ����
 */
import java.util.*;
/**
 * 
 * @author Administrator
 *
 */
public class StuMessage {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("������ѧ��������");
		Scanner in = new Scanner(System.in);
		int StuNum = in.nextInt();
		System.out.println("������γ���Ŀ��");
		int CourseNum = in.nextInt();

		String[] StuName = new String[StuNum];// ѧ������
		String[] CourseName = new String[CourseNum];// �γ�����
		int[][] score = new int[StuNum][CourseNum];// ����
		int[] sum = new int[StuNum];
		float[] average = new float[StuNum];
		String[] str = new String[StuNum];// ��һ������װ��һ��
		String[] scoreDate = new String[StuNum];
		/*
		 * �����ʼ����Ĭ����null ��ʼ��Ϊ��������û�����String��ʽ�������ַ���������ʽ
		 */
		for (int i = 0; i < StuNum; i++) {
			scoreDate[i] = "";
		}
		/*
		 * ��������ѭ���Ǹ�ֵ����
		 */
		for (int i = 0; i < StuName.length; i++) {
			System.out.println("ѧ��" + (i + 1) + "��������:");
			StuName[i] = in.next();
		}
		for (int i = 0; i < CourseNum; i++) {
			System.out.println("��Ҫѧϰ�Ŀγ�" + (i + 1) + "��:");
			CourseName[i] = in.next();
		}
		for (int i = 0; i < StuName.length; i++) {
			int s = 0;
			// String scoreDate="";//���±���ʼ��
			for (int j = 0; j < CourseNum; j++) {
				System.out.println(StuName[i] + "��" + CourseName[j] + "�ɼ���:");
				score[i][j] = in.nextInt();
				s += score[i][j];
				scoreDate[i] += score[i][j] + "\t";// scoreDate��ÿ��ͬѧ�ĸ��Ƴɼ���װ��һ��
			}
			sum[i] = s;
			average[i] = sum[i] / CourseName.length;
			str[i] = StuName[i] + "\t" + scoreDate[i] + sum[i] + "\t"
					+ average[i]; // ��ÿ��������װ��һ��
		}
		/*
		 * ��ÿ��������������ð�ݷ��Ӵ�С
		 */
		for (int i = 0; i < StuNum - 1; i++) {
			for (int j = 0; j < StuNum - i - 1; j++) {
				if (sum[j] < sum[j + 1]) {
					int temp = sum[j];
					String strTemp = str[j];
					sum[j] = sum[j + 1];
					str[j] = str[j + 1];
					sum[j + 1] = temp;
					str[j + 1] = strTemp;
				}
			}
		}
		/*
		 * ��ӡ��ϸ����
		 */
		System.out.print("ѧ��");
		for (int j = 0; j < CourseNum; j++) {
			System.out.print("\t" + CourseName[j]);
		}
		System.out.print("\t�ܷ�\tƽ����\t���а�");
		System.out.println();
		for (int i = 0; i < StuNum; i++) {
			/*
			 * ��������str�����У��������ݲ���Ҫ��
			 */
			/*
			 * System.out.print(StuName[i]); for (int j = 0; j < CourseNum; j++)
			 * { System.out.print("\t" + score[i][j]); } System.out.print("\t" +
			 * sum[i] + "\t" + average[i]);
			 */
			// System.out.print(Str[i]);
			// System.out.print("\t��"+(i+1)+"��");
			// System.out.println();
			System.out.println(str[i] + "\t��" + (i + 1) + "��");
		}

	}

}
