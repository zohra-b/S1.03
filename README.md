
<p align="center"><h1 align="center">S1.03. Collections</h1></p>

<br>

---

## 📍 Objectives

Become familiar with the handling of Java Collections to know how to use them in subsequent implementations.
---

## 👾 Exercises
### 📌 Level 1 - ex 1
Create a class called Month with an attribute "name" (which will store the name of the month of the year). Add 11 Month objects (each with its own attribute) to an ArrayList, except for the object with the attribute "August". 
Then, insert it into the place corresponding to that month and show that the ArrayList maintains the correct order.
Convert the ArrayList from the previous exercise to a HashSet and make sure that it does not allow duplicates.
Iterate over the list with a for loop and an iterator.

### 📌 Level 1 - ex 2
Create and fill a List<Integer>.
Create a second List<Integer> and insert the elements of the first list in reverse order into the second list.
Use ListIterator objects to read the elements of the first list and insert them into the second.

### 📌 Level 1 - ex 3
Given the file countries.txt (review the resources section) that contains countries and capitals. The program must read the file and save the data in a HashMap<String, String>. 
The program asks for the user's name, and then it must display a country randomly, saved in the HashMap. The user must write the name of the capital of the country in question. If they get it right, they are awarded a point. 
This action is repeated 10 times. Once the capitals of 10 countries have been requested randomly, then the user's name and their score must be saved in a file called classification.txt.

### 📌 Level 2 - ex 1
Create a class called Restaurant with two attributes: name(String) and score(int). Implement the necessary methods so that Restaurant objects with the same name and score cannot be entered into a HashSet created in the main() of the application.
Important :
There can be restaurants with the same name with different scores, but there cannot be restaurants with the same name and the same score.

### 📌 Level 2 - ex 2
Using the class from the previous program, create the necessary implementation so that the objects of the Restaurant class are sorted by name and score in descending order.

### 📌 Level 3 - ex 1
Create an application capable of reading a CSV file. This file has 3 fields: name, surname and ID, for each record. 
The aim is to sort the people read from the file, using their name, surname or ID. You can use the list that you think is most appropriate.

The Person class has 3 attributes: name ; surname ; ID

The main class has the following menu:
1.- Enter person.
2.- Show people sorted by name (A-Z).
3.- Show people sorted by name (Z-A).
4.- Show people sorted by surname (A-Z).
5.- Show people sorted by surname (Z-A).
6.- Show people sorted by ID (1-9).
7.- Show people sorted by ID (9-1).
0.- Exit.

The program should list the people like the following example:
___Name___ ____Surnames___ __NIF__
Andreu Ballestero Llenas 34835767J
Miquel Bayona Font 48743957B
Guillem Capdevila Riu 33957834J
Albert Carbonell Ferrer 77364986R
Ferran Casas Coderch 23047848P
Maria Casellas Fuste 47102244S
Genis Ciutat Vendrell 39718459N

---
## 🚀 Getting Started

### ☑️ Prerequisites

Before getting started with S1.03, ensure your runtime environment meets the following requirements:

- **Programming Language:** Java 23SE
- IntelliJ oir Eclipse IDE


### ⚙️ Installation

Clone the S1.03 repository:
```sh
❯ git clone https://github.com/zohra-b/S1.03
```
