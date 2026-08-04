# CS-320 Software Test, Automation, and Quality Assurance

This repository includes my contact service files from Project One and my summary and reflections report from Project Two. These projects helped me practice writing unit tests, checking requirements, and making sure my code worked the way it was supposed to.

## How can I ensure that my code, program, or software is functional and secure?

I can make sure my code is functional by testing both good and bad inputs. In this project, I tested things like null values, duplicate IDs, invalid phone numbers, and fields that were too long. I also checked that contacts could be added, updated, and deleted correctly. To help keep the program secure, I used input validation so bad data could not be stored.

## How do I interpret user needs and incorporate them into a program?

I start by reading the requirements and breaking them into smaller parts. For example, the contact ID could not be null or longer than 10 characters, and the phone number had to be exactly 10 digits. I used those rules to build the program and then wrote tests to make sure each one was followed.

## How do I approach designing software?

I try to keep the design simple and organized. The Contact class stores and checks the contact information, while the ContactService class handles adding, updating, and deleting contacts. I also test the code as I build it so I can catch problems early and make changes before they become bigger issues.
