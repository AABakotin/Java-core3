package Annotation;

public class Method {

    @Test(priority = 1)
    public static void met1() {
        System.out.println("met1");
    }


    @Before
    public static void met2() {
        System.out.println("START");
    }

    @Test(priority = 3)
    public static void met3() {
        System.out.println("met3");
    }

    @After
    public static void met4() {
        System.out.println("STOP");
    }

    @Test(priority = 5)
    public static void met5() {
        System.out.println("met5");
    }
//@After
    public static void met6() { System.out.println("met6"); }

    @Test(priority = 7)
    public static void met7() {
        System.out.println("met7");
    }

    @Test(priority = 8)
    public static void met8() {
        System.out.println("met8");
    }

    @Test(priority = 9)
    public static void met9() {
        System.out.println("met9");
    }

    @Test(priority = 6)
    public static void met10() {
        System.out.println("met10");
    }
}
