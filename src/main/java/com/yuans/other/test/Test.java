package com.yuans.other.test;

import com.yuans.other.object.D;
import org.openjdk.jol.info.ClassLayout;
import org.springframework.util.StopWatch;

/**
 * @author ys
 * @create 2022/4/28 13:37:07
 */
public class Test {
    public static void main(String[] args) {
//        long s = 100L * 12 * 30 * 86400;
//        System.out.println(s);
//        a();
//        b();
//        System.out.println(ClassLayout.parseInstance(new MyObject()).toPrintable());
        System.out.println(ClassLayout.parseInstance(new D()).toPrintable());
//        System.out.println(ClassLayout.parseInstance(new D[2]).toPrintable());
    }

    public static void a(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int count = 0;
        for (int i = 0; i < 100000000; i++) {
            count += 1;
        }
        System.out.println(count);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
//        System.out.println(stopWatch.shortSummary());
    }

    public static void b(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Integer count = 0;
        for (int i = 0; i < 100000000; i++) {
            count += 1;
        }
        System.out.println(count);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
//        System.out.println(stopWatch.shortSummary());
    }
}
