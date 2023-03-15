GroupSchedule
-------------
- **Project title** : Group Up
- **Team #4** : Namyoon Cho, Danilo Makarewycz, Preethi Mohan
- **Team members working on the proposal**:   
Namyoon Cho, Danilo Makarewycz, Preethi Mohan 
- **Problem/issue to resolve**  
  > People face various difficulties in coordinating schedules for meetings, meetups, and other such events, where viewing everyone's schedule in one place is not usually an option and deciding availability is complicated. People, mainly students and office workers/coworkers, need a way to ease the process of coordinating schedules and finding available times.   

- **Previous works**  
  > **Already existing websites**
    - Google Calendar [1]
    - When2meet [2]
  >  **Problems with existing applications**
      - Google calendar has a shared calendar option, but is mainly meant for workspaces, and events can only be created by the owner.
      - When2meet users can share weekly and multi-day views, but cannot share a monthly view. Additionally, users describe availability by available/not available, which leaves less room for personal preference and flexibility.

 
- **Description of assumptions / operating environments / intended usage**
  >  This application is intended for students and coworkers, where the operating environment to be used is a webpage. It is assumed that schedules on this website will only be shared with known or “friended” people; in other words, schedules will not be public.

- **High-level description of solution**  
  > In our solution, we plan to include various functionalities which will allow users to interact and create schedules in varying ways. Primarily, we plan to have three different classes to construct objects, which will be an account, a weekly schedule, and a monthly schedule. The account will include parameters such as name, password, username, and icon. The two schedules will take in the creator’s account as a parameter to allow special privileges; in addition, the monthly schedule will need the current date and the desired month as extra parameters. We plan to make getter and setter methods for the account and schedule objects. The getters will fetch information about the attributes of the objects (such as a user’s account and a person’s availability on a day) and the setters will help edit attributes such as account information and availabilities by specific days and by time. There will be a special setter that will upload a previously created schedule and a special getter to view schedules of friends which can be sharable or not depending on user preference. There will be an additional class for group objects that will hold the accounts of the members of a schedule and an enum type to describe users’ availability on any certain day / time to give a more complete idea of availability preferences. 
When interacting with the program, users will be able to make an account and a schedule, invite others to schedules, select an auto-generated schedule or make their own. Within schedules, users will see who is busy at certain days / times and what day / time is optimal for group meets depending on group availability. 


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
    - chat    
    
   > **Student/ Co worker who owns the schedule**
    - Kick member
    - Add member
  
      
   > **Administrator**
    - find id/pw (getter)
    - report (end-user can block friends who send uncomfortable chat or request friend continuously, while user don’t want to accept)


- **References**
  > - [1] https://calendar.google.com/ 
  > - [2] 8 Degrees, LLC “when2meet” https://www.when2meet.com/.
 
