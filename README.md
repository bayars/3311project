# EECS3311 Project 

This project made for term assignment. 

## Components:
Login compenent works with a csv file. The path hard coded in Loginpage class. You can set up with your computer. Basically, I added three lines in csv file. I am adding this file to project file directory. You can copy in your computer. (That would be different in windows and mac.)

Analysis component uses command design pattern. It is taking various parameters for analyse with different analysis method, year, country, chart method and other inputs. The class returns type of chart to add in main menu. 

Fetcher component get data from api.worlddata.org. This data updates every year for many countries. 

The original country list contains all countries but some countries have not any type of data. So, some countries excluded with excludeCountry and excloudeYears with Facade design pattern. You can find these exclusions from json file. 
