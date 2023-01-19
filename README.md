# Store Management System
This repo includes one of my personal projects written in Java.

- In the main method, it creates an instance of the Store class by calling the "openStore" method.Then it uses the "addCellphone" and "addNotebook" methods of the Store class to add a few products (cellphones and notebooks) to the store. Finally, it calls the "operations" method of the Store class, which allows the user to interact with the product management system via a command-line interface, displaying the menu options and handling the user's choice.

- The Store class is a class that represents a store and it uses the singleton pattern to ensure that only one instance of the store can be created. The class has a TreeSet of Product objects to store products in the store. The class has a number of methods including "menu", "operations", "addNewNotebook", and others. The "menu" method displays a list of options to the user, while the "operations" method prompts the user to select an option and then performs the corresponding action.

- The Product class represents a product. It also implements the Comparable interface so that it can be stored in a TreeSet and be sorted by productName.

- The Product class has a static brandSet property that is a TreeSet of Brand objects, which are pre-populated with a list of brand names in a static block. The Product class has a "checkBrandName" method, which is used to check if a brand name already exists in the brandSet. 

- The Cellphone and Notebook classes are subclasses of the Product class. They differ from each other with their different attributes. 

- The Brand class represents a brand of a product. It also implements the Comparable interface so that it can be stored in a TreeSet and be sorted by brandName.

