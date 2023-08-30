package test;

import com.sun.jdi.request.DuplicateRequestException;
import jdk.management.jfr.FlightRecorderMXBean;

public class Libary {
    private String []list;
    private int number = 0;
    public Libary(int size) {
        if(size < 0){
            throw new IllegalArgumentException(" 도서관의 크기는 1보다 작은 값을 넣을 수 없습니다.");
        }
        list = new String[size];
        number = 0;
        for(int i = 0; i<size; i++){
            list[i] = "";
        }
    }

    public void add(String bookName) {
        if(number == list.length){
            throw new IllegalArgumentException("책장이 꽉 찼습니다. 책장을 비워주세요.");
        }
        for (int i = 0; i<list.length; i++){
            if (list[i].equals(bookName)) {
                throw new IllegalArgumentException("[" + bookName + "] 은 이미 있는 책입니다.");
            }
        }

        list[number] = bookName;
        number++;
        System.out.println("[" + bookName + "] 책을 추가 했습니다.");
    }

    public void delete(String bookName) {
        if(number == 0)
            throw new IllegalArgumentException("책장이 비어있어서 삭제가 불가능합니다.");

        for(int i = 0; i<list.length; i++){
            if(bookName.equals(list[i])) {
                list[i] = "";
                for(int j = i; j<list.length-1; j++){
                    list[j] = list[j+1];
                }
                list[list.length-1] = "";
                number--;
                System.out.println(bookName + " 을 지웠습니다.");
                return;
            }
        }
        throw new IllegalArgumentException("없는 [" + bookName + "] 책을 지울 수 없습니다.");
    }

    public void find(String bookName) {
        for(int i = 0; i<list.length; i++){
            if(bookName.equals(list[i])){
                System.out.println("책 검사 결과 : " + bookName);
                return;
            }
        }
        System.out.println("검색 결과가 없습니다.");
    }

    public void findAll() {
        System.out.println("\n 모든 책 출력");
        System.out.println("=====================");
        for(int i = 0; i<list.length; i++){
            if(list[i].equals(""))
                continue;

            System.out.println(i +" : " + list[i]);
        }

        System.out.println("=====================");
    }
}
