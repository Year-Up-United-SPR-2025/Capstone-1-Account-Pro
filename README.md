# Capstone-1-Account-Pro
#About

This is my Capstone Project 1 Account Project.

##This Project

Trying to get this working was fun but a bit frustrating. It was also fun trying to get this working.

##Issues I came across

Some of the issues I came across were trying to read and write from the transactions.csv file. I had to use the BufferedReader and Writer classes to make this work. As you can see, the number of commits I made I have deleted classes or refactored my classes many times. Another issue I came across was when writing to the CSV, it would erase everything in it, so I created a test file to get around that and test my code there instead of the one that was the most important.

#Issues Screenshots


![Screenshot 2025-04-30 120334](https://github.com/user-attachments/assets/96f1389f-da2b-4c9e-b066-3a6653686fd9) 

If I didn't make the Transactions class, everything in the Ledger Class would not work

![Screenshot 2025-04-30 120434](https://github.com/user-attachments/assets/bd7a8ddb-7cd3-4bde-bb0d-8cd158313087) This class contains the Transaction class that stores the info needed to display what is in the ledger

![Screenshot 2025-04-30 121001](https://github.com/user-attachments/assets/5fbaec85-a5ff-4cb3-bf3e-a561f6bfbc67)Figuring out how to display the time was an issue until I learned about the LocalTime statement You can see this a few times in my code because the way I did it was to add the date and then use the time that is now to create a transaction was created in my computer. 

![Formatted Home Screen 2](https://github.com/user-attachments/assets/8868be17-aef6-436f-b0ec-4d33cfd5b172) The last issue I had was that the way it was displaying information in the terminal had to use the trim and split to make that work. I used a website named https://carbon.now.sh/ to show my code in an image if anyone else wants to use it.


##How I did this project

For me personally, I wanted to separate my code into different classes because I wanted my main to be as short and the only thing people need to see is my main and its classes, my other classes, which are longer under the hood. I will say, however, I did get a little lost at first separating my code. At first, I was going to put everything in the main, but I figured out pretty quickly that it would be hard. Another issue I would come across was putting comments in my code, so if I come across an issue, I can fix it quickly, which helped me immensely. 

##Things I used to build my project

I had to use things like W3Schools to understand classes and how they worked, and import that knowledge into my code. IntelliJ is good at importing libraries into your project as soon as you use them, so that was helpful; however, I did learn that you can use import java.io.*; import java.util.*; to import all your library needs, because these take all the libraries and use them together instead of importing lines of code, making it longer. I also used some Stackoverflow to see how debit and credit worked in classes when reading from a file.

#Future for this project
I will later try to use this in a website I'm building to showcase all the projects I have done during this bootcamp.
