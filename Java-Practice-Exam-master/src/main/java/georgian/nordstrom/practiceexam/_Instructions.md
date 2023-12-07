# Java Practice Exam
Please note that the following project is purely practice and not associated with Georgian College nor are the contents the actual contents of the final exam. This is more or less a very quick and simple demonstration of your ability and understanding of using API's with Java.

## Project Setup
### Clone the Repository
1. Open Intellij -> File -> New -> Project from Version Control
2. On Github, click the green Code button.
3. Copy the url provided.
4. Paste into the URL into Intellij

## Project Structure
``ApiResponse.java`` The model class used to define the JSON response from the Api<br>
``ApiUtility.java`` A class containing static methods that interface with the Api<br>
``Main.java`` The entrance point of the application. Launches the FXML and Controller classes<br>
``Movie.java`` The model class that defines the properties of a Movie<br>
``MovieController.java`` Controls logic of the movie-view.fxml.<br>
``module-info.java`` Specifies which modules are required and allows access (opens) to your model classes for to third party modules<br>
``movie-view.fxml`` The view containing all the elements the user will interact with<br>

## Instructions
1. ApiResponse.java<br>
   Inside the ApiResponse class I have specified the JSON response. You must create the properties/field variables for your ApiResponse model class using the specified Json. The names of your properties should match the java naming conventions (camelCase). Use the ``SerializedName`` data annotations wherever the names do not match the JSON response.<br>
   <br>2. Movie.java<br>
   Inside the Movie class, create the properties specified for the nested Movie objects inside the JSON response. The names of your properties should match the java naming conventions (camelCase). Use the ``SerializedName`` data annotations wherever the names do not match the JSON response.<br>
   <br>3. ApiUtility.java<br>
   Inside the ApiUtility class I have already defined a static method called getMovies. The method returns an array of Movie objects, and takes one parameter: the search word. It is your job to finish this function by adding the necessary HTTP request/responses and converting them the response into a valid Java class using Gson.<br>
   <br>4. MovieController.java<b[ApiResponse.java](ApiResponse.java)r>
   Inside the MovieController class I (should) have already defined all the necessary FXML items you require to complete the exam. You will need to specify the classes and types for many of these FXML elements yourself. The controller needs to perform several tasks:<br>
   &emsp;&emsp;1. Hide all ImageView, TitleLabel, YearLabel and Warning Label on initialization<br>
   &emsp;&emsp;2. When the user presses the SearchButton, you should perform an API call using the text inside the SearchTextField and fill the TableView with the results<br>
   &emsp;&emsp;3. Update the ResultsLabel with the number of results returned<br>
   &emsp;&emsp;4. When the user clicks on a row (Movie), enable the ImageView, TitleLabel, and YearLabel then initialize their values with the currently selected Movie (on-click listener)<br>
   &emsp;&emsp;5. If the search is invalid or empty, display the ErrorLabel with a useful message.<br>
   &emsp;&emsp;6. The ErrorLabel should be re-hidden when the search is valid.<br>
   <br>5. Create useful comments above each meaningful line of code. Additionally, create Java-doc comments above each function briefly describing the purpose of the function, without reiterating every single line of code.<br>

## Grading
You will be graded mostly on each of the steps you completed, as well as formatting and following best practices such as keeping the access modifier (private/public/static) as private as possible to complete your code. Some functions may require public and or static which is expected and totally fine, but rule of thumb is try to keep everything private unless it needs to be public (use public getters instead). Use standard java conventions for all function names, variables and object references (camelCase). All classes should be in PacalCase.