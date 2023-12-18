public class JohnsonTrotter {
    public void generatePermute(int N) {
        ModifiedInteger[] permute = new ModifiedInteger[N];//сам массив комбинаций
        int noOfPermutation = 0;
        for (int i = 0; i < N; i++) {
            permute[i] = new ModifiedInteger(i, i + 1, true);//создание первой комбинации
        }
        System.out.print(++noOfPermutation + " ");//номер комбинации
        for (ModifiedInteger element : permute) {
            System.out.print(element.value + ",");//вывод первой комбинации
        }
        System.out.println();
        ModifiedInteger mobile;//мобильный элемент в комбинации
        while ((mobile = largestMobile(permute)) != null) {//пока мобильный элемент в комбинации это
            // наибольший элемент и существует
            swap(mobile, permute);
            reverse(permute, mobile);
            System.out.print(++noOfPermutation + " ");//увеличение номер комбинации
            for (ModifiedInteger element : permute) {
                System.out.print(element.value + ",");//вывод всех оставшихся комбинаций
            }
            System.out.println();
        }
    }
    public void reverse(ModifiedInteger[] sequence, ModifiedInteger largestMobile) {
      for (ModifiedInteger element : sequence) {
          if (element.value > largestMobile.value) {
              element.direction = !element.direction;
          }
      }
    }
    public void swap(ModifiedInteger largestMobileInteger, ModifiedInteger[] sequence) {
        ModifiedInteger temp = largestMobileInteger;
        if (largestMobileInteger.direction) {//если элемент идет влево
            sequence[largestMobileInteger.index] = sequence[largestMobileInteger.index - 1];//перемещаем
            //его влево
            sequence[largestMobileInteger.index - 1] = temp;//предыдущий-предыдущий элемент мы
            //запоминаем. Также соответственно изменяем индексы
            sequence[largestMobileInteger.index].index += 1;
            largestMobileInteger.index -= 1;
        } else {//если элемент идет вправо
            //перемещаем элемент вправо, будущий-будущий элемент запоминаем, изменяем индексы
            // соответственно
            sequence[largestMobileInteger.index] = sequence[largestMobileInteger.index + 1];
            sequence[largestMobileInteger.index + 1] = temp;
            sequence[largestMobileInteger.index].index -= 1;
            largestMobileInteger.index += 1;
        }
    }
    public ModifiedInteger largestMobile(ModifiedInteger[] sequence) {//нахождение наобильшего
        // мобильного элемента
        ModifiedInteger largestMobile = null;
        int count = 0;
        for (ModifiedInteger element : sequence) {//проходимся по числовому ряду
            // если элемент идет влево, и каунтер не равно 0 и значение элемента больше чем значение
            // в ряду под номером каунтера
            if (element.direction && count != 0 && element.value > sequence[count - 1].value) {
                if (largestMobile == null) {//если наибольшего элемента не существует, то присвоем
                    // ему элемент
                    largestMobile = element;
                } else if (largestMobile.value < element.value) {//если же наибольший элемент существует
                    // и его значение меньше чем значение элемента, то элемент становится наибольшим
                    largestMobile = element;
                }
                //если же элемент идет вправо и каунтер меньше чем длина числового ряда и значение
                // элемента больше чем значение в ряду под каунтером
            } else if (!element.direction && count < sequence.length - 1 && element.value > sequence[count + 1].value) {
                if (largestMobile == null) {//если наибольшего элемента не существует, то присвоем
                    // ему элемент
                    largestMobile = element;
                } else if (largestMobile.value < element.value) {//если же наибольший элемент существует
                    // и его значение меньше чем значение элемента, то элемент становится наибольшим
                    largestMobile = element;
                }
            }
            count++;
        }
        return largestMobile;
    }
    public class ModifiedInteger {//элемент числового ряда
        int value;
        int index;
        private boolean direction;
        ModifiedInteger(int index, int value, boolean direction) {
            this.index = index;
            this.value = value;
            this.direction = direction;
        }
        public boolean getDirection() {
            return direction;
        }
        public void setDirection(boolean direction) {
            this.direction = direction;
        }
    }
    public static void main(String[] args)
    {
        JohnsonTrotter test = new JohnsonTrotter();
        test.generatePermute(3);
    }
}