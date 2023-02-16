/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duyna.mathutil.test.core.test;

import com.duyna.mathutil.core.MathUtility;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author User
 */
public class MathUtilityTest {
    // Kiểm thử ngoại lệ thì sao?
    // tức là hàm getF() đc thiets kế rằng nếu đưa n cà chớn
    // thì hàm phải ném ra ngoại lệ!!
    // tức là getF(-5) thì EXPECTED ==  NGOẠI LỆ ILLEGAL ARGUMENT ERROR
    // Thấy ngoại lệ mừng rớt nước mắt
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        // Test case 5: getF() with a wrong arg n = -5
        // Expected result: An exception is thrown
        MathUtility.getFactorial(-5);
        // Nếu chỉ gõ lệnh trên thì bị màu đỏ 
        // Do lệnh này gây ra Exception >> đỏ
        // Nhưng hàm này mình kì vọng ra exception, nếu có thì đúng như thiết kế
        // Mà đúng như thiết kế thì phải xanh
        // Lỗi của ta là ko đo, so sánh, ko nhận diện là đã có ngoại lệ r
        // Ta cần thêm 1 lệnh đã có ngoại lệ chưa có rồi >> xanh ; chưa >> đỏ
        // JUnit 4 ko dùng hàm Assert() để đo ngoại lệ
        // JUnit 5 thì dùng hàm Assert() để đo ngoại lệ
    }
    
    @Test
    // Trong hàm này sẽ chứa các test case để test getF()
    // với n hợp lệ trong khoảng 0..20
    public void testFactorialGivenRightArgumentReturnsWell(){
        // TEST CASE #1: test getF() with n = 0
        // Expected Value = 1; hy vọng 0! = 1
        int n = 0 ;
        long expectedValue = 1; // hy vọng 0! = 1
        long actualValue = MathUtility.getFactorial(n); // thực tế getF() trả về mấy??
        
        Assert.assertEquals(expectedValue, actualValue);
        // TEST CASE #2: Test getF() with n = 5;
        // Expected Value = 120 hy vọng 5! =120
         Assert.assertEquals(120, MathUtility.getFactorial(5));
         
         // TEST CASE #3: Test getF() with n = 6;
         // Expected Value = 120 hy vọng 6! = 720
         Assert.assertEquals(720, MathUtility.getFactorial(6));
         
         // TEST CASE #4: Test getF() with n = 4;
         // Expected Value = 24 hy vọng 4! = 24
         Assert.assertEquals(24, MathUtility.getFactorial(4));
    }
}
