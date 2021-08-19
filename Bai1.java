package baitap;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		bai1c();
	}

	private static void bai1a() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap m : ");
		int m = sc.nextInt();
		System.out.println("nhap n : ");
		int n = sc.nextInt();

		int num[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
				num[i][j] = sc.nextInt();
			}
		}
		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(num[i][j] + "\t");
			}
			// sau khi viết xong 1 dòng thi xuống hàng
			System.out.println("\n");
		}
	}

	private static void bai1b() {
		int[] x = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n : ");
		int n = sc.nextInt();
		System.out.println("nhap m : ");
		int m = sc.nextInt();
		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
				a[i][j] = sc.nextInt();
			}
		}
		int ans = 1;
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] % 3 == 0) {
					ans *= a[i][j];
				}
			}
		}
		System.out.println("tich cua cac so chia het cho 3 : " + ans);
	}

	private static void bai1c() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n : ");
		int n = sc.nextInt();
		System.out.println("nhap m : ");
		int m = sc.nextInt();
		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int max = a[i][0];
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
		}
	
	}

}