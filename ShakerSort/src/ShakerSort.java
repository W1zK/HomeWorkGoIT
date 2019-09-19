public class ShakerSort {
    static int[] pool = {4,8,10,-41,51,75,22,156,0,777};

    private static void cocktailSort(int[] pool) {
        int size = pool.length;
        int x = size - 1;
        boolean swap = true;

        while (swap) {
            swap = false;

            for (int i = x; i > size - 1 - x; i--) { //двигаемся справа налево
                if (pool[i] < pool[i - 1]) {         // если следующий элемент меньше текущего,меняем!
                    // swap
                    int temp = pool[i];
                    pool[i] = pool[i - 1];
                    pool[i - 1] = temp;
                    swap = true;
                }
            }


            for (int i = size - x; i < x; i++) {  //двигаемся слева направо
                if (pool[i] > pool[i + 1]) {      // если текущий элемент больше следующего,меняем!
                    // swap
                    int temp = pool[i];
                    pool[i] = pool[i + 1];
                    pool[i + 1] = temp;
                    swap = true;
                }
            }

            if (!swap){
                break;
            }

        }

    }
    public static void main(String[] args) {
        cocktailSort(pool);
        for (int i = 0; i <pool.length ; i++) {
            System.out.print(pool[i]+" ");
        }
    }
}
