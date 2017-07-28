package com.asiainfo.chapter1.sunmd1.BasicClass_0727.system.demo_01;
/*
 * System类包含一些有用的类字段和方法。它不能被实例化。 
 * 
 * 方法：
 * 		public static void gc()：运行垃圾回收器。 
 *		public static void exit(int status)
 *		public static long currentTimeMillis()
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */
public class SystemDemo {

	public static void main(String[] args) {
		Person p = Person.getPerson("孙梦迪",10);
		System.out.println(p);
		p = null;//让p不再指定堆内存
		System.gc();
		
	}
}
