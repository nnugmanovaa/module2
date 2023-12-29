package collection1.task3;

import collection1.task1.Book;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
    List<Author> authors;

    public Bank(List<Author> authors){
        this.authors = authors;
    }
    public Bank(){
        authors =  new ArrayList<>();
    }

    public void depositMoney(String email, Long ammountToBeEneterd){
        if (authors.isEmpty()){
            System.out.println("There is no aunthor that you can deposit money");
        }
        Iterator<Author> iterator = authors.iterator();
        while (iterator.hasNext()){
           Author author = iterator.next();
            if (author.getCustomer().getEmail().equals(email)){
                author.setBalance(author.getBalance() + ammountToBeEneterd);
            }
        }
    }

    public void widthrowMoney(String email, Long ammountToBeWidthdraw){
        if (authors.isEmpty()){
            System.out.println("There is no aunthor that you can deposit money");
        }
        Iterator<Author> iterator = authors.iterator();
        while (iterator.hasNext()){
            Author author = iterator.next();
            if (author.getCustomer().getEmail().equals(email)){
                if( author.getBalance() < ammountToBeWidthdraw){
                    System.out.println("Sorry, but there is no enough money");
                } else {
                    author.setBalance(author.getBalance() - ammountToBeWidthdraw);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "authors=" + authors +
                '}';
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

}
