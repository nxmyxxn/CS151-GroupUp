# CS151-GroupUp

GroupSchedule
-------------
- **Project title** : Group Up
- **Team #4** : Namyoon Cho, Danilo Makarewycz, Preethi Mohan
- **Proposal Contributions**:   
  Namyoon made an idea of pfoject, wrote Operations for each user and formatted the README file.
  Danilo wrote High-level description of solution, Functionality, Previous works.
  Preethi Mohan wrote Problems/issue to resolve, Description of assumptions / operating environments / intended usage.
  
- **Code and Report Contributions**:  
  + Namyoon
    - code 
      -login/signup
    - report
      -wrote the state diagram
      -updated diagrams
      -formatted the report into GitHub
  + Danilo
    - code
      -Day/Schedule/User classes, handle database and execptions
    - report
      -wrote the case diagram
  + Preethi  
    - code
      -all main gui pages such as login/signup/dashboard/schedule 
    - report
      -wrote the sequence diagram and usecase diagram
  
- **Problem/issue to resolve**  
  > People face various difficulties in coordinating schedules for meetings, meetups, and other such events, where viewing everyone's schedule in one place is not usually an option and deciding availability is complicated. People, mainly students and office workers/coworkers, need a way to ease the process of coordinating schedules and finding available times.   

- **Previous works**  
  > **Already existing websites**
    - Google Calendar [1]
    - When2meet [2]
  >  **Problems with existing applications**
      -  Google calendar has a shared calendar option, but is mainly meant for workspaces, and events can only be created by the owner. When2meet users can share weekly and multi-day views, but cannot share a monthly view. Additionally, users describe availability by available/not available, which leaves less room for personal preference and flexibility.

 
- **Description of assumptions / operating environments / intended usage**
  >  This application is intended for students and coworkers, where the operating environment to be used is a webpage. It is assumed that schedules on this website will only be shared with known or “friended” people; in other words, schedules will not be public.

- **Diagrams**
  [Link to UML diagrams](https://github.com/nxmyxxn/CS151-GroupUp/tree/preethiBranch2/diagrams#uml-diagram)

- **Functionality**
  > This application will allow users to view and edit both personal and group schedules in one place. It will allow users to create their own group schedules with other users, where people will be allowed to describe their availability on the selected days on a scale from “no availability” to “completely free.” This will grant users better customization options and can involve users’ flexibility.  An automated group schedule created by the application itself will also exist. Users who utilize this feature will not have to spend extra time looking at schedules and planning available times; available times will be automatically mapped out for a group, increasing time efficiency in terms of scheduling. Additionally, this application will allow users to make both weekly schedules for meetups that are intended to be weekly occurrences and monthly schedules to plan monthly occurrences, major events, and/or inconsistent events.  

- **Operations for each user**  
  > **Student/ Co-workers**  
    - create account
    - log in/ log out
    - make timetable
    - write schedule in the calendar
    - add friend
    - accept/block friend request
        
    
   > **Student/ Co worker who owns the schedule**
    - Kick member
    - Add member
  
      
   > **Administrator**
    - find id/pw (getter)
    - report (end-user can block friends who send uncomfortable chat or request friend continuously, while user don’t want to accept)

- **Solution**  
  When users create groups and display their free time on the calendar, they can see the free time in common, making it easier to make appointments or share schedules with each other.

- **Steps to run the code**
  1. Signup : It is possible only by entering a password that meets the conditions based on the exception code written. 
  2.  Login : Log in with the information that is registered as a member.
  3.  Make a group : 
  4.  Check the free time on the calendar :
  5.  Check the common free time of group users.

- **Snapshot of the running program**
  ![initialWelcomePage](https://user-images.githubusercontent.com/72899436/236298065-8675a9aa-d959-4b65-a372-43dc861b1d68.PNG)
  
  ![home](https://user-images.githubusercontent.com/72899436/236298127-438581eb-c49b-4d99-82da-7cf119cb992a.PNG)
  
  ![SignUp](https://user-images.githubusercontent.com/72899436/236297746-a36c1091-8e20-4bac-97fc-3e48826d1af6.PNG)
  
  ![login](https://user-images.githubusercontent.com/72899436/236297958-73fa85eb-c354-49d6-8ccc-dbbd877425a7.PNG)
  
  ![createScheduleWithCheck](https://user-images.githubusercontent.com/72899436/236298192-df33db90-955b-42c7-81e3-09b6229c189e.PNG)

- **References**
  > - [1] https://calendar.google.com/ 
  > - [2] 8 Degrees, LLC “when2meet” https://www.when2meet.com/.
 
