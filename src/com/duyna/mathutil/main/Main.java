/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duyna.mathutil.main;

import com.duyna.mathutil.core.MathUtility;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongArgumentThrowException();
    }
    // Thiết kế của hàng getF() là: chỉ tính n! từ 0..20
    // Nếu đưa n < 0 hoặc n > 20 THÌ HÀM SẼ KO TÍNH, CHỬI BẰNG CÁCH NÉM RA NGOẠI LỆ!!
    // Thực tế hàm getF() có chạy đc như thiết kế hay ko phải test thử, chạy thử mới biết được
    public static void testFactorialGivenWrongArgumentThrowException(){
        //TEST CASE #4: Test getF() with n = -5, wrong argument
        //Expected Value: an exception is thrown
        //               IllegalArgumentException
        System.out.println("Test -5!: expected = IllegalArgumentException is thrown");
        MathUtility.getFactorial(-5);
        
    }

    
    // dan Dev phai co trach nhiem test code cua minh chay dung hay sai 
    // truoc khi lap rap no voi cac class khac de tao chuc nang
    //Ghi chu:
    // co nhieu quy tac dat ten ham cho viec kiem thu ham
    // thuong ten ham se bao ham ngu nghia cua viec kiem thu
    // vi du ham duoi nay se dung de test cac ham tinh giai thua
    public static void testFactorialGivenRightArgumentRunsWell(){
     //test case 1: Test getFactorial with n = 0
     //expected value: 1- hy vong dua n = 0 thi ham tra ve = 1
     int n = 0 ;
     long expectedValue = 1;
     long actualValue = MathUtility.getFactorial(n);
        System.out.println("Test "+ n +"!: expected = "+expectedValue+" | actual: "+ actualValue);
        // test case 2: Test getFactorial() with n = 1
        // Expected Value = 1 - hy vong 1! app tra ve 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test "+ n +"!: expected = "+expectedValue+" | actual: "+ actualValue);
        //Test Case 3: Test getFactorial() with n = 3
        // Expected Value = 6
        System.out.println("Test 3!: expected = 6 | actual: "+ MathUtility.getFactorial(3));
    }
}
