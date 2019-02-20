package com.java1995;

/*
 * 学生系统管理
 */
import java.util.*;
/**
 * 
 * @author Administrator
 *
 */
public class StuMessage {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入学生人数：");
		Scanner in = new Scanner(System.in);
		int StuNum = in.nextInt();
		System.out.println("请输入课程数目：");
		int CourseNum = in.nextInt();

		String[] StuName = new String[StuNum];// 学生名字
		String[] CourseName = new String[CourseNum];// 课程名字
		int[][] score = new int[StuNum][CourseNum];// 分数
		int[] sum = new int[StuNum];
		float[] average = new float[StuNum];
		String[] str = new String[StuNum];// 将一行数据装在一块
		String[] scoreDate = new String[StuNum];
		/*
		 * 必须初始化，默认问null 初始化为””；最好还是用String形式，不用字符串数组形式
		 */
		for (int i = 0; i < StuNum; i++) {
			scoreDate[i] = "";
		}
		/*
		 * 以下三个循环是赋值过程
		 */
		for (int i = 0; i < StuName.length; i++) {
			System.out.println("学生" + (i + 1) + "的名字是:");
			StuName[i] = in.next();
		}
		for (int i = 0; i < CourseNum; i++) {
			System.out.println("需要学习的课程" + (i + 1) + "是:");
			CourseName[i] = in.next();
		}
		for (int i = 0; i < StuName.length; i++) {
			int s = 0;
			// String scoreDate="";//重新被初始化
			for (int j = 0; j < CourseNum; j++) {
				System.out.println(StuName[i] + "的" + CourseName[j] + "成绩是:");
				score[i][j] = in.nextInt();
				s += score[i][j];
				scoreDate[i] += score[i][j] + "\t";// scoreDate将每行同学的各科成绩组装在一块
			}
			sum[i] = s;
			average[i] = sum[i] / CourseName.length;
			str[i] = StuName[i] + "\t" + scoreDate[i] + sum[i] + "\t"
					+ average[i]; // 将每行数据组装在一块
		}
		/*
		 * 将每行数据排序排序，冒泡法从大到小
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
		 * 打印详细内容
		 */
		System.out.print("学生");
		for (int j = 0; j < CourseNum; j++) {
			System.out.print("\t" + CourseName[j]);
		}
		System.out.print("\t总分\t平均分\t排行榜");
		System.out.println();
		for (int i = 0; i < StuNum; i++) {
			/*
			 * 被整合在str数组中，以下内容不必要了
			 */
			/*
			 * System.out.print(StuName[i]); for (int j = 0; j < CourseNum; j++)
			 * { System.out.print("\t" + score[i][j]); } System.out.print("\t" +
			 * sum[i] + "\t" + average[i]);
			 */
			// System.out.print(Str[i]);
			// System.out.print("\t第"+(i+1)+"名");
			// System.out.println();
			System.out.println(str[i] + "\t第" + (i + 1) + "名");
		}

	}

}
