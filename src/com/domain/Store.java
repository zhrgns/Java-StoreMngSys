package com.domain;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class Store {
    private String storeName;
    public static Store instanceStore = null;
    public TreeSet<Product> products = new TreeSet<>();
    public int choice;

    // constructor
    private Store() {
    }

    private Store(String storeName) {
        this.storeName = storeName;
    }

    // singleton
    public static Store openStore(String storeName) {
        if (instanceStore == null) {
            instanceStore = new Store(storeName);
            return instanceStore;
        }
        return instanceStore;
    }

    public void menu() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\tMy Store Product Management System\t\t|");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\tSelect From The Following Options:\t\t|");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\t1\tList Notebook");
        System.out.println("\t2\tList Cellphones");
        System.out.println("\t3\tList Brands");
        System.out.println("\t4\tDelete Product By Id");
        System.out.println("\t5\tAdd New Notebook");
        System.out.println("\t6\tAdd New Cellphone");
        System.out.println("\t0\tClose System");
        System.out.println("-----------------------------------------------------------------");
    }

    public void operations() {
        Scanner scan = new Scanner(System.in);
        instanceStore.menu();
        System.out.println("\t\tPlease Enter a Choice");
        while (true) {

            System.out.print("\t\tYour Choice : ");
            choice = scan.nextInt();

            if (choice == 0) {
                scan.close();
                break;
            } else if (choice < 0 || choice > 9) {
                System.out.println("\t\tWrong Choice. Try again between 0 and 9.");
            } else {
                switch (choice) {
                    case 1: // Notebook operations
                        instanceStore.listNotebooks();
                        System.out.println("\t\tTo see menu again enter `9`");
                        break;
                    case 2: // Cellphone operations
                        instanceStore.listCellphones();
                        System.out.println("\t\tTo see menu again enter `9`");
                        break;
                    case 3: // List brands
                        instanceStore.listBrands();
                        System.out.println("\t\tTo see menu again enter `9`");
                        break;
                    case 4: // Delete by Id
                        instanceStore.deleteById();
                        System.out.println("\t\tTo see menu again enter `9`");
                        break;
                    case 5: // Add New Notebook
                        instanceStore.addNewNotebook();
                        System.out.println("\t\tTo see menu again enter `9`");
                        break;
                    case 6: // Add New Cellphone
                        instanceStore.addNewCellphone();
                        System.out.println("\t\tTo see menu again enter `9`");
                        break;
                    case 9: // Menu
                        instanceStore.menu();
                        break;
                    default:
                        System.out.println("There is no such an option. Plase try again. ");
                }
            }
        }
    }

    private void addNewNotebook() {
        try {

            Scanner scan = new Scanner(System.in);
            System.out.print("\t\tEnter product Name: ");
            String pname = scan.nextLine();
            System.out.print("\t\tEnter product price: ");
            int pprice = scan.nextInt();
            System.out.print("\t\tEnter product brandname: ");
            String bname = scan.nextLine();
            System.out.print("\t\tEnter product storage size: ");
            int stsize = scan.nextInt();
            System.out.print("\t\tEnter product screen size: ");
            double ssize = scan.nextDouble();
            System.out.print("\t\tEnter product ram size: ");
            int ram = scan.nextInt();
            scan.close();
            
            Product product = new Notebook(pname, pprice, new Brand(bname), stsize, ssize, ram);
            this.products.add(product);
            System.out.println("New notebook added to store");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
    }

    private void addNewCellphone() {
        try {
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("\t\tEnter product Name: ");
            String pname = scan.nextLine();
            System.out.print("\t\tEnter product price: ");
            int pprice = scan.nextInt();
            System.out.print("\t\tEnter product brandname: ");
            String bname = scan.next();
            System.out.print("\t\tEnter product storage size: ");
            int stsize = scan.nextInt();
            System.out.print("\t\tEnter product screen size: ");
            double ssize = scan.nextDouble();
            System.out.print("\t\tEnter product battery power: ");
            int batterypower = scan.nextInt();
            System.out.print("\t\tEnter product ram size: ");
            int ram = scan.nextInt();
            System.out.print("\t\tEnter product color: ");
            String color = scan.next();
            scan.close();

            Product product = new Cellphone(pname, pprice, new Brand(bname), stsize, ssize, batterypower, ram, color);
            this.products.add(product);
            System.out.println("New cellphone added to store");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
    }

    public void listNotebooks() {
        System.out.println(
                " ------------------------------------------------------------------------------ ");
        System.out.println(
                "| product Id | product Name | price | brand | storage size | screen Size | ram |");
        System.out.println(
                " ------------------------------------------------------------------------------ ");
        for (Product product : products) {
            if (product instanceof Notebook)
                System.out.println(product.toString());
        }
    }

    public void listCellphones() {
        System.out.println(
                " ------------------------------------------------------------------------------------------------------ ");
        System.out.println(
                "| product Id | product Name | price | brand | storage size | screen Size | battery Power | ram | color |");
        System.out.println(
                " ------------------------------------------------------------------------------------------------------ ");
        for (Product product : products) {
            if (product instanceof Cellphone)
                System.out.println(product.toString());
        }
    }

    public void listBrands() {
        System.out.println("\t\tBrands in My Store:");
        for (Brand brand : Product.brandSet) {
            System.out.println("\t\t-" + brand.getBrandName());

        }
    }

    public void addCellphone(String productName, int price, Brand brand, int storageSize, double screenSize,
            int batteryPower, int ram, String color) {

        Product product = new Cellphone(productName, price, brand, storageSize, screenSize, batteryPower, ram, color);
        this.products.add(product);
    }

    public void addNotebook(String productName, int price, Brand brand, int storageSize, double screenSize, int ram) {

        Product product = new Notebook(productName, price, brand, storageSize, screenSize, ram);
        this.products.add(product);
    }

    public void deleteById() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\t\tPlease Enter an ID : ");
        int deletedId = scan.nextInt();
        
        Iterator<Product> iter = products.iterator();
        while (iter.hasNext()) {
            Product item = iter.next();
            if (item.getProductId() == deletedId) {
                // Use iterator to remove this product object.
                iter.remove();
            }
        }
        scan.close();
    }

    // getter setter
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public static Store getInstanceStore() {
        return instanceStore;
    }

    public static void setInstanceStore(Store instanceStore) {
        Store.instanceStore = instanceStore;
    }

    public TreeSet<Product> getProductTypes() {
        return products;
    }

    public void setProductTypes(TreeSet<Product> products) {
        this.products = products;
    }

}
