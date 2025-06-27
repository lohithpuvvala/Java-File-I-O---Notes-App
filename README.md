# Java-File-I-O---Notes-App

Java Notes App
==============

A simple terminal-based Notes Manager using Java File I/O (FileWriter, BufferedReader).
Users can write and view notes directly from the command line, with all notes saved in a persistent text file.

---
Features:
---------
- Write multi-line notes
- View all saved notes
- Notes are saved in 'notes.txt' and persist across sessions
- Simple and clean menu-driven interface
---
How to Run:
-----------
1. Open the terminal in the project root folder.
2. Compile the main class:
   javac src/com/lohithpuvvala/Main.java
3. Run the program:
   java -cp src com.lohithpuvvala.Main
---
Notes File:
-----------
- The file 'notes.txt' is created automatically in the current directory.
- No need to create it manually.


---

### 📁 **Project Structure**

```
NotesApp/
├── src/
│   └── com/
│       └── lohithpuvvala/
│           └── Main.java
├── notes.txt         ← auto-created after first run
└── README.md
```

---

### 💻 **Example Output**

```
==== Notes App ====
1. Write a new note
2. View notes
3. Exit
Enter your choice: 1

Enter your note (type 'END' to finish):
Prepare Java project
Complete Task 4
END

Note saved successfully.

==== Notes App ====
1. Write a new note
2. View notes
3. Exit
Enter your choice: 2

--- Your Notes ---
Prepare Java project
Complete Task 4
```

---
