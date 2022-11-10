package org.example.thrteenOctober;

class ArrayPossibleCombination {
    public static void main(String[] args) {
            System.out.println("1 5 4 6 8 The combination from by the number of elements are: 4");
            int [] a = {1,5,4,6,8};
        System.out.println("The combinations are:");
        System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
        System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[4]);
        System.out.println(a[0]+" "+a[1]+" "+a[3]+" "+a[4]);
        System.out.println(a[0]+" "+a[2]+" "+a[3]+" "+a[4]);
        System.out.println(a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
    }
}
