import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length-1; j++)
            {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;

    }

    public static String[] bubbleSort(String[] array) {
        String temp = "";

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length-1; j++)
            {
                if (array[j].compareToIgnoreCase(array[j+1]) > 0)
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;

    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {

        int temp = 0;

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 0; j < list.size()-1; j++)
            {
                if (list.get(j).compareTo(list.get(j+1)) > 0)
                {
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        return list;

    }

    public static int[] selectionSort(int[] array) {
        int min = array[0];
        int index = 0;
        boolean found = false;
        for (int i = 0; i < array.length; i++)
        {
            found = false;
            min = array[i];
            for (int j = i+1; j < array.length; j++) //use i + 1 so that elements don't get switched with elements behind it
            {
                if (min > array[j]){
                    min = array[j];
                    index = j;
                    found = true;
                }
            }
            if (found) {
                array[index] = array[i];
                array[i] = min;
            }
        }
        return array;
    }

    public static String[] selectionSort(String[] array) {
        String min = array[0];
        int index = 0;
        boolean found = false;
        for (int i = 0; i < array.length; i++)
        {
            found = false;
            min = array[i];
            for (int j = i+1; j < array.length; j++) //use i + 1 so that elements don't get switched with elements behind it
            {
                if (min.compareToIgnoreCase(array[j]) > 0){
                    min = array[j];
                    index = j;
                    found = true;
                }
            }
            if (found) {
                array[index] = array[i];
                array[i] = min;
            }
        }
        return array;

    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {

        String min = list.get(0);
        int index = 0;
        boolean found = false;
        for (int i = 0; i < list.size(); i++)
        {
            found = false;
            min = list.get(i);
            for (int j = i+1; j < list.size(); j++) //use i + 1 so that elements don't get switched with elements behind it
            {
                if (min.compareToIgnoreCase(list.get(j)) > 0){
                    min = list.get(j);
                    index = j;
                    found = true;
                }
            }
            if (found) {
                list.set(index, list.get(i));
                list.set(i, min);
            }
        }
        return list;

    }

}
