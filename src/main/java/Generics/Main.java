package Generics;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Object[] nums = createdArr();
        ChangeReplace.changeArr(5, 2, nums);
        ChangeToArray.toArray(nums);


        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange(), new Orange());
        Box<Orange> orangeBox1 = new Box<>(new Orange());

        System.out.println(appleBox.getWeight() + " Weight box with apples");
        appleBox.add(new Apple());
        System.out.println(appleBox.getWeight() + " Weight box with apples");
        System.out.println(orangeBox.getWeight() + " Weight box with oranges");
        orangeBox.add(new Orange());
        System.out.println(orangeBox.getWeight() + " Weight box with oranges");
        System.out.println(appleBox.equalsBox(orangeBox) + " equals weight box with fruits");
        orangeBox1.transit(orangeBox);
        System.out.println(orangeBox.getWeight() + " Transfer fruits form box to another box. Check weigh");
    }


    private static Object[] createdArr() {
        Object[] nums = new Object[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));
        return nums;




    }
}
