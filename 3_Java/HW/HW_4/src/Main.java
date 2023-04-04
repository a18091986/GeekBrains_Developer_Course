package src;

import src.Common;

import java.util.LinkedList;

public class Main {
    public static void main (String[] args) {

//        ###########################################Task_1###############################

        LinkedList<Integer> ll_1 = Common.generate_random_linked_list(11, 3, 10);
        System.out.println("Сгенерированный список: " + ll_1);
        Task_1.reverse(ll_1);
        System.out.println("Перевернутый список: " + ll_1 + "\n");

//        ###########################################Task_2###############################

        Queue_from_list ql = new Queue_from_list(Common.generate_random_linked_list(5,10,20));
        System.out.println("Очередь-обертка над связанным списком: ");
        ql.print_queue();
        System.out.println("Помещение элемента в конец очереди: ");
        ql.enqueue(10);
        ql.print_queue();
        System.out.println("Удаление первого элемента очереди с возвращением: ");
        System.out.println(ql.dequeue());
        ql.print_queue();
        System.out.println("Возвращение первого элемента очереди без удаления: ");
        System.out.println(ql.first());
        ql.print_queue();

//        ###########################################Task_3###############################


    }
}
