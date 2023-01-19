package com.main;

import com.domain.Brand;
import com.domain.Store;

public class MainClass {
        public static void main(String[] args) {

                Store myStore = Store.openStore("MY STORE");
                        
                myStore.addCellphone("GALAXY A51", 3199, new Brand("Samsung"), 128, 6.5, 4000, 6, "Black");
                myStore.addCellphone("iPhone 11", 7379, new Brand("Apple"), 64, 6.1, 3046, 6, "Blue");
                myStore.addCellphone("Redmi Note 10", 7379, new Brand("Xiaomi"), 128, 6.5, 4000, 8, "White");
                
                myStore.addNotebook("Matebook 14", 10000, new Brand("Huawei"), 512, 14.0, 16);
                myStore.addNotebook("V14 IGL ", 3699, new Brand("Lenovo"), 1024, 14.0, 8);
                myStore.addNotebook("Tuf Gaming ", 8199, new Brand("Asus"), 2048, 15.6, 32);
                
                
                
                myStore.operations();

        }
}
