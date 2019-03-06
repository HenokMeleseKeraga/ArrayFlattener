package edu.mum.cs.henokMK;

import java.util.Arrays;

public class ArrayFlattener{
	public static void main(String[] args){

		int[][] input={{1,3},{0},{4,5,9}};
		int[] result=ArrayFlattener.flatterArray(input);
		System.out.println(Arrays.toString(result));

	}
	public static int[] flatterArray(int[][] a){
		int len=0;
		for(int n=0;n<a.length;n++){
			len+=a[n].length;
		}

		int[] result= new int[len];
		int k=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				result[k]=a[i][j];
				k++;
			}
		}
   
		return result;
	}

}


