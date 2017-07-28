package com.asiainfo.chapter1.sunmd1.BasicClass_0727.bigDecimal;

import java.math.BigDecimal;

/*
 * 构造方法：
 * 		public BigDecimal(String val)
 * 
 * public BigDecimal add(BigDecimal augend)
 * public BigDecimal subtract(BigDecimal subtrahend)
 * public BigDecimal multiply(BigDecimal multiplicand)
 * public BigDecimal divide(BigDecimal divisor)
 * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
 */
public class BigDecimalDemo {
	
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.12");
		System.out.println("add:"+bd1.subtract(bd2));
		System.out.println("add:"+bd1.multiply(bd2));
		System.out.println("add:"+bd1.divide(bd2));
		System.out.println("add:"+bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP));
	}

}
