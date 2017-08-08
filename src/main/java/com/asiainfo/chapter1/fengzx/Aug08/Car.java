package com.asiainfo.chapter1.fengzx.Aug08;

    /**
     * Created by fengzx on 2017/8/8.
     */
    public class Car {
        private String name;

        public Car() {
        }

        public Car(String name) {
            this.name = name;
        }

        public void start() {
            System.out.println(name + "车启动");
        }

        public void stop() {
            System.out.println(name + "车停止");
        }
    }
