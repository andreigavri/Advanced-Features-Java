package com.sda.Practice;

import java.util.*;

public class MainCollections {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        boolean primitiveComparison = x == y;

        Car car = new Car("BMW", "Sport");
        Car car1 = new Car("BMW", "Sport");
        boolean objectComparision = car == car1; //false refernces vary
        boolean objectComparisionUsingEquals = car.equals(car1); //true if the equals methis id implemented in an intuitive way

        System.out.println(" -------------------------------------------------------------------------------");

        List<Car> cars = Arrays.asList(new Car("BMW", "Sport"), new Car("Volvo", "suv"));
        boolean isVolvoInList = cars.contains(new Car("Volvo", "suv")); //true

        System.out.println("---------------------------------------------------------------------------------");

        Set<Car> carsSet = new HashSet<>();

        carsSet.add(new Car("BMW", "Sport"));
        carsSet.add(new Car("Volvo", "suv"));
        boolean isVolvoInSet = carsSet.contains(new Car("Volvo", "suv"));

        System.out.println(isVolvoInSet);
        //true if the hashccode method is implemeented in the Car class false otherwise.

        System.out.println("---------------------------------------------------------------------------------------");

        Integer xInt = 3;

        System.out.println(xInt.compareTo(2)); //1

        System.out.println(xInt.compareTo(3)); //0

        System.out.println(xInt.compareTo(4)); //-1

        System.out.println("----------------------------------------------------------------------------------------");

        Comparator<Integer> intComparator = Comparator.naturalOrder();

        System.out.println(intComparator.compare(1, 2)); // -1

        System.out.println(intComparator.compare(2, 2)); // 0

        System.out.println(intComparator.compare(2, 1)); //1

        System.out.println("--------------------------------------------------------------------------------------------");


        List<User> users = Arrays.asList(new User("Peter", 20), new User("John", 23));

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (int) o1.getName().charAt(0) - (int) o2.getName().charAt(0);
            }
        });

        for (final User user : users) {
            System.out.println(user.getName());

        }

        System.out.println("----------------------------------------------------------------------------------------------------");


        int result = Arrays.binarySearch(new int[]{1, 2, 4, 5, 6}, 5);

        System.out.println(result); // 3

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> ints2 = Arrays.asList(5, 2, 7, 4);

        int result1 = Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 2, 3});

        System.out.println(result1); // 0

        int result2 = Arrays.compare(new int[]{1, 2}, new int[]{1, 2, 3});
        System.out.println(result2); // -1

        int result3 = Arrays.compare(new int[]{3, 1}, new int[]{1, 3});
        System.out.println(result3); // 1

        boolean finalResult = Arrays.equals(new int[]{3, 1}, new int[]{1, 3});
        System.out.println(finalResult); // false

        System.out.println("--------------------------------------------------------------------------------------------");

        int[] original = new int[]{1, 2, 3, 4};
        int[] copiedResult = Arrays.copyOf(original, 3);
        System.out.println(Arrays.toString(copiedResult)); // [1, 2, 3]

        System.out.println("-----------------------------------------------------------------------------------------------");

        int[] intsString = {3, 1, 5, 4, 2};
        Arrays.sort(intsString);
        System.out.println(Arrays.toString(intsString)); //[1, 2, 3, 4, 5]

        System.out.println("---------------------------------------------------------------------------------------------------");

        int resultMis1 = Arrays.mismatch(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        System.out.println(resultMis1); // -1

        int resultMis2 = Arrays.mismatch(new int[]{1, 2, 3}, new int[]{1, 3, 2});
        System.out.println(resultMis2); // 1

        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.println(Arrays.stream(new int[]{1, 2, 3}) // IntStream
                .map(z -> z * 2)
                .sum()); // 12

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        List<String> list = Collections.emptyList();
        Map<String, Integer> map = Collections.emptyMap();
        Set<Object> set = Collections.emptySet();

        //        list.add("2"); // UnsupportedOperationException - collection is immutable

        List<Integer> immutableList = Collections.singletonList(1);
        Map<String, String> immutableMap = Collections.singletonMap("key", "value");
        List<String> mutableList = new ArrayList<>();
        mutableList.add("hi");
        Collections.synchronizedSet(Set.of(1, 2, 3));

        List<String> immutableWordList = Collections.unmodifiableList(mutableList);
        //        immutableWordList.add("boom"); // UnsupportedOperationException

        Integer min = Collections.min(List.of(1, 2, 3));
        Integer max = Collections.max(List.of(1, 2, 3));
        Integer maxWithReverseOrder = Collections.max(List.of(1, 2, 3), Collections.reverseOrder());
        System.out.println(min + " " + max + " " + maxWithReverseOrder); // 1 3 1

        List<Integer> intsRev = new ArrayList<>();
        intsRev.add(1);
        intsRev.add(2);
        intsRev.add(3);
        Collections.reverse(intsRev);
        intsRev.forEach(System.out::println); // 3 2 1

        //        Collections.reverse(List.of(1, 2)); // List.of(...) create immutable collection -> UnsupportedOperationException is thrown
        List<Integer> immutableList2 = List.of(1, 2);
        immutableList2.add(3);
        List<String> words = new LinkedList<>();
        words.add("hi");
        words.add("welcome");
        words.add("hello!");
        Collections.sort(words, Collections.reverseOrder());

        System.out.println(words); // [welcome, hi, hello!]
    }
}

