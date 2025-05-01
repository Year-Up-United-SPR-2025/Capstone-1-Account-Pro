# Capstone-1-Account-Pro
#About

This is my Capstone Project 1 Account Project.
---
##This Project

Trying to get this working was fun, but also a bit frustrating.
---
###Issues I came across

Some of the issues I came across were trying to read and write from the transactions.csv file. I had to use the BufferedReader and Writer classes to make this work. As you can see, the number of commits I made I have deleted classes or refactored my classes many times. Another issue I encountered was when writing to the CSV, it would erase everything in it, so I created a test file to get around that and test my code there instead of the most important one.

#Issues Screenshots/Code I found Interesting to do

![Transaction class from the ledger](https://github.com/user-attachments/assets/1a7cfeaf-b238-418c-90ea-90892c539c7b)

If I didn't make the Transactions class, everything in the Ledger Class would not work

![Transaction Class](https://github.com/user-attachments/assets/fb4fdcf2-770d-465e-bbc4-256a4859b2d6)

This class contains the Transaction class that stores the info needed to display what is in the ledger

![Reader Writer Time Class](https://github.com/user-attachments/assets/11566fbd-3010-49e4-bd09-8f7668444299)

Figuring out how to display the time was an issue until I learned about the LocalTime statement. You can see this a few times in my code because the way I did it was to add the date and then use the time that is now to create a transaction that was created on my computer. 


![Ledger Screen Showing](https://github.com/user-attachments/assets/232226b0-1f58-4187-a047-1e5a4623fdc7)

The last issue I had was that the way it was displaying information in the terminal required using the trim and split to make that work. I used a website named https://carbon.now.sh/ to show my code in an image, if anyone else wants to use it.

---
####How I did this project

For me personally, I wanted to separate my code into different classes because I wanted my main to be as short and the only thing people need to see is my main and its classes, my other classes, which are longer under the hood. I will say, however, I did get a little lost at first separating my code. At first, I was going to put everything in the main, but I figured out pretty quickly that it would be hard. Another issue I would come across was putting comments in my code, so if I come across an issue, I can fix it quickly, which helped me immensely. 
---
#####Things I used to build my project

I had to use things like W3Schools to understand classes and how they worked, and import that knowledge into my code. IntelliJ is good at importing libraries into your project as soon as you use them, so that was helpful; however, I did learn that you can use import java.io.*; import java.util.*; to import all your library needs, because these take all the libraries and use them together instead of importing lines of code, making it longer. I also used some Stackoverflow to see how debit and credit worked in classes when reading from a file.
---
#Future for this project


I will later try to use this in a website I'm building to showcase all the projects I have done during this bootcamp.
