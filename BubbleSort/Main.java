package com.eastrino;

public class Main {

    public static void main(String[] args) {
        //Инициализация массива
        //int nums[] = new int[10];
        int[] nums = {5, 2, 10, 1, 7, 9, 6, 8, 3, 4};
        int a, b, t;

        //Изначальное состояние массива
        System.out.print("Исходный массив: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            if (i < nums.length-1){
                System.out.print(", ");
            }
        }

        //Сортировака пузырьком
        System.out.println();
        for(a = 1; a < nums.length; a++){
            for(b = nums.length - 1; b >= a; b--){
                if(nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        //Вывод результата
        System.out.print("Отсортированный массив: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            if (i < nums.length-1){
                System.out.print(", ");
            }
        }
    }
}
