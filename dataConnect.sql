drop database customertrackerdb;

create user customertracker with password="intuit_awesomeness";
create database customertrackerdb with templete=tempete0 owner="customertracker";
\connect customertrackerdb;