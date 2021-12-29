package Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Reflection {

    public static void start(Class<?> c) throws InvocationTargetException, IllegalAccessException {
//        List<Method> after = new ArrayList<>();
//        List<Method> before = new ArrayList<>();
        Method before = null;
        Method after = null;
        Method[] methods = c.getDeclaredMethods();
        List<Method> methodList = new ArrayList<>();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Test.class)) {
                methodList.add(m);
            }
            if (m.isAnnotationPresent(After.class)) {
                if (after != null) {
                    throw new RuntimeException ("No more one AfterSuit");
                }
                after = m;
            }

            if (m.isAnnotationPresent(Before.class)) {
                if (before !=null){
                    throw new RuntimeException ("No more one BeforeSuit");
                }
                before = m;
            }
        }
        methodList.sort((m1, m2) -> m2.getAnnotation(Test.class).priority() - m1.getAnnotation(Test.class).priority());
        if (before != null) {
            methodList.add(0, before);
        }
        if (after != null) {
            methodList.add(after);
        }
        for (Method o :
                methodList) {
            o.invoke(null);
        }
    }
}
