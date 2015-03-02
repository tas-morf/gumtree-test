# Gumtree test
This project is the result of a testing exercise provided by Gumtree

## The Main Project

The package hierarchy is loosely based on the MVC paradigm. My opinion is (since every since developer thinks
differently in this matter) that Activities and Fragments are controllers, and then custom Views, Adapters
and another thing I like to call Indicator are the MVC 'Views'. An Indicator is a class that simply manages
UI, and has no business logic in it at all. The idea is that an Activity(or Fragment) will have a reference
to the Model (via a 'Fetcher', or whatever you want the interface for fetching data to be), and the View 
(the Indicator), and will handle all business logic (what happens when a user clicks here or there, what happens when the
data needs to be refreshed, etc), but none of the actual UI (change visibility of views, move views around etc).
That way, it can even be unit tested.
 
## Unit Tests
 
They exist under the src/test folder. Only one unit test is created for now, and it doesn't use Robolectric (just the new 
gradle supported android unit testing framework). Unfortunately I was too late to realise that it is missing
quite a few things compared to Roobolectic, so it's not easy to cover everything completely yet. Still, I think I demonstrated knowledge
of jUnit, Hamcrest and Mockito in there.
 
## Instrumentation Tests

I haven't added any of these, since they require a considerable time investment... I hope the code quality
demonstrated and the unit test will suffice.