VERY IMPORTANT!!! The files that contain the app are stored in the master branch on github.
ST10444102 Christopher Prinsloo https://github.com/10444102/IMAD-PRACTICUM-final.git
1. Initialize the app:
Show the splash screen (app logo or animation).
Wait for a few seconds.
Navigate to the main screen.

3. Main Screen (MainActivity):
Display today's weather information:
Fetch data from an external weather API.
Extract temperature, conditions, and chance of rain.
Update UI components (e.g., TextViews).
Handle user interactions:
next day button:
Increment the day index.
Update UI with data for the next day.
Exit button:
Close the app.

4. Details Screen (DetailActivity):
Display detailed weather information for a selected day:
Initialize UI components (dayTextView, weatherTextView, chanceOfRainTextView).
Get the selected day's data (from an array or database).
Update UI with the day's weather details.

5. Repeat steps 2 and 3 for other days:
Allow users to navigate through different days.
Ensure data consistency and error handling.

6. End of the app:
Handle any cleanup tasks (if needed).
Close the app gracefully.

The purpose of the app is to take the given information about the weather and tell the user what the weather is doing on a particular day. Once the app is started the user is greeted to a landing page in high contrasting colours to avoid confusion, while alos given the option to press one of two button,where one will exit the app and the other will direct them to the second page witch reveals more information about the weather itself. The user will be able to skim through the entire weeks forecast and see the maximum and minimum temperature of each day as they click the button.two more buttons are presented on the second screen being "more details", revealing the third page, and a exit button leading back to the home page. if the user clicks more details, the third page will open up presenting data such as the conditions, cloudy sunny, rainy, as well as the chance of rain and what day the information is displaying. after the user is satisfied with their experience navigating the app, the can press the exit button to exit the app.
