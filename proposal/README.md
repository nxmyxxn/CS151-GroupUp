GroupSchedule
-------------
- **Project title** : GroupSchedule - HELLO!!! (BY Preethi)
- **Team #4** : Namyoon Cho, Danilo Makarewycz, Preethi Mohan
- **Team members working on the proposal**:   
Namyoon Cho, Danilo Makarewycz, Preethi Mohan 
- **Problem/issue to resolve**  
  > People face various difficulties in coordinating schedules for meetings, meetups, and other such events, where viewing everyone's schedule in one place is not usually an option and deciding availability is complicated.    

- **If applicable, briefly survey previous works if any (include references)**  
  > There are several shared schedule applications like "TimeTree", "GoogleCalendar", "Cozi Family Organizer". But Pros ...
 
- **If applicable, describe assumptions / operating environments / intended usage**
  > **Assumptions**   
  This application is intended for 
  **Operating Environments**
  Web
  **Intended Usage**
  Students, Coworkers

- **High-level description of your solution which may include (but is not limited to), your plan and approach.  Be as specific as possible.**  
  > Functionality/Features (perhaps different methods or different classes?) - schedule for at most one week (7 days)
Creating an account
With name, password, username?, icon (of your choice or automatically selected)
Creating a schedule from scratch	
Two methods, one for a weekly schedule and another that is monthly. 
So two types of constructors
Weekly will have no parameters
Monthly will need parameters for the month and year in question. 
A schedule editor, multiple functions
One to select what availability looks like on a certain day (setter)
One to get a person’s availability on a day (getter)
Uploading a schedule user has already created elsewhere
Viewing schedules of people user has “friended”
Option to allow certain schedules to be viewed and others to be hidden
Creating a group
Creating a group schedule with a group
Where automated group schedule creation will come up as a suggestion
Application will automatically create a group schedule
Will show who’s busy at what time (name + icon)
Will automatically find available times for all members of a group and display this
Maybe this will allow you to select a preferred available time (so the availability times will be even narrower?)
An enum type to describe a user’s availability on a certain day, rather than having availability be a Boolean
Leaves room for preference of day.
OOP Concepts to be Used


- **Functionality: describe how your solution tackles the issues**
  > This application will allow users to view both personal and group schedules in one place. It will allow users to create their own group schedules with other users, where people will be allowed to describe their availability on the selected days on a scale from “no availability” to “completely free.” This lets users be more involved in a customization process while simultaneously being able to view their schedules (personal and group schedules to be created) in one place. An automated group schedule created by the application itself will also exist. Users who utilize this feature will not have to spend extra time looking at schedules and planning available times; available times will be automatically mapped out for a group, increasing time efficiency in terms of scheduling. Additionally, this application allows users to make both weekly schedules for meetups that intended to be weekly occurrences and monthly schedules to plan monthly occurrences or major events.  

- **Operations: List operations for each intended user (in list format).  Be precise and specific.**  
  > **Student/ Co-workers**  
    - create account
    - log in/ log out
    - make timetable
    - write schedule in the calendar
    - add friend
    - accept/block friend request
    - chat    
    
   > **Student/ Co worker who owns the schedule**
    - Kick member
    - Add member
  
      
   > **Administrator**
    - find id/pw
    - report (end-user can block friends who send uncomfortable chat or request friend continuously, while user don’t want to accept)


- **(Optional) References: must include citations in content using the format [1], [2], etc.**
