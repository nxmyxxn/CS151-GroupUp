# CS151-GroupUp

GroupSchedule
-------------
- **Project title** : Group Up
- **Team #4** : Namyoon Cho, Danilo Makarewycz, Preethi Mohan
- **Proposal Contributions**:   
  Namyoon came up with the idea for the project, wrote operations for each user and formatted the README file.
  Danilo wrote the high-level description of solution, functionality, and previous works.
  Preethi wrote the problems/issue to resolve, and description of assumptions / operating environments / intended usage.
  
- **Code and Report Contributions**:  
  + Namyoon
    - code 
      - intial login/signup page
    - report
      - wrote the state diagram
      - updated state diagram
      - formatted the report into GitHub
  + Danilo
    - code
      - Day/Schedule/User/ErrorPopup/MysqlConn classes and all the exception classes, handled database and execptions
      - Designed and normalized database in MySQL
      - Wrote the MYsqlConn class which contains methods to insert, delete, and query information permanently stored in the database
      - Handled the Model and Controller aspects of the MVC design pattern
      - Formatted and implemented the Singleton design pattern in User
      - Enabled the code to create User and Schedule objects from user inputs and queried data to display in the UI and store in the database
      - Edited default GUI text fields and combo boxes to display queried information
      - Edited the base personal schedule display made by Preethi to dislay time inputs previously saved by a user
      - Edited the base group display made by Preethi to dislay the sum of all time inputs from linked user schedules
      - Edited the combo boxes made by Preethi to display appropriately selectable schedules and groups depending on what type of schedule the user wishes to access  
    - report
      - wrote the class diagram
      - updated the class diagram
      - updated the specifics of the problem statement, existing applications, descriptions, and functionality
  + Preethi  
    - code
      - new/current login and signup pages
      - all main GUI pages such as intial welcome page, login, signup, home page, account page, schedules page, and groups page
      - implemented base editable schedules for the user to check boxes in
      - implemented base uneditable schedules for group schedule
      - implemented GUI for "popup" dialog box that would display if any errors occured when logging in or signing up
      - Handled fetching data from user inputs in a personal schedule upon save, and putting them into a Schedule object
      - designed the primary visuals of all GUI classes
      - created text and passord fields, labels, and buttons for the user to interact with
    - report
      - wrote the sequence diagram and usecase diagram
      - updated the sequence and usecase diagrams
      - updated some sentences in the report

- **Presentation Contributions**:  
  + Namyoon: created the slides, formatted them, wrote some information on them, and wrote few speaker notes  
  + Preethi: edited slides and wrote most speaker notes

- **Problem/issue to resolve**  
  >  People face various difficulties in coordinating schedules for meetings, meetups, and other such events, where viewing everyone's schedule in one place is not usually an option and deciding availability is complicated. Oftentimes, people will simply coordinate over text or mail to share their own availabilities, which can be unorganized without a means of displaying availabilities together. People, mainly students and office workers/coworkers, need a way to ease the process of coordinating schedules and finding available times.   

- **Previous works**  
  > **Already existing websites**
    - Google Calendar [1]
    - When2meet [2]</br></br>
    
  >  **Problems with existing applications**
      -  Google calendar has a shared calendar option, but is mainly meant for workspaces, and events can only be created by the owner. When2meet users can share weekly and multi-day views, but is not appealing to the eye and users cannot easily access their information or other schedules.

 
- **Description of assumptions / operating environments / intended usage**
  >  This application is intended for students and coworkers, where the operating environment to be used is a .jar file and a relational database management system / server that supports SQL code (For the purpose of this project, the RDBMS is simulated using MySQL Workbench. To run this program, it is assumed that the user has MySQL Workbench already downloaded). It is assumed that schedules on this website will only be shared with known or “friended” people; in other words, schedules will not be public.

- **Diagrams**
  [Link to UML diagrams](https://github.com/nxmyxxn/CS151-GroupUp/blob/8f3f47d045004c48dd663e8f9beba15b6ea77914/updated%20diagrams/README.md)

- **Functionality**
  > This application will allow users to create schedules, edit personal schedules, and view group schedules in one place. Creating a personal schedule will involve a user going to a schedule creation page and checking boxes on a table representing their availabilities over a week. Later, the user can view created personal schedules. Creating a group schedule will involve initializing the schedule name and adding user personal schedules. Before adding any users, the group schedule will only show the numerical availability scores from their own schedule. Any users added will add to the availability scores at the corresponding times and days. Added users can also view these schedules, but do not have the option to add users. In addition, on other panels users can see their account information and all panels have a button to log out, which will bring the user back to the initial welcome page. 

- **Operations for each user**  
  > **Student/ Co-workers**  
    - create account
    - log in/ log out
    - create schedule
    - write schedule in the calendar
    - create group
    - view groups they are part of</br></br>
        
     > **Student/ Co worker who owns the schedule**
    - Add member
    - Delete member

- **Solution**  
  When users create groups and display their free time on the calendar, they can see the free time in common, making it easier to make appointments or share schedules with each other.

- **Steps to run the code**
  1. Make sure MySQL and MySQL Workbench are installed and working. 
  2. Run the "IntialWelcomePage.java" file.
  3. Welcome page : There are signup and login buttons. If you have account you can login, if not you can sign up for a new member.
  4. Login : Log in with the information that is registered as a member.
  5. Create Own Schedule : In the Schedules page there is Schedules button. If you click that button, you can make your own schedules.
     Check the checkboxes in the calendar to indicate when you are free.
  4. Create Group : On the Groups page there is Create Group button. If you click that button, you can make your own group and see each other's schedules. 
  5. Edit Your Own Schedule : Check the check boxes for your available times and click the save button.
  6. A Group (Schedule) : Check the common free time of your friends or group users.

- **Snapshot of the running program**
<img width="1440" alt="initialHompage" src="https://github.com/nxmyxxn/CS151-GroupUp/assets/72899436/4664a766-2c4c-4943-8b17-8990ed891171">

<img width="1440" alt="signUp" src="https://github.com/nxmyxxn/CS151-GroupUp/assets/72899436/0641df19-36c4-4bd5-8171-5bbb022ac902">

<img width="1440" alt="home" src="https://github.com/nxmyxxn/CS151-GroupUp/assets/72899436/6496cf2c-2057-4c88-badd-e0109a5acbb0">

<img width="1440" alt="initialHompage" src="https://github.com/nxmyxxn/CS151-GroupUp/assets/72899436/4664a766-2c4c-4943-8b17-8990ed891171">

<img width="1440" alt="logIn" src="https://github.com/nxmyxxn/CS151-GroupUp/assets/72899436/2350d048-fa32-4bf5-b670-0a5720f40b91">

<img width="1440" alt="createPMOschedule" src="https://github.com/nxmyxxn/CS151-GroupUp/assets/72899436/c23f551f-204b-4825-b74c-bd2def4543b7">
<img width="1440" alt="schedulePMO" src="https://github.com/nxmyxxn/CS151-GroupUp/assets/72899436/777976cf-e1cd-40b6-ad17-b01a714cf1ca">

<img width="1440" alt="groups(didnotcreate)" src="https://github.com/nxmyxxn/CS151-GroupUp/assets/72899436/72b70688-e2a0-45ca-8212-145c11ca7ad9">



- **References**
  > - [1] https://calendar.google.com/ 
  > - [2] 8 Degrees, LLC “when2meet” https://www.when2meet.com/.
 
