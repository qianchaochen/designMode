package com.qcc.study.design.facade;

/**
 * @author: qiancc
 * 2017年07月18日
 *
 * 外观模式:
 * 如果没有computer类,那么cpu,memory,disk将两两之间互相持有实例,造成严重的依赖;
 * 修改其中的一个类可能会对其它的类产生影响,这不是我们想要的.
 * 有了computer类后,类与类之间的耦合减少了.这就是外观模式.
 *
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    Computer(){
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void start(){
        System.out.println(getClass().getName() + " start...");
        cpu.start();
        memory.start();
        disk.start();
    }

    public void shutdown(){
        System.out.println(getClass().getName() + " shutdown...");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.shutdown();
    }

}
